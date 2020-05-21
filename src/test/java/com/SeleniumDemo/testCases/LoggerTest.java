package com.SeleniumDemo.testCases;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;



public class LoggerTest {

	
	private static final Logger logger = LogManager.getLogger(LoggerTest.class);
    @Test
    public void performSomeTask(){
    	logger.trace("We've just greeted the user!");
    	logger.debug("We've just greeted the user!");
    	logger.info("We've just greeted the user!");
    	logger.warn("We've just greeted the user!");
    	logger.error("We've just greeted the user!");
    	logger.fatal("We've just greeted the user!");
     }
}
