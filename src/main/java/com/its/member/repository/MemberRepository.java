package com.its.member.repository;

import com.its.member.dto.MemberDTO;
import com.its.member.service.MemberService;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepository {

 @Autowired
    private SqlSessionTemplate sql;


    public void save(String memberId, String memberPassword, String memberName, int memberAge, String memberPhone) {
        MemberDTO memberDTO=new MemberDTO();
        memberDTO.setMemberId(memberId);
        memberDTO.setMemberPassword(memberPassword);
        memberDTO.setMemberName(memberName);
        memberDTO.setMemberAge(memberAge);
        memberDTO.setMemberPhone(memberPhone);
        sql.insert("member.save",memberDTO);
    }

    public void save1(String memberId, String memberPassword) {
        MemberDTO memberDTO=new MemberDTO();
        memberDTO.setMemberId(memberId);
        memberDTO.setMemberPassword(memberPassword);
        sql.insert("member.save1",memberDTO);
    }
}
