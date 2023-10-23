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
//축제정보댓글
public class FestivalReply extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long replyNum; //축제댓글번호
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Festival festivalNum; //축제번호
	
	private	int replyLevel; //댓글수준 : 댓글(1)/대댓글(2)까지만
	private int replyStep; //댓글순서 : 댓글1/댓글1-1/댓글1-2/댓글2/댓글2-1
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Member writer; //작성자 : Member 엔티티의 id 컬럼
	private String content; //내용 
	
}
