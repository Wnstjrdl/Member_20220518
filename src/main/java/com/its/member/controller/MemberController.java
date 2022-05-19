package com.its.member.controller;

import com.its.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberController {
    @Autowired
    private MemberService memberService;
    @GetMapping("/save-form")
    public String saveForm(){return "save-form";}
    @PostMapping("/save")
    public String save(@RequestParam("memberId")String memberId,
    @RequestParam("memberPassword")String memberPassword,
    @RequestParam("memberName") String memberName,
    @RequestParam("memberAge")  int memberAge,
    @RequestParam("memberPhone")  String memberPhone)      {
        System.out.println("memberId="+memberId+",memberPassword="+memberPassword+",memberName="+memberName+",memberAge="+memberAge+",memberPhone="+memberPhone);
    memberService.save(memberId,memberPassword,memberName,memberAge,memberPhone);
        return null;
    }
    @GetMapping("/login-form")
    public String loginForm(){return "login-form";}
    @PostMapping("/login")
    public String login(@RequestParam("memberId")String memberId,
                        @RequestParam("memberPassword")String memberPassword){
        System.out.println("memberId="+memberId+",memberPassword="+memberPassword);
        memberService.save1(memberId,memberPassword);
        return null;
    }




}
