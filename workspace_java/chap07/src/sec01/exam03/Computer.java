package sec01.exam03;

public class Computer extends Calc {
			  // 자식이 부모를 상속받음
			  // 자식 메소드가 없어도 부모 상속을 받았기 때문에
			  // Exam은 에러없이 돌아감

	// 메소드에만 붙을 수 있음
	@Override

	// 부모와 자식의 메소드명과 타입을 동일하게 작성해야함
	// 전달인자의 순서 전달인자의 타입 개수
	// 선언파트가 아예 동일해야함
	// 부모거를 동일하게 덮어 쓰기 위해
	// 그렇지 않으면 그냥 자식꺼는 자식게 실행

	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
}
