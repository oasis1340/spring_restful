package com.app.restful.controller;

import lombok.RequiredArgsConstructor;
import org.springdoc.core.service.OpenAPIService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/fetch-data")
public class OpenAPI {
    private final OpenAPIService openAPIService;

    @GetMapping("fetch-data")
    public List<String> fetchData() throws IOException {
        return null;
    }
}
