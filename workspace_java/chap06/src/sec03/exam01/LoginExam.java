package sec03.exam01;

public class LoginExam {

	public static void main(String[] args) {

		Login login = new Login("admin", "1234");

		System.out.println("-----------");

		boolean a = login.log("codbs", "1234");
//		System.out.println(a);

		System.out.println("-----------");

		if (!a) {
			login.log("admin", "1234");
		}

	}

}
