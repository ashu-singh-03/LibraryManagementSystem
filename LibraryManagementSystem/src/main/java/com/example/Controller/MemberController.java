package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Member;
import com.example.Service.MemberService;

@RestController
public class MemberController {
  
	@Autowired
	MemberService memberService;

    @PostMapping(value="/postmember")
    public Member addMember(@RequestBody Member member) {
        return memberService.addMember(member);
    }

    @GetMapping(value="/getmember")
    public List<Member> getAllStudent(){
        return memberService.getAllMember();
    }
    
    @DeleteMapping(value="/deletemember/{membetId}")
    public String deleteMember(@PathVariable int memberId) {
        memberService.deleteMember(memberId);
        return "memeber is Deleted";
    }

    @PutMapping(value="/updatemember")
    public Member updateMember(@RequestBody Member member){
        return memberService.UpdatMember(member);
    }

    @GetMapping(value="/getMember/{memberId}")
    public Member getMember(@PathVariable int memberId) {
        return memberService.findMemberById(memberId);
    }
}
