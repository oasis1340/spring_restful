package com.app.restful.mapper;

import com.app.restful.domain.PostVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class PostMapperTests {

    @Autowired
    private PostMapper postMapper;

    @Test
    public void insertTest() {}

    @Test
    public void updateTest() {
        PostVO postVO = new PostVO();
        postVO.setId(5L);
        postVO.setPostTitle("무한~");
        postVO.setPostContent("무야호~");
        postMapper.update(postVO);
    }

    @Test
    public void deleteTest() {
        postMapper.delete(50L);
    }

    @Test
    public void deleteAllTest() {
        postMapper.deleteAll(5L);
    }
}
