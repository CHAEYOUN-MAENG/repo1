package sec02.exam01;

public class Exam {

	public static void main(String[] args) {

		P3_1 p3_1 = new P3_1();

		// 부모 타입으로 형변환 가능
//		P2_1 p2_1 = (P2_1)p3_1;

		// 이 경우에 형변환 연산자를 행략할 수 있다
		P2_1 p2_1 = p3_1;

//		P1 p1 = (p1)p2_1;
		P1 p1 = p2_1;

		p1 = p3_1;

//		P1 pp1 = (P1)((P2_1)new P3_1());
		P1 pp1 = new P3_1();

		P1 p1_2 = new P2_2();

//		P2_1 p21 = new P2_2(); -> 부모 자식관계가 아니여서 아예 형변환X

		pp1 = p1_2; // 이건 가능하다

	}

}
