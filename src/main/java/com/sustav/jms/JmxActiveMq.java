package com.sustav.jms;

import java.util.Date;

import javax.jms.Connection;
import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.broker.BrokerFactory;
import org.apache.activemq.broker.BrokerService;

public class JmxActiveMq {
    public static void main(String[] args) throws Exception {
        BrokerService broker = BrokerFactory.createBroker("broker:(tcp://localhost:61616)");
        broker.start();
        Connection connection = null;
        try {
            ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory("tcp://localhost" +
                    ":61616");
            connection = activeMQConnectionFactory.createConnection();
            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

            Queue cusQ = session.createQueue("cusQ");
            Topic cusT = session.createTopic("cusT");

            TextMessage textMessage = session.createTextMessage("message was sent at: " + new Date());
            MessageProducer producer = session.createProducer(cusQ);
            producer.send(textMessage);

            MessageConsumer consumer = session.createConsumer(cusQ);
            connection.start();

            TextMessage receive = (TextMessage)consumer.receive();
            System.out.println(receive.getText());
            Thread.sleep(500);
            session.close();

        }finally {
            if (connection != null) {
                connection.stop();
            }
            broker.stop();
        }

    }
}
