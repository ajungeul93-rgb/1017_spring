package com.kh.spring.member.model;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.kh.spring.member.model.dto.MemberDto;

@Repository
public class MemberRepository {
	
	public MemberDto login(SqlSessionTemplate sqlSession, MemberDto member) {
		return sqlSession.selectOne("memberMapper.login", member);
	}

}
