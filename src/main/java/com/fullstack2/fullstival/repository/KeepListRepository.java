package com.fullstack2.fullstival.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fullstack2.fullstival.entity.KeepList;

public interface KeepListRepository extends JpaRepository<KeepList, String> {
   
}
