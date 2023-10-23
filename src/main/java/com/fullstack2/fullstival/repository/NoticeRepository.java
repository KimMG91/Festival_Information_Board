package com.fullstack2.fullstival.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fullstack2.fullstival.entity.Notice;

public interface NoticeRepository extends JpaRepository<Notice, Long> {
   
}
