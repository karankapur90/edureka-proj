package com.egov.loxanalyticsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class LoxAnalyticsService
{

    public static void main(String[] args)
    {
        SpringApplication.run(LoxAnalyticsService.class, args);
    }

}
