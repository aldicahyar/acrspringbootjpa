package com.juaracoding.acrspringbootjpa.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author aldic  a.k.a Aldi Cahya Ramadhan
Java Developer
Created on 17/02/2023 21:14
@Last Modified 17/02/2023 21:14
Version 1.1
*/
@Configuration
@PropertySource("classpath:other.properties")
public class OtherConfig {

    private static String flagLogging;//additionForLogging

    public static String getFlagLogging() {
        return flagLogging;
    }

    @Value("${flag.logging}")
    private void setFlagLogging(String flagLogging) {
        this.flagLogging = flagLogging;
    }

}
