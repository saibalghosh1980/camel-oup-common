package com.oup.common.policy;

import org.apache.camel.Exchange;
import org.apache.camel.Route;
import org.apache.camel.support.RoutePolicySupport;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component("springManagedOUPCommonRoutePolicy")
@Slf4j
public class OUPCommonRoutePolicy extends RoutePolicySupport{

    @Override
    public void onExchangeBegin(Route route, Exchange exchange) {

        

        log.info("Incoming data::"+exchange.getIn().getBody().toString());

        // noop
    }
    
}
