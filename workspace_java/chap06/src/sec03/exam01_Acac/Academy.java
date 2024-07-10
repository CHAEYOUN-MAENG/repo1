package sec03.exam01_Acac;

import java.util.ArrayList;

import sec03.exam01.Student;

public class Academy {

	String name; // 학원 이름
	int idx = 0; // 배열의 index

	Student[] list1 = new Student[10]; // Student s1; 하고 s1 = s; 하는거랑 똑같음
	ArrayList list2 = new ArrayList(); // import 해줘야함

	public Academy(String name) {
		this.name = name;
	}

	// join : 학원생을 필드에 등록
	// 전달인자 : Student
	// 리턴타입 : 없음

	public void join(Student s) {
//		this.list1[0] = s;

		/*
		 * for (int i = 0; i < list1.length; i++) { if (list1[i] == null) { list1[i] =
		 * s; break; } }
		 */

		// 배열의 길이를 넘지 않도록
		if (idx < this.list1.length) {
//			this.list1[idx] = s;
//			idx++;
			this.list1[idx++] = s;
		} else {
			System.out.println("만석입니다");
		}

		list2.add(s); // ArrayList는 []이게 아니라 ()이거다.

	}

	public void viewList() {
		// 배열출력
		for (int i = 0; i < list1.length; i++) {
			Student s = list1[i];
			if (s != null) {
				System.out.println("이름 : " + s.name + ", 나이 : " + s.age);
			}
		}

		for (int i = 0; i < list2.size(); i++) {
			list2.get(i);
		}

	}

	public Student getStudent(int index) {
		return list1[index]; // 몇번째 학생을 뽑아주세요
	}

}
