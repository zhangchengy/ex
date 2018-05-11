package com.test;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class TestLoggingToFile {

	public static void main(String[] args) throws SecurityException, IOException {
		//日志记录器
		Logger logger = Logger.getLogger("testlogjava");
		//日志处理器
		FileHandler fileHandler = new FileHandler("d:\\testlog.txt",true);
		//需要记录的日志消息
		LogRecord lr = new LogRecord(Level.WARNING, "This is  log.");
		//为处理器设置日志格式：Formatter
		SimpleFormatter sf = new SimpleFormatter();
		fileHandler.setFormatter(sf);
		//注册处理器
		logger.addHandler(fileHandler);
		//记录日志消息
		logger.log(lr);
	}
}