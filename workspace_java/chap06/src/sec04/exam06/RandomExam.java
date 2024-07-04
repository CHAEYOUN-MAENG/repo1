package sec04.exam06;

public class RandomExam {

	public static void main(String[] args) {

		Random updown = new Random();
		updown.initNumber(); // 임의의 숫자 받음
		updown.hint(); // 정답
		updown.answer(5);
		updown.answer(7);
		updown.answer(9);
		updown.answer(2);

		// TODO return이 있었다면

	}

}
