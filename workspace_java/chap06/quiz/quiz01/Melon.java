package quiz01;

public class Melon {
	String title = "제목";
	String singer = "가수명";
	String album = "앨범명";
	String lyrics = "가사";
	int time;
	
	void info(String title, String singer, String album, String lyrics, int time) {
		this.title = title;
		this.singer = singer;
		this.album = album;
		this.lyrics = lyrics;
		this.time = time;
		
		System.out.println("title : "+ title);
		System.out.println("singer : "+ singer);
		System.out.println("album : "+ album);
		System.out.println("lyrics : "+ lyrics);
		System.out.println("time : "+ time + " sec");
	}
}
