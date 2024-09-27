package kr.or.human.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import kr.or.human.member.dao.MemberDAO;

@Service
public class MemberServiceImpl implements MemberService {

	// IoC
	// Inversion of Control
	// 제어의 역전
	// 찾아서 new까지 대신 해줌

	// DI
	// Dependency Injection
	// 의존성 주입
	// 변수에 넣기

	// 우선순위
	// 1. 완전히 동일한 클래스
	// 2. 자동 형변환이 가능한 클래스

	// @Autowired를 할 때, 두개 이상의 bean이 후보라면
	// @Qualifier(bean id)가 있는 경우, bean id에 해당하는 객체 찾기 (2번)
	// @Primary가 있는 객체 우선 (1번)
	// 둘다 없을 경우 변수명과 bean id가 같은 객체 찾기

	@Autowired
//	@Qualifier("memberDAOImpl2")
	MemberDAO memberDAO;

//	MemberServiceImpl(MemberDAO memberDAO) {
//		this.memberDAO = memberDAO;
//	}
//
//	void setMemberDAO(MemberDAO memberDAO) {
//		this.memberDAO = memberDAO;
//	}

	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}

	@Override
	public List listMember() {
//		MemberDAOImpl dao = new MemberDAOImpl();
//		MemberDAO dao = new MemberDAOImpl(); // 부모타입으로 자동 형변환
//		List list = dao.selectMember();

		List list = this.memberDAO.selectMember();
		return list;
	}

}
