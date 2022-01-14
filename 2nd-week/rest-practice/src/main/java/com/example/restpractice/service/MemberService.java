package com.example.restpractice.service;

import java.util.List;

public interface MemberService {
    Long create(Member member);

    Member retrieve(Long id);

    List<Member> retrieve();

}
