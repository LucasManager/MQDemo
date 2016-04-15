package com.apl.convert.q2ctowbp;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.apl.convert.configuration.ConvertConfiguration;
import com.apl.convert.exception.DataException;

import net.sf.json.JSONObject;

public class Concat {
	ConvertConfiguration con;
	String head;
	String center;
	StringBuffer content;
	List<Result> results;
	JSONObject resultJson;
	int curRow;

	public Concat(List<Result> results, ConvertConfiguration con) {
		this.content = new StringBuffer();
		this.head = "";
		this.center = "";
		this.results = results;
		this.con = con;
		this.curRow = 1;
	}

	public String concating() {
		// loop Results
		for (int i = 0; i < results.size(); i++) {
			// convert Result to JSONObject
			resultJson = JSONObject.fromObject(results.get(i));
			if (i == 0)
				head = concatHeader();
			center = center.concat(concatCenter(results.get(i)));
		}
		content = new StringBuffer().append(head + center);
		concatFoot();
		return content.toString().trim();
	}

	private String concatHeader() {
		// getHeadInfo
		String[] headProp = con.getHead().split(";");
		for (int i = 0; i < headProp.length; i++) {
			// getRowsInfo
			String options[] = headProp[i].split("-");
			concatRows(options);
		}
		String headTemp = content.toString();
		return headTemp;
	}

	/**
	 * concat the center
	 * 
	 * @param result
	 * @return
	 */
	public String concatCenter(Result result) {
		content = new StringBuffer();
		// get info of row
		String[] centerProp = con.getCenter().split(";");
		for (int i = 0; i < centerProp.length; i++) {
			String options[] = centerProp[i].split("-");
			// judge the necessity of row
			if (isEssentialRow(options, result)) {
				concatRows(options);
			}
			curRow = 1;
		}
		return content.toString();
	}

	/**
	 * concat the foot
	 */
	public void concatFoot() {
		String[] footProp = con.getFoot().split(";");
		for (int i = 0; i < footProp.length; i++) {
			String options[] = footProp[i].split("-");
			concatRows(options);
		}
	}

	/**
	 * judge the necessity of
	 * 
	 * @param option
	 * @param result
	 * @return
	 */
	public boolean isEssentialRow(String[] option, Result result) {
		// 如果是非必填，则检查该行下的必填列是否有值，如果没有值，则该行不显示
		if ("C".equals(option[2])) {
			if ("".equals(getEssentialValue(option[3]))) {
				return false;
			}
		}
		if ("D".equals(option[2])) {
			if ("concat$48".equals(option[3])) {
				concat$48(result, option);
			}
			return false;
		}
		return true;
	}

	/**
	 * concat row function
	 * 
	 * @param options
	 */
	private void concatRows(String[] options) {
		StringBuffer rowContent = new StringBuffer();
		String RECORD_ID = options[0];
		// default number of columns
		int length = Integer.valueOf(options[1]);
		for (int j = 0; j < length; j++) {
			// get rule of column
			String[] colRegs = con.getMappingKey(RECORD_ID + "-" + (j + 1)).split("/");
			// get content of column
			String colContent = getContent(rowContent.toString(), colRegs, options);
			rowContent.append(colContent);
			// if it isnot the last column then combine with ":"
			if (j != length - 1) {
				rowContent.append(":");
			}
		}
		rowContent.append("'");
		content.append(rowContent.toString());
	}

	/**
	 * get content of column
	 * 
	 * @param rowContent
	 * @param colInfo
	 * @param options
	 * @return
	 */
	public String getContent(String rowContent, String[] colInfo, String[] options) {
		String colContent = "";
		if ("C".equals(colInfo[0])) {
			// if the identifying of the column is "C" then the column is
			// constant
			colContent = colInfo[1].equals("%NULL%") ? "" : colInfo[1];
			// "P" is variable
		} else if ("P".equals(colInfo[0])) {
			// the max char number of a column
			int maxChar = Integer.valueOf(colInfo[2]);
			// the max recycable number of the columns
			int maxCol = Integer.valueOf(colInfo[3]);
			// get value of row
			colContent = getEssentialValue(colInfo[1]);
			// if the max recycable number is more than 1 then concat
			// sequentially
			// else substring by the max char number
			if (maxCol > 1) {
				colContent = concatCol(rowContent, colContent, colInfo, options);
			} else {
				colContent = colContent.substring(0, colContent.length() > maxChar ? maxChar : colContent.length());
				// 如果截取后的Content的最后一位为'?'并且倒数第二个字符不为'?'，则要将最后的'?'截取掉
				// 如果最后一个字符不为'?'或者最后两个字符都为'?'则不做更改
				colContent = '?' == colContent.charAt(colContent.length() - 1)
						? ('?' == colContent.charAt(colContent.length() - 2) ? colContent
								: colContent.substring(0, colContent.length() - 1))
						: colContent;
			}
		} else if ("COUNT".equals(colInfo[0])) {
			colContent = "" + (content.toString().split("(?<=[^?]|[?][?])'").length);
		} else if ("Z".equals(colInfo[0])) {
			colContent = con.getMappingKey(getEssentialValue(colInfo[1]));
		}
		return colContent;
	}

	/**
	 * get essential value of the "C" row
	 * 
	 * @param name
	 * @return
	 */
	public String getEssentialValue(String name) {
		return resultJson.getString(name);
	}

	/**
	 * concat column function
	 * 
	 * @param rowContent
	 * @param colContent
	 * @param colInfo
	 * @param options
	 * @return
	 */
	public String concatCol(String rowContent, String colContent, String[] colInfo, String[] options) {
		StringBuffer sb = new StringBuffer();
		// convert content to byte array
		char[] charResult = colContent.toCharArray();
		// the max number of row
		int maxRow = Integer.valueOf(options[options.length - 1]);
		// 每列的最大字节数
		int maxChar = Integer.valueOf(colInfo[2]);
		// 每列的最大循环数
		int maxCol = Integer.valueOf(colInfo[3]);
		// 当前循环行数
		int curCol = 1;
		// if i-- then temp++
		int temp = 0;
		for (int i = 0; i < charResult.length; i++) {
			sb.append(charResult[i]);
			if ((i + 1 + temp)
					% maxChar == 0 /* && i + 1 != charResult.length */) {
				curCol++;
				if (charResult[i] == '?' && charResult[i - 1] != '?') {
					sb.deleteCharAt(sb.length() - 1);
					i--;
					temp++;
				}
				if (curCol > maxCol) {
					if (curRow < maxRow) {
						sb.append("'");
						sb.append(rowContent);
						curCol = 1;
						curRow++;
						continue;
					} else {
						break;
					}
				}
				sb.append(":");
			}
		}
		return sb.toString();
	}

	/**
	 * concat "48" row
	 * 
	 * @param result
	 * @param options
	 */
	public void concat$48(Result result, String[] options) {
		Map<String, Integer> ct = result.getCtnCounts();
		Iterator<String> itera = ct.keySet().iterator();
		while (itera.hasNext()) {
			String equipment = itera.next();
			result.setCurrentCtn(equipment);
			result.setCurrentCtnQty(ct.get(equipment));
			resultJson = JSONObject.fromObject(result);
			concatRows("48-9-M-99".split("-"));
		}
	}

}
