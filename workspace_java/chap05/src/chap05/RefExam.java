package chap05;

public class RefExam {

	public static void main(String[] args) {

		int a;
//		System.out.println(a);

		String c = "맹채윤";
		// =을 기준으로 오른쪽 먼저 실행
		// "맹채윤"이 힙(heap) 영역에 비어있는 번지에 들어간다
		// 스택(stack) 영역의 c에 그 번지가 기록된다
		// 번지에 있는 값을 가져와 출력한다

		System.out.println("c == null : " + (c == null));
		System.out.println("c != null : " + (c != null));

		c = null; // 스택(stack) 영역의 주솟값을 비워서 연결 끊기
		System.out.println("c : " + c);
		System.out.println("c == null : " + (c == null));
		System.out.println("c != null : " + (c != null));

		String d;
		// 기본타입과 마찬가지로
		// 값을 할당하지 않으면 사용할 수 없다
//		System.out.println(d);
		d = "맹채윤";
		c = "맹채윤";
		System.out.println(c == d); // 결과: true -> 특수한 사항(String만 특별대우)
									// 스택(stack) 영역의 주솟값을 비교

		c = new String("맹채윤"); // 완전 새로운 주소에 할당
		System.out.println(c == d); // 결과: false
		// c가 가지고 있는 주소(번지)와 d의 주소값(번지)이 다르다 (힙영역의 값이 같아도 번지가 다르기 때문에)

		// equals는 스택(stack)영역의 주소를 비교하는건데, String일때만 힙(heap)영역 값을 비교
		System.out.println("c.equals(d) :" + c.equals(d));

		c = null;
//		System.out.println("c.equals(d) :" + c.equals(d));
		String e = c + "abc";
		System.out.println(e);

	}

}
