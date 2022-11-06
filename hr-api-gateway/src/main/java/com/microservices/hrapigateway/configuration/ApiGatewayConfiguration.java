package com.microservices.hrapigateway.configuration;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfiguration {

    @Bean
    public RouteLocator configureRoute(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("worker", r -> r.path("/workers/**").uri("lb://HR-WORKER"))
                .route("payment", r -> r.path("/payments/**").uri("lb://HR-PAYROLL"))
                .build();
    }
}
