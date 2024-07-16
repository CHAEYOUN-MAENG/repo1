package chap09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrderExam {

	public static void main(String[] args) {

		MemberDTO m1 = new MemberDTO();
		MemberDTO m2 = new MemberDTO();
		MemberDTO m3 = new MemberDTO();

		m1.setName("맹채윤");
		m1.setAge(25);

		m2.setName("박춘보");
		m2.setAge(30);

		m3.setName("차수");
		m3.setAge(28);

		System.out.println(m1.getAge() > m2.getAge());

		MemberDTO m4 = compareMemberDTO(m1, m2);
		System.out.println(m4);

		// 메소드에 전달인자를 준걸 MemberDTO 타입 m4 변수에 담아서
		// return 값을 출력해라 (ToString 값)

		List list = new ArrayList();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		System.out.println("list :" + list);

//		Comparator comp = new OrderBy();

		// Comparator 상속받은 이름없는 클래스를 new한거임
		// 위의 new OrderBy()와 아래의 코드는 완전히 같은 코드이다
		// 아래의 방법을 익명객체라고 한다
		// 이름이 없는 클래스를 new하고
		// new(){}
		// 뭔가 클래스명을 적어야 할 것 같은 곳에
		// interface를 적음
		// 단, 하나의 인터페이스만 사용할 수 있음
		// 이러면 그 interface를 구현한 익명 클래스가 생성된다

		Comparator comp = new Comparator() {

			public int compare(Object o1, Object o2) {

				// 전달인자가 Object는 아무거나 받기 위해서

				MemberDTO dto1 = (MemberDTO) o1;
				MemberDTO dto2 = (MemberDTO) o2;

//				return dto1.getAge() - dto2.getAge(); // 오름
				return dto2.getAge() - dto1.getAge(); // 내림
			}

		};

		Collections.sort(list, comp);
		System.out.println(list);

	}

	/**
	 * 기능 : 둘 중에 나이가 큰 MemberDTO를 돌려줌
	 * 
	 * @param MemberDTO, MemberDTO
	 * @return MemberDTO
	 */

	// Override가 안됨
	static MemberDTO compareMemberDTO(MemberDTO dto1, MemberDTO dto2) {
		// DTO Age 비교를 만들꺼임
		// dto1.getAge() >= dto2.getAge()
		if (dto1.getAge() - dto2.getAge() > 0) {
			return dto1;
		} else {
			return dto2;
		}

	}

}
