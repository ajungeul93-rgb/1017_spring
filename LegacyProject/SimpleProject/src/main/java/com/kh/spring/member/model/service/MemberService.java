package com.kh.spring.member.model.service;

import javax.servlet.http.HttpSession;

import com.kh.spring.member.model.dto.MemberDto;

public interface MemberService {
	
	// 추상메소드, default메소드, static메소드
	
	// 로그인 ==> 반환타입 + 매개변수는 생각해둘 수 있음
	MemberDto login(MemberDto member);
	
	// 회원가입
	// MyBatis : 1. 정수값을 반환함
	//           2. 아무 값도 반환하지 않음(void) ==> 예외처리를 빡빡하게 하겠음
	// Hibernate : 가입된 회원의 정보를 반환해줌 / 실패시 null
	void signUp(MemberDto member);
	
	// 정보수정
	void update(MemberDto member, HttpSession session);
	
	// 탈퇴
	void delete(String userPwd, HttpSession session);

}
