package com.apl.convert.mq;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.jms.BytesMessage;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.dom4j.DocumentException;

import com.apl.convert.configuration.MqConfiguration;
import com.apl.convert.q2ctowbp.Convert;
import com.apl.convert.util.FileUtil;
import com.apl.convert.util.Logger;
import com.apl.convert.util.XmlUtil;

public class ConsumerMessageListener implements MessageListener {
	private static Logger logger = Logger.getLogger(ConsumerMessageListener.class);

	public void onMessage(Message message) {
		// 这里我们知道生产者发送的就是一个纯文本消息，所以这里可以直接进行强制转换
		String content = null;
		if (message instanceof BytesMessage) {
			BytesMessage bm = (BytesMessage) message;
			byte[] bys = null;
			try {
				bys = new byte[(int) bm.getBodyLength()];
				bm.readBytes(bys);
				content = new String(bys);
			} catch (JMSException e) {
				e.printStackTrace();
			}
		} else {
			TextMessage bm = (TextMessage) message;
			try {
				content = bm.getText();
			} catch (JMSException e) {
				e.printStackTrace();
			}
		}
		logger.info("\tMQ: receive Message!");
		MqConfiguration con = new MqConfiguration();
		String result = HandleMessage.handle(con, content);
		// if (null != newFile && !"".equals(newFile)){
		try {
			content = XmlUtil.formatXml(content);
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if ("OK".equals(result.substring(0, 2))) {
			FileUtil.writeFile(content, result.substring(2, result.length()));
			logger.info("\tMQ: validate successfully ! create file: " + result.substring(2, result.length()));
		} else {
			logger.info("\tMQ: Invalid content! reason: " + result);
		}
	}
	
	
	

}
