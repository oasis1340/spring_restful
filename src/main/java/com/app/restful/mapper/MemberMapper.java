package com.app.restful.mapper;

import com.app.restful.domain.MemberVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.Optional;


@Mapper
public interface MemberMapper {
    public Optional<MemberVO> select(Long id);
}
