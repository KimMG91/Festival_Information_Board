package com.fullstack2.fullstival.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fullstack2.fullstival.entity.Festival;

public interface FestivalRepository extends JpaRepository<Festival, Long> {

}
