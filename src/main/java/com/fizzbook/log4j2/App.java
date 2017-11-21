package com.fizzbook.log4j2;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 * Logger名称：com.fizzbook.log4j2.App
 * 
 *
 *
 */
public class App {

	static Logger logger = LogManager.getLogger(App.class.getName());

	public static void main(String[] args) {
		// System.out.println( "Hello World!" );
		logger.info(String.format("Logger名称：%s",App.class.getName()));
		logger.info("Hello World!");
		logger.entry();
		logger.error("Did it again!");
		logger.info("我是info信息");
		logger.debug("我是debug信息");
		logger.warn("我是warn信息");
		logger.fatal("我是fatal信息");
		logger.log(Level.DEBUG, "我是debug信息");
		logger.exit();
	}
}
