package com.apl.convert.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.apl.convert.util.Logger;
import com.apl.convert.service.OracleConnectionService;

public class BaseBean {

	private static Logger logger = Logger.getLogger(BaseBean.class);

	public static List<String> Query(String pSqlString, String[] pParameter) {
		List<String> dataset = new ArrayList<String>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = OracleConnectionService.GetInstance().GetConnection();
			pstmt = conn.prepareStatement(pSqlString, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			if (pParameter != null) {
				for (int i = 1; i <= pParameter.length; i++) {
					pstmt.setString(i, pParameter[i - 1]);
				}
			}
			rs = pstmt.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			int columns = rsmd.getColumnCount();
			if (columns != 0) {
				while (rs.next()) {
					String result = "";
					for (int i = 0; i < columns; i++) {
						result = rs.getString(i + 1);
					}
					dataset.add(result);
				}
			}
		} catch (SQLException e) {
			errHandle(e);
		} catch (ClassNotFoundException e) {
			errHandle(e);
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				logger.error("Database close failed!");
			}
		}
		return dataset;

	}

	public static int insert(String pSqlString, String[] pParameter) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int count = 0;
		try {
			conn = OracleConnectionService.GetInstance().GetConnection();
			pstmt = conn.prepareStatement(pSqlString);
			if (pParameter != null) {
				for (int i = 1; i <= pParameter.length; i++) {
					pstmt.setString(i, pParameter[i - 1]);
				}
			}
			count = pstmt.executeUpdate();
		} catch (ClassNotFoundException e) {
			errHandle(e);
		} catch (SQLException e) {
			errHandle(e);
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				errHandle(e);
			}
		}
		return count;
	}

	public static void errHandle(Exception e) {
		StackTraceElement[] name = e.getStackTrace();
		String message = "";
		for (int i = 0; i < name.length; i++) {
			message = message + "\t" + name[i].toString() + "\n";
		}
		message = message + "Message: " + e.getMessage();
		logger.error(message);
		System.exit(0);
	}
}
