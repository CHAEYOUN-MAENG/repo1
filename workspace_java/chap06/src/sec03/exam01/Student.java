package sec03.exam01;

public class Student {

	public Student() {

	}

	// 값 (ex. 이력서)
	// 이름, 나이, 주소, 성별, 전공, 안경사용여부
	public String name;
	public int age;
	String addr;
	int gender;
	String major;
	boolean hasGlasses;

	// 행동
	// 공부, 식사, 수면, 게임

	// 공부
	// 공부한 내용을 출력하고
	// 지식이 높아지고
	// 스트레스가 높아지고
	// 체력이 낮아지고
	// 공복감 높아지고

	// 전달인자 : String 공부한 내용
	// 리턴타입 : 없음 (intel 연습으로 int로 바꿈)

	int intel = 0; // 지식
	int stress = 0; // 스트레스
	int hp = 100; // 체력
	int hungry = 0; // 공복감

	public int study(String subject) {
		System.out.println(subject + "을(를) 공부했다");

		intel += 5;
		stress += 10;
		hp--;
		hungry++;

		// intel을 return을 해보자
		// 이 메소드를 실행시키면 intel 리턴값으로 바뀜
		return intel;
	}

	// 공부할때랑 게임할때 받는 스트레스가 다르니까
	// 스트레스를 전달할 수 있는 study를 오버로딩한 메소드 만들기

	int study(String sub, int st) {
		System.out.println(st + "만큼 스트레스 증가/감소");

		intel += 5;
		stress = stress + st;
		hp--;
		hungry++;

		// intel을 return을 해보자
		// 이 메소드를 실행시키면 intel 리턴값으로 바뀜
		return stress;
	}

	/* 생성자 */
	// 이름과 나이를 입력받지 않으면 생성 못하게 만들기
	// 나이는 중요하지 않아서 이름 있어도 생성할 수 있게 만들기
	// 단, 두번째 생성자에서는 이름과 나이를 전달받는 생성자 호출하기

	Student(String m, int a) {
		name = m;
		age = a;
		System.out.println("이름과 나이가 다 있어야 생성");
	}

	Student(String n) {
		this(n, 25);

//		name = n;
//		age = 25;
		System.out.println("이름만 있어도 생성");
	}

	// 게임
	// 단, 게임을 하면서 게임 공부도 했다치고
	// study 메소드 활용
	// 전달인자 : 게임이름
	// 리턴타입 : int

	int doGame(String title) {
		System.out.println(title + "을(를) 했다");

		// 메소드 안에서 다른 메소드 부르기
		int in = study(title); // 지식

		stress -= 10;
		hungry += 3;

		return stress;

	}

	int doGame(String title, int hour) {

		// 방어코딩
		// hour가 0 이하인 경우 "다시 입력" 출력
		// 시간이 정상인 경우
		// 난이도 1. 시간당 한번씩 "한번만 더하자" 출력
		// 난이도 2. 시간당 2번씩(0.5씩)

//		if (hour <= 0) {
//			System.out.println("다시입력");
//			return 0;
//		} else if (hour > 0) {
//			System.out.println(title + "을(를)" + hour + "시간만 할꺼다");
//			for (double i = 0; i < hour; i += 0.5) {
//				System.out.println("한번만 더하자");
//			}
//
//		}

		// 반복문
//		for(int i=0; i<hour; i++) {
//			System.out.println("한번만 더하자");
//		}

//		for (int i = hour; i > 0; i--) {
//			System.out.println("한번만 더하자");
//		}

		// 1시간에 2번
		// 30분에 1번
		// ex. 3시간이면 6번 나와야함

//		for (double i = 0; i < hour; i+=0.5) {
//			System.out.println("한번만 더하자");
//		}

		if (hour <= 0) {
			System.out.println("다시입력");
		} else if (hour > 0) {
			System.out.println(title + "을(를)" + hour + "시간만 할꺼다");
			if (hour <= 2) {
				System.out.println("오늘 좀 안됐다, 그만하자");
				stress += 5;
			} else if (hour <= 4) {
				System.out.println("간단하게 한게임 했다");
				stress -= 10;
			} else if (hour > 4) {
				System.out.println("오늘 신났다");
				stress -= 20;
			}
		}

		// 조건문
//		if (hour <= 2) {
//			System.out.println("오늘 좀 안됐다, 그만하자");
//			stress += 5;
//		} else if (hour <= 4) {
//			System.out.println("간단하게 한게임 했다");
//			stress -= 10;
//		} else if (hour > 4) {
//			System.out.println("오늘 신났다");
//			stress -= 20;
//		}

		return stress;

	}

	// 식사
	// 먹은 음식을 출력하고
	// 체력이 올라가고
	// 스트레스 조금 낮아지고
	// 공복감 많이 낮아지고
	// 전달인자 : String 음식
	// 리턴타입 : int 공복감

	int food(String food) {
		System.out.println(food + "을(를) 먹었다");

		hp++;
		stress--;
		hungry += 10;

		return hungry;
	}

	// 수면

	int sleep(int num) {
		System.out.println(num + "시간 잤다");

		hp += 5;
		stress -= 5;

		return hp;

	}

	// 내 정보보기
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", " + "addr=" + addr + ", gender=" + gender + ", " + "major="
				+ major + ", hasGlasses=" + hasGlasses + ", intel=" + intel + ", stress=" + stress + ", hp=" + hp
				+ ", hungry=" + hungry + "]";
	}

}
