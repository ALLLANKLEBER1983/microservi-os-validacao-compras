package com.workercompras.config;

import feign.Logger;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfiguration {

    public Logger.Level feignLoggerLever(){
        return Logger.Level.HEADERS;
    }
}
