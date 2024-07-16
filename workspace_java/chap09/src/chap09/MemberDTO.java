package chap09;

public class MemberDTO {

	String name;
	int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// Object라는 최상위클래스를 오버라이드 함
	@Override
	public String toString() {
		return "MemberDTO [name=" + name + ", age=" + age + "]";
	}

}
