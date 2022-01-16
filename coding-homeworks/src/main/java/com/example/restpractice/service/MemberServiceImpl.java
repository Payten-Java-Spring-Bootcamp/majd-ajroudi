package com.example.restpractice.service;

import com.example.restpractice.repository.MemberEntity;

import java.util.List;

public class MemberServiceImpl implements MemberService {
    @Override
    public Long create(Member member) {
        MemberEntity memberEntity = member.convertToMemberEntity();
        return null;
    }

    @Override
    public Member retrieve(Long id) {

        return null;
    }

    @Override
    public List<Member> retrieve() {
        return null;
    }
}
