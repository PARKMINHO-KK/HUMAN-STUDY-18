package quiz02;

public class Movie {
	String title = "영화제목";
	int year;
	
	void setTitle(String title) {
		this.title = title;
	}
	
	String getSequelTitle() {
		return title+"2";
	}
	
	void setYear(int year) {
		this.year = year;
	}
	
	void printInfo() {
		System.out.println("영화제목 : "+ title);
		System.out.println("개봉년도 : "+ year);
		System.out.println("");
	}
	
	void printSequelInfo() {
		System.out.println("속편제목 : "+ getSequelTitle());
		System.out.println("개봉년도 : "+ "미정");
		System.out.println("");
	}
}
