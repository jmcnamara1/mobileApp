package com.appjoelblog.app.ws;


import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MobileAppWsApplicationTests {

	Logger logger = LoggerFactory.getLogger(MobileAppWsApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("the test has run");
	}

}
