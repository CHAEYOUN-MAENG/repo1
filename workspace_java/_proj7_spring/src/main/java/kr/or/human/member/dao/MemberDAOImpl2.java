package kr.or.human.member.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("memberDAOImpl2")
@Primary // 우선순위 1번
public class MemberDAOImpl2 implements MemberDAO {

	@Override
	public List selectMember() {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");

		return list;
	}

}
