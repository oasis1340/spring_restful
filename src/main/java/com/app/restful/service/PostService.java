package com.app.restful.service;

import com.app.restful.domain.PostDTO;
import com.app.restful.domain.PostVO;

import java.util.List;
import java.util.Optional;

public interface PostService {
    
//    게시글 전체 조회
    public List<PostDTO> getPosts();
//    게시글 1개 조회
    public Optional<PostDTO> getPost(Long id);

    public void write(PostVO postVO);

    public void modify(PostVO postVO);

    public void remove(Long id);

    public void removeAll(Long memberId);

}
