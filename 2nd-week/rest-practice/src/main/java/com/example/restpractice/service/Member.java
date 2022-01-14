package com.example.restpractice.service;

import com.example.restpractice.repository.MemberEntity;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@Builder
@EqualsAndHashCode
public class Member {

    private String username;
    private Long id;


    MemberEntity convertToMemberEntity() {
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setUsername(getUsername());
        return memberEntity;
    }

    public static Member convertFrom(MemberEntity entity) {
        return Member.builder()
                .username(entity.getUsername())
                .id(entity.getId())
                .build();
    }

}
