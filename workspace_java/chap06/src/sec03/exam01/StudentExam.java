package sec03.exam01;

public class StudentExam {

	public static void main(String[] args) {

		// 원본을 복사해서 s1을 만듬(복사본)
		Student s1 = new Student();

		// 필드는 초기화가 앖는 경우 new하는 순간 자동 초기화 됨
		System.out.println(s1.name); // 초기값 null
		System.out.println(s1.age); // 초기값 0
		System.out.println(s1.hasGlasses); // 초기값 false

		// Student에서 양식만 가져와서 실행되는데에서 작성
		s1.name = "맹채윤";
		s1.age = 25;
		s1.hasGlasses = true;

		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.hasGlasses);

		// s1.name과 내 지역변수 name은 아무 관계 없음
		String name = "자바";
		System.out.println(name);

		// 지역변수는 초기화 없이 사용 불가능
//		int a;
//		System.out.println(a);

		// 원본을 복사해서 s2를 만듬
		Student s2 = new Student();
		System.out.println(s2.name); // null

		s2.name = "박춘보";
		s2.age = 50;

		System.out.println(s2.name);
		System.out.println(s2.age);

//		System.out.println(s1.name);
//		System.out.println(s1);

		// 주는게 없는void 타입이기 때문에
		// 변수에 담아서 그 변수를 출력하지 못함
		s1.study("java class");
		System.out.println(s1);

//		// intel return
//		s1.study("JS");
//		System.out.println("----");
//		int intel = s1.study("JS");
//		System.out.println("intel : " + intel); // 5 -> 10 출력
//		System.out.println(s1); // 복사본 전체
//
//		System.out.println("====");
//
//		s1.food("마라탕"); // 출력을 해야 return 값이 나옴
//		System.out.println("----");
//		int hungry = s1.food("마라탕");
//		System.out.println("hungry : " + hungry);
//		System.out.println(s1);
//
//		System.out.println("====");
//
//		s1.doGame("윷놀이");
//		System.out.println("----");
//		int game = s1.doGame("윷놀이");
//		System.out.println(game);
//
//		System.out.println("====");
//
//		s1.sleep(10);
//		System.out.println("----");
//		int sleep = s1.sleep(10);
//		System.out.println(sleep);
//
//		System.out.println("====");
//
////		s1.doGame("테런", 5);
////		System.out.println("----");
////		int stress = s1.doGame("테런", 5);
////		System.out.println(stress);
////		System.out.println("----");
////		s1.doGame("가위바위보", 1);
////		System.out.println("----");
////		stress = s1.doGame("가위바위보", 1);
////		System.out.println(stress);
////		System.out.println("----");
////		stress = s1.doGame("메이플", 4);
////		System.out.println(stress);
////		System.out.println("----");
////		stress = s1.doGame("서든", 10);
////		System.out.println(stress);
//
//		s1.doGame("테런", 0);
//
//		System.out.println("----");
//
//		s1.doGame("메이플", 3);
//		System.out.println("----");
//
//		int stress = s1.doGame("메이플", 3);
//		System.out.println("stress " + stress);
//
//		System.out.println("----");
//
//		stress = s1.doGame("서든", 4);
//		System.out.println("stress " + stress);

		System.out.println("====");
//		s1.study("java", 10);
		int stress = s1.study("java", 15);
		System.out.println(stress);
		System.out.println(s1);

		stress = s1.study("C", -10);
		System.out.println(stress);

		System.out.println("====");
		Student s3 = new Student("채윤", 25); // 클래스를 가져오는 것

		// 양식이 같게 출력되는건 결국 변수는 다르지만
		// 같은 Student를 가져왔으니까
//		System.out.println(s1);
//		System.out.println(s3);
		System.out.println(s3.name);
		System.out.println(s3.age);

		System.out.println("-----------");
		Student s4 = new Student("맹");
//		System.out.println(s4);
		System.out.println(s4.name);
		System.out.println(s4.age);

	}

}
