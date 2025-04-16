package com.app.restful.service;

import com.app.restful.domain.MemberVO;

import java.util.Optional;

public interface MemberService {
//    회원정보 조회
    public Optional<MemberVO> getMemberInfo(Long id);

    public void join(MemberVO memberVO);

    public void edit(MemberVO memberVO);

    public void withdraw(Long id);
}
