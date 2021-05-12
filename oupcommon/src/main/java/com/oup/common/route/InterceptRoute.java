package com.oup.common.route;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class InterceptRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        // TODO Auto-generated method stub
        interceptFrom("file:*").log(LoggingLevel.INFO, log, "Intercepted :: ${body}");
        
    }
    
}
