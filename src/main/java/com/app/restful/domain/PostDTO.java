package com.app.restful.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class PostDTO {
    Long id;
    String postTitle;
    String postContent;
    Long postReadCount;
    Long memberId;
    String memberName;
}
