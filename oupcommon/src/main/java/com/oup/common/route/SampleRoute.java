package com.oup.common.route;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component("springManagedSampleRoute")
@Slf4j
public class SampleRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        interceptFrom("file:*").log(LoggingLevel.INFO, log, "Intercepted :: ${body}");

        // TODO Auto-generated method stub
        from("file:///home/wolverine/SKG-DEV-SPACE/JAVA/camelsbnr/input?move=bup")
        .log(LoggingLevel.INFO,log,"${body}")
        .to("mock:name");
        
    }
    
}
