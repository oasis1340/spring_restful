package com.app.restful.service;

import com.app.restful.domain.CongestionData;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

@SpringBootTest
@Slf4j
public class OpenAPITests {

    @Autowired
    private OpenAPIService openAPIService;

    @Test
    public List<CongestionData> testOpenAPI() throws IOException, URISyntaxException {
        return openAPIService.fetchData2();
    }
}
