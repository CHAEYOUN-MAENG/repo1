package kr.or.human.member.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

// 보통 DAO class에서 사용
@Repository("memberDAOImpl")
public class MemberDAOImpl implements MemberDAO {

	@Override
	public List selectMember() {
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);

		return list;
	}

}