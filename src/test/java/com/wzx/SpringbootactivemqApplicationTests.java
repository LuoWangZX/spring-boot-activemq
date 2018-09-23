package com.wzx;

import com.wzx.mq.Producer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@EnableJms
public class SpringbootactivemqApplicationTests {
	@Autowired
	private Producer producer;
	@Test
	public void contextLoads() {
		producer.sendQueueMessage("Spring boot --- queue");
		producer.sendTopicMessage("spring boot --- topic");
	}
}
