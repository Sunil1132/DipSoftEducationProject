package com.educationproject.adapter.logger;

public interface Logger {
	int DEBUG = 0;
	int INFO = 0;
	int ERROR = 0;

	public void init() throws Exception;

	public void shutDown() throws Exception;

	public void writeLog(int logType, String msg) throws Exception;

}
