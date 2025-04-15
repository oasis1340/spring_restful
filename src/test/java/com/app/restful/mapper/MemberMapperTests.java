package com.app.restful.mapper;

import com.app.restful.repository.MemberDAO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class MemberMapperTests {

    @Autowired
    private MemberDAO memberDAO;

    @Test
    public void memberSelectTest() {
        log.info("{}", memberDAO.findById(1L));
    }
}
