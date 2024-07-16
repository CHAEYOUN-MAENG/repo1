package sec01.exam01;

public class TryExam {

	public static void main(String[] args) {

		try {
			String s1 = null;

			// nullpointerException 전달인자 확인
			// System.out.println(s1.length());
			System.out.println(s1);

			int[] a = new int[2];

			// ArrayIndexOutOfBoundsException 배열의 길이를 벗어난다
			// a[100] = 3;

			// 글씨를 숫자로 바꾸는 방법
//		String s2 = "20a";
			String s2 = "20";
			int age = 0;

			// NumberFormatException 문자를 숫자로 바꿔야하는데
			// 문자열 포함되어있어서 안됨
			// ctrl + space 누르면 자동완성됨
			// try - catch (핵중요함!)

			System.out.println("----------------");

			ThrowsTest tt = new ThrowsTest();
//		tt.throwException();

			tt.human(3);

		} catch (HumanException he) {

			String message = he.getMessage();
			if ("EC05".equals(message)) {
				System.out.println("5 미만을 입력하셨군요, 확인해주세요");
			} else if ("EC10".equals(message)) {
				System.out.println("10 초과해서 입력하셨군요, 확인해주세요");
			}

		} catch (Exception e) {
			System.out.println("오류발생");
			System.out.println(e);
			System.out.println("----------------");

			e.printStackTrace();

			System.out.println("----------------");
			System.out.println(e.getMessage());
		}

		System.out.println("완료");

	}

	/////////////////////////////////////////////////////////

	// 숫자 더블클릭하면
	// 디버그 모드실행시킬때
	// 그 동그라미에서 멈춤
	// 브레이킹 포인트

	// 초록 세모
	// 다른 브레이킹 포인트까지 진행

	// F5
	// step into
	// 메소드 안으로 들어감

	// F7
	// step return
	// 메소드 밖으로 나옴

	// F6
	// step over
	// 한줄씩 확인

}
