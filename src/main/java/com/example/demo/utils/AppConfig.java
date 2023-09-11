package com.example.demo.utils;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "environment")
public class AppConfig {
    private String a = "okay";

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }
}
