package sec03.exam01;

public class LoginExam {

	public static void main(String[] args) {

		Login login = new Login("codbs", "1234");
		
		boolean a = login.log("codbs", "1234");
		System.out.println(a);
		
		login.log("codbs", "1111");
		
		
	}

}
