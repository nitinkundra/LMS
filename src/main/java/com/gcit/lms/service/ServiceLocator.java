package com.gcit.lms.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceLocator {
	
	private static final String SPRING_CONFIG_FILE[] = new String[] {
		"/spring-config-global.xml"
	};

	private static ServiceLocator instance = null;
	private static ApplicationContext appContext  = null; 

	private ServiceLocator(){
		appContext = getAppContext();
	}
	
	public static ServiceLocator getInstance(){
		if (instance == null){
			synchronized (ServiceLocator.class) {
				if (instance == null){
					instance = new ServiceLocator();
				}
			}			
		}
		return instance;
	}

	private static synchronized ApplicationContext getAppContext() {
		if (appContext == null) {
			appContext = new ClassPathXmlApplicationContext(SPRING_CONFIG_FILE);
		}
		return appContext;
	}

	public Object findService(String serviceName) {
		return appContext.getBean(serviceName);
	}

}
