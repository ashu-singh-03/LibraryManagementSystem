package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.Member;

public interface MemberRepository  extends JpaRepository<Member, Integer>{

}
