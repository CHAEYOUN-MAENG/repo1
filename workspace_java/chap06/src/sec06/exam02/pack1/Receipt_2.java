package sec06.exam02.pack1;

//import sec06.exam02.pack2.Receipt_3; // ctrl + shift + o

// 해당 폴더(package)에 있는 클래스만 단, 하위 package의 클래스 제외
import sec06.exam02.pack2.*;

import sec06.exam02.pack2.Receipt_1;

public class Receipt_2 {

	String str;

	Receipt_2() {

		// 다른 클래스를 찾을때
		// 1. 내 package
		// 2. java.lang package // 자동으로 java 실행 시, 자동으로 import
		// 3. import한 곳에 있는가

		// 내 패키지에 있어서 *로 로딩해도 내껄 찾아감
		// 일단 내 package에서 찾음 그래서 Receipt_1 는 있음
		// 명확히 import 해준 경우 pack2의 Receipt_1 사용 가능
		Receipt_1 r1 = new Receipt_1(); // 현재 pack2

		// 근데 package에 Receipt_3는 없음 그래서 인포트를 해줘야함
		Receipt_3 r3 = new Receipt_3();

		r3.a = 8; // 현재 receipt_3 int a에 public를 해줬음

		// pack1의 Receipt_1를 사용하고 싶다면?
		// 다른 package 클래스를 가져오는
		// 두번째 방법

		// package 정보와 클래스 정보를 한번에 쓰기
		// 귀찮아서 import 사용한다
		// 부득이한 경우 사용할 수 있다는것을 알아두자
		sec06.exam02.pack1.Receipt_1 r1_1 = new sec06.exam02.pack1.Receipt_1();

	}

}
