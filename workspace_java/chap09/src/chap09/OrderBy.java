package chap09;

import java.util.Comparator;

public class OrderBy implements Comparator {

	// 추상메소드
	// 무조건 구현을 해줘야함
	// 안그러면 추상클래스로 만들어서 떠넘겨줘야함..
	// 그럼 자식이 해줘야함

	@Override
	public int compare(Object o1, Object o2) {

		// 전달인자가 Object는 아무거나 받기 위해서

		MemberDTO dto1 = (MemberDTO) o1;
		MemberDTO dto2 = (MemberDTO) o2;

		return dto1.getAge() - dto2.getAge();
	}

}
