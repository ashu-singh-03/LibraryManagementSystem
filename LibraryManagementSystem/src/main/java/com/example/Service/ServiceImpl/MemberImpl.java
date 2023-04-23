package com.example.Service.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Entity.Book;
import com.example.Entity.Member;
import com.example.Service.MemberService;
import com.example.repository.MemberRepository;
@Repository
public class MemberImpl implements MemberService {
	@Autowired
	MemberRepository memberrepository;

	@Override
	public Member addMember(Member member) {
		// TODO Auto-generated method stub
		return memberrepository.save(member);
	}

	@Override
	public List<Member> getAllMember() {
		// TODO Auto-generated method stub
		return memberrepository.findAll();
	}

	@Override
	public void deleteMember(int memberId) {
		// TODO Auto-generated method stub
		  memberrepository.deleteById(memberId);
	}

	@Override
	public Member findMemberById(int MemberId) {
		// TODO Auto-generated method stub
		return memberrepository.findById(MemberId).get();
	}

	@Override
	public Member UpdatMember(Member member) {
		// TODO Auto-generated method stub
		Member	update_member= memberrepository.findById(member.getMemberId()).get();
		update_member.setMemberName(update_member.getMemberName());
		return update_member;
	}

}
