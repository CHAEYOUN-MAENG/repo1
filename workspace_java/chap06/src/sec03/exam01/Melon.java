package sec03.exam01;

public class Melon {
	
	//	class Song
	//	필드 : 제목, 가수명, 장르, 가사, 곡 길이
	//	메소드
	//	 
	//	각각의 값을 지정하는 것(제목바꾸기 같이)
	//	모든 정보 표시
	//	class SongExam
	//	3곡 이상의 노래를 등록해서 관리

	private String title;
	private String singer;
	private String genre;
	private String lyrics;
	private int duration;

	// title getter
	// return 받을 떄
	// get + 필드명
	public String getTitle() {
		return this.title;
	}

	// title setter
	// 필드의 값을 바꾸고 싶을때
	// set + 필드명
	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getLyrics() {
		return lyrics;
	}

	public void setLyrics(String lyrics) {
		this.lyrics = lyrics;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Melon [title=" + title + ", singer=" + singer + ", "
				+ "genre=" + genre + ", lyrics=" + lyrics
				+ ", duration=" + duration + "]";
	}

}
