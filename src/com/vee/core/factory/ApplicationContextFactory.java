package com.vee.core.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextFactory {

    private static ApplicationContext applicationContext;
    
    private ApplicationContextFactory() {
    }

    public static ApplicationContext getInstance(){
        if(applicationContext == null){
            applicationContext = new ClassPathXmlApplicationContext("resource/spring/application-context.xml");
        }
        return applicationContext;
    }
    
}
