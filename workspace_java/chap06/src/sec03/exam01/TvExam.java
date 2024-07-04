package sec03.exam01;

public class TvExam {

	public static void main(String[] args) {

		Tv myTv = new Tv();
		myTv.TvOn();

		int volume = myTv.volUp();
		System.out.println(volume);

		volume = myTv.volUp();
		System.out.println(volume);

		volume = myTv.volDown();
		System.out.println(volume);

		myTv.volUp();

		int channel = myTv.channelPrint(5);
		myTv.channelUp();
		myTv.channelUp();

		myTv.channelDown();

		myTv.info();

	}

}
