package com.apl.convert.mq;

import javax.jms.JMSException;  
import javax.jms.Message;  
import javax.jms.MessageListener;  
import javax.jms.Queue;  
import javax.jms.QueueConnection;  
import javax.jms.QueueReceiver;  
import javax.jms.QueueSession;  
import javax.jms.Session;  
import javax.jms.TextMessage;  
  
import com.ibm.mq.jms.MQQueueConnectionFactory;  
  
  
/**
 * connect directly   
 *
 */
public class MQRecevicer implements MessageListener{  
  
    MQQueueConnectionFactory mcf;  
    QueueConnection qconn;  
    QueueSession session;  
      
    final String HOSTNAME = "127.0.0.1";  
    final int PORT = 1414;  
    final String QUEUEMANAGER_NAME = "test";  
    final String QUEUE_NAME = "test1";
    boolean replyed = false;  
      
    public void openConnection() throws JMSException {  
        mcf = new MQQueueConnectionFactory();  
        mcf.setHostName(HOSTNAME);  
        mcf.setPort(PORT);  
        mcf.setQueueManager(QUEUEMANAGER_NAME);  
        qconn = mcf.createQueueConnection();  
        qconn.start();        
    }  
      
    public void disConnection() throws JMSException {         
        qconn.close();   
    }  
      
    public void recevicerMessage(String reply) throws JMSException, InterruptedException {  
        openConnection();   
        
        session = qconn.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);  
        Queue queue = session.createQueue(QUEUE_NAME);  
        QueueReceiver recevier = session.createReceiver(queue);  
          
        //同步方式接收消息并回复  
//      TextMessage textMessage = (TextMessage) recevier.receive();  
//      System.out.println("接收消息 : " + textMessage.getText() + "  JMSMessage" +textMessage.getJMSMessageID());   
//      Queue responseQueue = (Queue) textMessage.getJMSReplyTo();    
//      if(responseQueue != null){  
//          TextMessage responseMsg = session.createTextMessage();  
//          responseMsg.setJMSCorrelationID(textMessage.getJMSMessageID());  
//          responseMsg.setText("This message is reply from client..."+textMessage.getText());  
//          session.createSender(responseQueue).send(responseMsg);   
//          System.out.println("客户端回复队列："+responseQueue.toString()+"  JMSCorrelation"+responseMsg.getJMSCorrelationID());    
//      }else{  
//          System.out.println("服务端回复队列为空");    
//      }  
          
        //异步方式接收消息并回复  
       recevier.setMessageListener(this);  
        while(!replyed)  
            Thread.sleep(1000);  
           
       // qconn.stop();  
       // recevier.close();  
      //  session.close();  
       // disConnection();  
    }  
      
    public void onMessage(Message message) {  
        try {  
        	System.out.println("ssssssssss");
            String textMessage = ((TextMessage) message).getText();  
            System.out.println("接收消息 : " + textMessage + "  JMSMessage" +message.getJMSMessageID());   
            Queue responseQueue = (Queue) message.getJMSReplyTo();    
            if(responseQueue != null){  
                TextMessage responseMsg = session.createTextMessage();  
                responseMsg.setJMSCorrelationID(message.getJMSMessageID());  
                responseMsg.setText("This message is reply from client："+textMessage);  
                session.createSender(responseQueue).send(responseMsg);   
                System.out.println("客户端回复队列："+responseQueue+"  JMSCorrelation"+responseMsg.getJMSCorrelationID());    
            }else{  
                System.out.println("服务端回复队列为空");    
            }  
              
        } catch (JMSException e) {  
            e.printStackTrace();  
        }finally{  
            replyed = true;  
        }  
    }  
      
    public static void main(String[] args) throws JMSException, InterruptedException {  
       // MQRecevicer mr = new MQRecevicer();  
       // System.out.println("正在接收消息...");  
       /// mr.recevicerMessage("消息已经收到，这是接收端的回复！");  
       // System.out.println("消息接收完毕！");  
    }  
}  