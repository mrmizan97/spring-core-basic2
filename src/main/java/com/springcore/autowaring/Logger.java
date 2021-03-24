package com.springcore.autowaring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.stereotype.Component;
@Component 
public class Logger {
//	@Autowired
	private ConsoleWriter consoleWriter;
//	@Autowired
	private LogWriter fileWriter;

//	@Autowired
//	public Logger(ConsoleWriter consoleWriter) {
//		super();
//		this.consoleWriter = consoleWriter;
//		this.fileWriter = fileWriter;
//	}

	public LogWriter getConsoleWriter() {
		return consoleWriter;
	}

	@Inject
	public void setConsoleWriter(ConsoleWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}

	public LogWriter getFileWriter() {
		return fileWriter;
	}

	@Inject
	@Named(value = "fileWriter")
	public void setFileWriter(LogWriter fileWriter) {
		this.fileWriter = fileWriter;
	}

	@Override
	public String toString() {
		return "Logger [consoleWriter=" + consoleWriter + ", fileWriter=" + fileWriter + "]";
	}

	public void writeFile(String text) {
		fileWriter.write(text);
	}

	public void consoleWrite(String text) {
		consoleWriter.write(text);
	}

	@PostConstruct
	public void init() {
		System.out.println("Created bean");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Created destroyed");
	}

}
