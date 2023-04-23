package com.example.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Entity.Book;
import com.example.Entity.Member;

@Service
public interface MemberService {

	
	
	public Member addMember(Member member);
	public List<Member> getAllMember();
	public void deleteMember(int memberId);
	public Member findMemberById(int MemberId);
	public Member UpdatMember(Member member);
}
