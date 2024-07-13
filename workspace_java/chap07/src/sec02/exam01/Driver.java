package sec02.exam01;

// 대리기사
public class Driver {

	// 2개는 지금 오버로딩함(전달인자 다르게)
//	void run(Avante a) {
//		System.out.println("전달인자로 아반떼만 받음");
//		a.drive();
//	}
//
//	void run(Spark s) {
//		System.out.println("전달인자로 스파크만 받음");
//		s.drive();
//	}

	void run(Car c) {
		System.out.println("전달인자로 Car만 받음");
		c.drive();
	}

}
