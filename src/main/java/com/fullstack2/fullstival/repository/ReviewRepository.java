package com.fullstack2.fullstival.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fullstack2.fullstival.entity.Review;

public interface ReviewRepository extends JpaRepository<Review, Long>{

}
