package com.apl.convert.q2ctowbp;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.JAXBException;

import com.apl.convert.common.BaseBean;
import com.apl.convert.configuration.ConvertConfiguration;
import com.apl.convert.entity.SendBookingBLRequestMsg;
import com.apl.convert.exception.DataException;
import com.apl.convert.exception.HandleException;
import com.apl.convert.util.FileUtil;
import com.apl.convert.util.JaxbUtil;
import com.apl.convert.util.Logger;

public class Convert {
	private static Logger logger = Logger.getLogger(Convert.class);

	String content;
	ConvertConfiguration con;
	List<Result> results;
	int sumFile;
	int succFile;
	int errFile;

	public Convert() {
		con = new ConvertConfiguration();
		results = new ArrayList<Result>();
		content = "";
	}
	
	
	
	public void execute() {
		logger.info("\tConvert: start!");
		sumFile = 0;
		succFile = 0;
		errFile = 0;
		// get folder path
		String xmlPath = con.getInputPath();
		String backPath = con.getBackupPath();
		String outPath = con.getOutPath();
		String errPath = con.getErrorPath();
		// Read file in Folder
		File[] files = FileUtil.tolistFiles(xmlPath);
		sumFile = files.length;
		logger.info("\tConvert: Total file quantity：" + files.length);
		if (files.length < 1) {
			logger.info("\tConvert: Folder is empty !");
		} else {
			for (File file : files) {
				try {
					results.clear();
					FileUtil.fileChannelCopy(file.toString(), backPath + file.getName()); // backup
					logger.info("\tConvert: File: " + file.getName() + " Backup successfully!");
					String xml = new String(FileUtil.toByteArray2(file.toString()), "UTF-8");
					xml = xml.replaceAll("&", "&amp;");
					// convert to java
					SendBookingBLRequestMsg root = JaxbUtil.convertToJavaBean(xml, SendBookingBLRequestMsg.class);
					Resolve resolve = new Resolve(root);
					// parsing the root
					results = resolve.resolving(results);
					logger.info("\tConvert: File: " + file.getName() + " resolved successfully !");
					Concat concat = new Concat(results, con);
					// concating
					content = concat.concating();
					String newFile = "csss-" + file.getName().replace(".xml", ".edi");
					// export file
					FileUtil.writeFile(content, outPath + newFile);
					succFile++;
					logger.info("\tConvert: File: " + file.getName() + "converted successfully! created edi file: " + newFile);
				} catch (DataException e) {
					HandleException.handle(con, file, e.toString());
				} catch (UnsupportedEncodingException e) {
					HandleException.handle(con, file, e.toString());
				} catch (IOException e) {
					HandleException.handle(con, file, e.toString());
				} catch (JAXBException e) {
					HandleException.handle(con, file, "parsing xml error ! " + e.toString());
				} finally {
					try {
						FileUtil.delFile(file.toString());
					} catch (IOException e) {
						HandleException.handle(con, file, e.toString());
					}
				}
			}
			logger.info("\tConvert: success! \r\n\tTotal file quantity: " + sumFile + "\r\n\tsuccessful file quantity: "
					+ succFile + "\r\n\terror file quantity: " + (sumFile - succFile));
			saveLog();
		}
	}
	
	
	/**
	 * save convert log
	 */
	private void saveLog() {
		String sql = "insert into t_traffic_convert_daily_log(id,log_date,file_quantity,err_file_quantity,modules)"
				+ "values(SEQ_T_DAILY_LOG.nextval,sysdate,?,?,?)";
		String[] param = new String[3];
		param[0] = sumFile + "";
		param[1] = sumFile - succFile + "";
		param[2] = "CONVERT";
		try {
			int update = BaseBean.insert(sql, param);
			if (update != 1) {
				logger.error("insert table t_traffic_convert_daily_log fail");
			}
		} catch (Exception e) {
			logger.error("insert table t_traffic_convert_daily_log fail :" + e.getMessage());
		}
	}

}
