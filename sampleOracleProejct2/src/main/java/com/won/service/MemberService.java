package com.won.service;

import com.won.VO.MemberVO;


public interface MemberService {
	// 회원가입
	public void memberJoin(MemberVO member) throws Exception;
}
