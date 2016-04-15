/**
 * 读取保存配置文件
 */
package com.apl.convert.configuration;


import java.util.Properties;

import com.apl.convert.util.PropertiesUtil;
import com.ibm.disthub2.impl.formats.Envelop.Constants.propertyKeys_type;

public class MqConfiguration {
	private Properties folderProp;
	private Properties filterProp;
	private Properties filterDataProp;
	private String inputPath;
	private String blno;
	private String actionSource;
	private String bookingOffice;
	private String office;
	
	public MqConfiguration(){
		folderProp = PropertiesUtil.getProperties("config/folder_config.properties");
		filterProp = PropertiesUtil.getProperties("config/filter_config.properties");
		filterDataProp = PropertiesUtil.getProperties("config/filter_data.properties");
		inputPath = folderProp.getProperty("xml.path");
		blno = filterProp.getProperty("blno");
		actionSource = filterProp.getProperty("actionSource");
		bookingOffice = filterProp.getProperty("bookingOffice");
		office = filterDataProp.getProperty("office");
	}

	
	public Properties getFolderProp() {
		return folderProp;
	}

	public void setFolderProp(Properties folderProp) {
		this.folderProp = folderProp;
	}

	public Properties getFilterProp() {
		return filterProp;
	}

	public void setFilterProp(Properties filterProp) {
		this.filterProp = filterProp;
	}

	public Properties getFilterDataProp() {
		return filterDataProp;
	}

	public void setFilterDataProp(Properties filterDataProp) {
		this.filterDataProp = filterDataProp;
	}

	public String getInputPath() {
		return inputPath;
	}

	public void setInputPath(String inputPath) {
		this.inputPath = inputPath;
	}

	public String getBlno() {
		return blno;
	}

	public void setBlno(String blno) {
		this.blno = blno;
	}

	public String getActionSource() {
		return actionSource;
	}

	public void setActionSource(String actionSource) {
		this.actionSource = actionSource;
	}

	public String getBookingOffice() {
		return bookingOffice;
	}

	public void setBookingOffice(String bookingOffice) {
		this.bookingOffice = bookingOffice;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

}
