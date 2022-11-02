package com.won.mapper;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.won.VO.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/*.xml"})
public class MemberMapperTest {

	@Inject
	private DataSource ds;
	
	@Autowired
	private MemberMapper membermapper;
	

	// �쉶�썝媛��엯 荑쇰Ⅴ �뀒�뒪�듃 硫붿꽌�뱶
	@Test
	public void memberJoin() throws Exception {
		MemberVO member = new MemberVO();

		member.setId("test");
		member.setM_name("test");
		member.setM_birth("test");
		member.setM_pw("test");
		member.setM_phone("test");
		member.setM_email("test");
		member.setM_sub("test");
		member.setM_state("test");
		
		membermapper.memberJoin(member);
	}


}
