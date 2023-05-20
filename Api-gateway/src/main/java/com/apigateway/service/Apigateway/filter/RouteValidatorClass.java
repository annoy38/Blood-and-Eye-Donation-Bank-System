package com.apigateway.service.Apigateway.filter;

import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.function.Predicate;

@Component
public class RouteValidatorClass {

    public static final List<String> publicAPIs=List.of(
            "/auth/organization/blood-registration",
            "/auth/organization/eye-registration",
            "/auth/organization/token",
            "/user/bloodusers/**",
            "/api/admin/**"
    );

    public Predicate<ServerHttpRequest> isSecure= request-> publicAPIs.stream()
            .noneMatch(uri-> request.getURI().getPath().contains(uri));
}
