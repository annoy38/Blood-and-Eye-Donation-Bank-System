package com.apigateway.service.Apigateway.filter;

import com.apigateway.service.Apigateway.JwtUtil.JwtUtilClass;
import com.google.common.net.HttpHeaders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationFilterClass extends AbstractGatewayFilterFactory<AuthenticationFilterClass.Config> {

    @Autowired
    private RouteValidatorClass routeValidatorClass;

    @Autowired
    private JwtUtilClass jwtUtilClass;

    public AuthenticationFilterClass(){
        super(Config.class);
    }

    @Override
    public GatewayFilter apply(Config config) {
        return ((exchange, chain) -> {
            ServerHttpRequest request = null;
            if (routeValidatorClass.isSecure.test(exchange.getRequest())) {
                //header contains token or not
                if (!exchange.getRequest().getHeaders().containsKey(HttpHeaders.AUTHORIZATION)) {
                    throw new RuntimeException("missing authorization header");
                }

                String authHeader = exchange.getRequest().getHeaders().get(HttpHeaders.AUTHORIZATION).get(0);
                if (authHeader != null && authHeader.startsWith("Bearer ")) {
                    authHeader = authHeader.substring(7);
                }
                try {
//                    //REST call to AUTH service
//                    template.getForObject("http://IDENTITY-SERVICE//validate?token" + authHeader, String.class);
                    jwtUtilClass.validateToken(authHeader);

                    request = exchange.getRequest()
                            .mutate().header("loggedInUser", jwtUtilClass.extractUserEmail(authHeader)).build();

                } catch (Exception e) {
                    System.out.println("invalid access...!");
                    throw new RuntimeException("un authorized access to application");
                }
            }
            return chain.filter(exchange.mutate().request(request).build());
        });
    }

    public static class Config{

    }
}
