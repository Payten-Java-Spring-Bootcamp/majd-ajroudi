package com.example.restpractice.controller.response;


import com.example.restpractice.service.Member;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class MemberResponse {

    private String username;
    private Long id;

    public static MemberResponse convertFrom(Member member) {
        return MemberResponse.builder()
                .username(member.getUsername())
                .id(member.getId())
                .build();
    }
}
