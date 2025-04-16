package com.app.restful.repository;

import com.app.restful.domain.MemberVO;
import com.app.restful.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class MemberDAO {
    private final MemberMapper memberMapper;

//    회원 정보 조회
    public Optional<MemberVO> findById(Long id){
        return memberMapper.select(id);
    }

    public void save(MemberVO memberVO){
        memberMapper.insert(memberVO);
    }

    public void modify(MemberVO memberVO){
        memberMapper.update(memberVO);
    }

    public void withdraw(Long id){
        memberMapper.delete(id);
    }
}
