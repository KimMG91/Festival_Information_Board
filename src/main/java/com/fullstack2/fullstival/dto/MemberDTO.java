package com.fullstack2.fullstival.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
//회원정보 DTO
public class MemberDTO {

	private String id; //아이디 : 이메일주소로 받기
	private String authority; //member, admin 중 하나 입력. 회원가입한 사람의 데이터이므로 all은 불가능
	private String password; //비밀번호 : 암호화해줘야 함
	private String name; //실명
	private String phoneNum; //전화번호
	private String nickname; //별명
	private String gender; //성별
	private LocalDate birthDay; //생년월일
	private boolean isSns; //소셜계정 인증을 통한 가입 여부
	
	
}
