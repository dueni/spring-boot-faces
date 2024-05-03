package com.auth0.samples.bootfaces;

import org.ocpsoft.rewrite.el.ELBeanName;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component(value = "info")
@ELBeanName(value = "info")
public class SystemInfo {
	private static final DateTimeFormatter NOW_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.S");

	public String getJavaVersion() {
		return System.getProperty("java.version");
	}

	public String getJavaHome() {
		return System.getProperty("java.home");
	}

	public String getNow() {
		return LocalDateTime.now().format(NOW_FORMAT);
	}
}
