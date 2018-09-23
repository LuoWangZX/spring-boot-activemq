package com.wzx.mq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @author WangZX
 * @create 2018-09-22 9:43
 */
@Component
public class ConsumerQueue {
    private static final Logger logger = LoggerFactory.getLogger(ConsumerQueue.class);
    @JmsListener(destination = "wang.zx.queue", containerFactory = "jmsListenerContainerFactoryQueue")
    public void receiveQueue(String message) {
        logger.info("queue消息 ---> {}",message);
    }
}
