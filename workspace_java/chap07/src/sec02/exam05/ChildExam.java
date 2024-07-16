package sec02.exam05;

import java.util.ArrayList;

public class ChildExam {

	public static void main(String[] args) {

		Child child = new Child();
		child.method1("차일드");
		System.out.println("결과 : 차일드 field1 : " + child.field1);

		System.out.println("----------------");

		Parent p = new Child(); // parent타입으로 형변환
		p.method1("부모");
		System.out.println("결과 : p의 field1 : " + p.field1);
		// p.field1은 부모 클래스의 필드를 가르킨다
		// Override는 메소드만 된다

		System.out.println("----------------");

		Child child2 = (Child) p; // 다시 Child타입으로 형변환
		System.out.println("결과 :c child2의 field1 : " + child2.field1);

		System.out.println("-----------------");

		Parent p1 = new Child();
		Parent p2 = new Child101();

//		p1 = p2;
		Child c1 = (Child) p1;

		// p2가 Child에서 왔는가?
		// p2는 Child의 인스턴스인가?
		boolean isChild = p2 instanceof Child;
		System.out.println("isChild : " + isChild);
		if (isChild) {
			Child c2 = (Child) p2;
		}
		if (p2 instanceof Child101) {
			Child101 c3 = (Child101) p2;
		}

		System.out.println("--------------");

		// Object 는 단군할아버지임 최상위 클래스
		Object obj = new Parent();
		ArrayList list = new ArrayList();

		list.add(p1); // p1이 Parent 타입이기 때문에
		Object obj1 = list.get(0); // Object 타입에서 obj1를
		Parent p3 = (Parent) obj1; // Parent 타입으로 다시 변환

		boolean t = p3.equals(obj1);
		System.out.println(t); // 타입변환을 했으니 true
	}

}
