package com.jenkins.jenkins_demo;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class JenkinsDemoApplicationTests {

    public static Logger logger = (Logger) LoggerFactory.getLogger(JenkinsDemoApplicationTests.class);

    @Test
    void contextLoads() {
        logger.info("Test case executing ...");
        assertEquals(true, true);
    }

}
