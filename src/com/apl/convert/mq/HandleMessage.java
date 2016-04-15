package com.apl.convert.mq;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import com.apl.convert.configuration.MqConfiguration;

public class HandleMessage {
	private static String[] regex = new String[2];

	public static String handle(MqConfiguration con, String message) {
		// if (!filterActionSource(message))
		if ("BL".equals(filterActionSource(con, message)))
			return "ActionSource is BL. BLNO: " + getBlno(con, message);
		if (!"OK".equals(filterBookingOffice(con, message)))
			// return null;
			return "Booking Office is " + filterBookingOffice(con, message) + ". BLNO: " + getBlno(con, message);
		String newFile = concatNewFile(con, message);
		return "OK" + newFile;
	}

	private static String filterActionSource(MqConfiguration con, String message) {
		// private static Boolean filterActionSource(String message) {
		regex[0] = con.getActionSource().split("&&&")[0];
		regex[1] = con.getActionSource().split("&&&")[1];
		String actionSource = message.substring(message.indexOf(regex[0]) + regex[0].length(),
				message.indexOf(regex[1]));
		if ("BL".equals(actionSource))
			// return false;
			return "BL";
		// return true;
		return "BK";
	}

	// private static Boolean filterBookingOffice(String message)
	private static String filterBookingOffice(MqConfiguration con, String message) {
		String[] offices = con.getOffice().split(";");
		regex[0] = con.getBookingOffice().split("&&&")[0];
		regex[1] = con.getBookingOffice().split("&&&")[1];
		String bookingOffice = message.substring(message.indexOf(regex[0]) + regex[0].length() + 4,
				message.indexOf(regex[1]));
		for (String office : offices) {
			if (office.equals(bookingOffice))
				// return true;
				return "OK";
		}
		// return false;
		return bookingOffice;
	}

	private static String concatNewFile(MqConfiguration con, String message) {
		regex[0] = con.getBlno().split("&&&")[0];
		regex[1] = con.getBlno().split("&&&")[1];
		String blno = message.substring(message.indexOf(regex[0]) + regex[0].length(), message.indexOf(regex[1]));
		String newPath = con.getInputPath();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		String newFile = newPath + sdf.format(new Date()) + "-" + blno + ".xml";
		return newFile;
	}

	private static String getBlno(MqConfiguration con, String message) {
		regex[0] = con.getBlno().split("&&&")[0];
		regex[1] = con.getBlno().split("&&&")[1];
		String blno = message.substring(message.indexOf(regex[0]) + regex[0].length(), message.indexOf(regex[1]));
		return blno;
	}
}
