package sec01.exam01;

public class ExtendsExam {

	public static void main(String[] args) {

		// parent 생성자도 자동으로 생성(상속)
		// 부모가 자식한테 상속됨

		Child c1 = new Child();
		System.out.println(c1.name);

		System.out.println("-----------");

		String str = c1.getName();
		System.out.println(str);

		System.out.println("-----------");
		c1.getName();

		c1.setName("자식이 보낸 이름");
		System.out.println(c1.name);
		System.out.println("-----------");

		c1.printName();

	}

}
