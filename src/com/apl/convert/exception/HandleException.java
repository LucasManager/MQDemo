package com.apl.convert.exception;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.Logger;

import com.apl.convert.common.BaseBean;
import com.apl.convert.configuration.ConvertConfiguration;
import com.apl.convert.util.FileUtil;

public class HandleException{
	private static Logger logger = Logger.getLogger(HandleException.class);
	
	public static void handle(ConvertConfiguration con,File file,String message){
		logger.error("\tFile: " + file.getName() + "\r\n\tMessage: " + message);
		saveErrorlog(file.getName(), message);
		moveToError(file,con.getErrorPath() + file.getName());
	}
	
	private static void moveToError(File file, String target) {
		try {
			FileUtil.fileChannelCopy(file.toString(), target);
		} catch (IOException e) {
			logger.error("File： " + file.getName() + "moving to error folder failed , pls check backup");
		}
	}

	private static void saveErrorlog(String filename, String log) {
		String sql = "insert into T_TRAFFIC_CONVERT_ERROR_LOG(ID,CREATE_DATE,MODULES,ERROR_DESC,ERROR_FILE_NAME) "
				+ "values(SEQ_T_ERROR_LOG.nextval,SYSDATE,'CONVERT',?,?)";
		String[] parm = new String[2];
		parm[0] = log;
		parm[1] = filename;
		BaseBean.insert(sql, parm);
	}
}
