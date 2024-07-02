package sec01.exam01;

public class StudentExam {

	public static void main(String[] args) {

		Student s1 = new Student(); // 메모리에 올라감(Student는 레시피)
									// 새로운 Student 객체를 생성해서 s1에 담기
		Student s2 = new Student();

		Student s3 = null; // 변수는 만들었지만 연결되는 것은 없도록 null

		s3 = s1;
		System.out.println(s3 == s1); // true
		System.out.println(s1 == s2); // false (같은 주소를 공유하지 X)
		
		s2 = null;
		
	}

}
