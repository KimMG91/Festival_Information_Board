package com.fullstack2.fullstival.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fullstack2.fullstival.entity.Member;

public interface MemberRepository extends JpaRepository<Member,String>{
    
}
