package com.auth0.samples.bootfaces;

import org.ocpsoft.rewrite.el.ELBeanName;
import org.springframework.stereotype.Component;

@Component(value = "info")
@ELBeanName(value = "info")
public class SystemInfo {

	public String getJavaVersion() {
		return System.getProperty("java.version");
	}

	public String getJavaHome() {
		return System.getProperty("java.home");
	}
}
