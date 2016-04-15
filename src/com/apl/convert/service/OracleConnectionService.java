package com.apl.convert.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import com.apl.convert.common.BaseBean;
import com.apl.convert.util.Logger;
import com.apl.convert.util.PropertiesUtil;

public class OracleConnectionService {
	private DataSource mDataSource = null;
	public static Connection conn = null;

	public static String url = "";
	public static String driverName = "";
	public static String username = "";
	public static String password = "";

	private static OracleConnectionService mOracleConnectionService = null;

	public static OracleConnectionService GetInstance() throws ClassNotFoundException, SQLException {
		if (mOracleConnectionService == null) {
			mOracleConnectionService = new OracleConnectionService();
		}
		return mOracleConnectionService;
	}

	private OracleConnectionService() throws ClassNotFoundException, SQLException {
		Properties p = PropertiesUtil.getProperties("config/database_config.properties");
		url = p.getProperty("db_url");
		driverName = p.getProperty("db_driverName");
		username = p.getProperty("db_username");
		password = p.getProperty("db_password");
		Class.forName(driverName);
	}

	/**
	 * 鑾峰彇鏁版嵁搴撹繛鎺�
	 * 
	 * @throws Exception
	 */
	public static Connection GetConnection() {
		try {
			conn = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}// 鑾峰彇杩炴帴
		return conn;
	}
}
