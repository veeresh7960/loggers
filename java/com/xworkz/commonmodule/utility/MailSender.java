package com.xworkz.commonmodule.utility;

import org.apache.log4j.Logger;

public class MailSender {
	
	static Logger logger;
	
	static {
		logger = Logger.getLogger(MailSender.class);
	}
	public static void main(String[] args) {
		logger.debug("Hello");
		logger.debug("nikunj");
		logger.debug("veeresh");
	}
	public static void demo() {
		logger.trace("trace msg");
		logger.warn("warning");
		logger.info("information");
		logger.debug("debugging");
		logger.fatal("fatal");
		logger.error("error/exception");
	}
	
}
