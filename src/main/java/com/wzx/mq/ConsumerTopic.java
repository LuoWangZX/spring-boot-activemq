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
public class ConsumerTopic {
    private static final Logger logger = LoggerFactory.getLogger(ConsumerTopic.class);
    @JmsListener(destination = "wang.zx.topic", containerFactory = "jmsListenerContainerFactoryTopic")
    public void receiveTopic1(String message) {
        logger.info("订阅者1收到消息： ---> {}",message);
    }
    @JmsListener(destination = "wang.zx.topic", containerFactory = "jmsListenerContainerFactoryTopic")
    public void receiveTopic2(String message) {
        logger.info("订阅者2收到消息： ---> {}",message);
    }
    @JmsListener(destination = "wang.zx.topic", containerFactory = "jmsListenerContainerFactoryTopic")
    public void receiveTopic3(String message) {
        logger.info("订阅者3收到消息： ---> {}",message);
    }
}
