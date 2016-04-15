package com.apl.convert.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileUtil {

	/**
	 * Getting all file in folder
	 * 
	 * @param filename
	 * @return
	 * @throws IOException
	 */
	public static File[] tolistFiles(String filePath) {
		File file = new File(filePath);
		File[] files = file.listFiles();
		return files;
	}

	/**
	 * Copying the file by channel
	 * 
	 * @param source
	 *            file
	 * @param targe
	 *            file
	 * @throws IOException
	 * @throws HandleFileException
	 */
	public static void fileChannelCopy(String source, String target) throws IOException {
		File sourceFile = new File(source);
		File targetFile = new File(target);
		FileInputStream fi = null;
		FileOutputStream fo = null;
		FileChannel in = null;
		FileChannel out = null;
		try {
			fi = new FileInputStream(sourceFile);
			fo = new FileOutputStream(targetFile);
			// get channel
			in = fi.getChannel();
			out = fo.getChannel();
			// copying
			in.transferTo(0, in.size(), out);
		} catch (IOException e) {
			throw e;
		} finally {
			try {
				fi.close();
				in.close();
				fo.close();
				out.close();
			} catch (IOException e) {
				throw e;
			}
		}
	}

	/**
	 * Reading file content by line
	 * 
	 * @param filePath
	 * @return file content
	 * @throws IOException
	 */
	public static String readFileByLine(String filePath) throws IOException {
		String resultString = "";
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(filePath));
			String tempStr;
			while ((tempStr = reader.readLine()) != null) {
				resultString += tempStr;
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return resultString;
	}

	/**
	 * Writing new file
	 * 
	 * @param content
	 * @param targetPath
	 */
	public static void writeFile(String content, String targetPath) {
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(new File(targetPath));
			fileWriter.write(content);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Delete the file
	 * 
	 * @param filePath
	 * @throws IOException
	 */
	public static void delFile(String filePath) throws IOException {
		File file = new File(filePath);
		boolean result = file.delete();
		if (!result) {
			throw new IOException("delete file failed!");
		}
	}

	/**
	 * Reading by byte
	 * 
	 * @param filePath
	 * @return
	 * @throws IOException
	 */
	public static byte[] toByteArray2(String filePath) throws IOException {

		File f = new File(filePath);
		if (!f.exists()) {
			return null;
		}

		FileChannel channel = null;
		FileInputStream fs = null;
		try {
			fs = new FileInputStream(f);
			channel = fs.getChannel();
			ByteBuffer byteBuffer = ByteBuffer.allocate((int) channel.size());
			while ((channel.read(byteBuffer)) > 0) {
			}
			return byteBuffer.array();
		} catch (IOException e) {
			throw e;
		} finally {
			try {
				channel.close();
				fs.close();
			} catch (IOException e) {
				throw e;
			}
		}
	}
}