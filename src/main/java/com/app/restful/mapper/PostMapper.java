package com.app.restful.mapper;

import com.app.restful.domain.PostDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface PostMapper {
    public List<PostDTO> selectAll();

}
