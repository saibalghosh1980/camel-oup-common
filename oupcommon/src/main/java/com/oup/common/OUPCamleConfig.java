package com.oup.common;

import org.apache.camel.CamelContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OUPCamleConfig {
    @Autowired
    private CamelContext camelContext;
    
}
