package com.fullstack2.fullstival.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
//리뷰게시판
public class Review extends BaseEntity {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long reviewNum; //리뷰번호 
   
   @ManyToOne(fetch = FetchType.LAZY)
   private Member writer; //작성자 : Member 엔티티의 id 컬럼
   private String title; //제목
   private String content; //내용
   private Long readCount; //조회수
   private Long goodCount; //좋아요 수
   
   @ManyToOne(fetch = FetchType.LAZY)
   private Festival festivalNum1; //축제번호1 //축제정보게시판과의 연동 목적
   @ManyToOne(fetch = FetchType.LAZY)
   private Festival festivalNum2; //축제번호2
   @ManyToOne(fetch = FetchType.LAZY)
   private Festival festivalNum3; //축제번호3
   @ManyToOne(fetch = FetchType.LAZY)
   private Festival festivalNum4; //축제번호4
   @ManyToOne(fetch = FetchType.LAZY)
   private Festival festivalNum5; //축제번호5
   
   
   private String hashTag1; //해시태그1 //검색목적
   private String hashTag2; //해시태그2 
   private String hashTag3; //해시태그3 
   private String hashTag4; //해시태그4 
   private String hashTag5; //해시태그5 
}