package com.example.restpractice.controller;

import com.example.restpractice.controller.request.MemberRequest;
import com.example.restpractice.controller.response.MemberCreateResponse;
import com.example.restpractice.controller.response.MemberResponse;
import com.example.restpractice.service.Member;
import com.example.restpractice.service.MemberService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class MemberController {

    private MemberService memberService;

    @PostMapping("/members/")
    @ResponseStatus(HttpStatus.CREATED)
    public MemberCreateResponse create(@RequestBody @Valid MemberRequest request) {
        Member member = request.convertToMember();
        Long id = memberService.create(member);
        return MemberCreateResponse.convertToMemberResponse(id);
    }

    @GetMapping("/members/{id}")
    public MemberResponse retrieve(@PathVariable Long id) {
        Member member = memberService.retrieve(id);
        return MemberResponse.convertFrom(member);
    }

    @GetMapping("/members")
    public List<Member> retrieve() {
        return memberService.retrieve();
    }

}
