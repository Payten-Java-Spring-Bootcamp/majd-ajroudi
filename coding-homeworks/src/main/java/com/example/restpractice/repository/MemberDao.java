package com.example.restpractice.repository;

import java.util.List;

public interface MemberDao {
    Long save(MemberEntity memberEntity);

    Object retrieve(Long id);

    List<MemberEntity> retrieve();
}
