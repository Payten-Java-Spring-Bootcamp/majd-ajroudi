package com.example.restpractice.controller.request;

import com.example.restpractice.service.Member;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

@Getter
@Setter
@Builder
public class MemberRequest {

    @NotNull
    private String username;

    public Member convertToMember() {
        return Member.builder()
                .username(getUsername())
                .build();
    }
}
