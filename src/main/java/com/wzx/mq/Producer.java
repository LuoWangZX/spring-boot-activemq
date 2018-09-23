package com.wzx.mq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import javax.jms.Queue;
import javax.jms.Topic;

/**
 * @author WangZX
 * @create 2018-09-22 9:35
 */
@Service
public class Producer {
    @Autowired
    private JmsTemplate jmsTemplate;
    @Autowired
    private Queue queue;
    @Autowired
    private Topic topic;

    public void sendQueueMessage(String message) {
        jmsTemplate.convertAndSend(queue,message);
    }

    public void sendTopicMessage(String message) {
        jmsTemplate.convertAndSend(topic,message);
    }

}
