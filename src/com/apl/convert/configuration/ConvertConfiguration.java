
package com.apl.convert.configuration;


import java.util.Properties;

import com.apl.convert.util.PropertiesUtil;

public class ConvertConfiguration {
	private Properties folderProp;
	private Properties regexProp;
	private Properties mappingProp;
	private String inputPath;
	private String backupPath;
	private String errorPath;
	private String outPath;
	private String head;
	private String center;
	private String foot;
	
	public ConvertConfiguration(){
		folderProp = PropertiesUtil.getProperties("config/folder_config.properties");
		regexProp = PropertiesUtil.getProperties("config/row_config.properties");
		mappingProp = PropertiesUtil.getProperties("config/column_config.properties");
		inputPath = folderProp.getProperty("xml.path");
		backupPath = folderProp.getProperty("backup.path");
		errorPath = folderProp.getProperty("error.path");
		outPath=folderProp.getProperty("ouput.path");
		head = regexProp.getProperty("head");
		center = regexProp.getProperty("center");
		foot = regexProp.getProperty("foot");
	}
	
	public String getMappingKey(String propkey){
		return mappingProp.getProperty(propkey);
	}
	
	public Properties getFolderProp() {
		return folderProp;
	}

	public void setFolderProp(Properties folderProp) {
		this.folderProp = folderProp;
	}

	public Properties getRegexProp() {
		return regexProp;
	}

	public void setRegexProp(Properties regexProp) {
		this.regexProp = regexProp;
	}

	public Properties getMappingProp() {
		return mappingProp;
	}

	public void setMappingProp(Properties mappingProp) {
		this.mappingProp = mappingProp;
	}

	public String getInputPath() {
		return inputPath;
	}

	public void setInputPath(String inputPath) {
		this.inputPath = inputPath;
	}

	public String getBackupPath() {
		return backupPath;
	}

	public void setBackupPath(String backupPath) {
		this.backupPath = backupPath;
	}

	public String getErrorPath() {
		return errorPath;
	}

	public void setErrorPath(String errorPath) {
		this.errorPath = errorPath;
	}

	public String getHead() {
		return head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	public String getCenter() {
		return center;
	}

	public void setCenter(String center) {
		this.center = center;
	}

	public String getFoot() {
		return foot;
	}

	public void setFoot(String foot) {
		this.foot = foot;
	}

	public String getOutPath() {
		return outPath;
	}

	public void setOutPath(String outPath) {
		this.outPath = outPath;
	}
}
