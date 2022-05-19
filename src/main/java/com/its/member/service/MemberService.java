package com.its.member.service;

import com.its.member.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

  @Autowired
    private  MemberRepository memberRepository;

  public  void save(String memberId, String memberPassword, String memberName, int memberAge, String memberPhone) {
    memberRepository.save(memberId,memberPassword,memberName,memberAge,memberPhone);
  }

  public void save1(String memberId, String memberPassword) {
    memberRepository.save1(memberId,memberPassword);
  }
}
