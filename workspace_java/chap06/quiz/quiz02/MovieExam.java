package quiz02;

public class MovieExam {

	public static void main(String[] args) {

		Movie movie1 = new Movie();
		movie1.title = "시간을 걷는 남자";
		movie1.year = 2019;
		
		Movie movie2 = new Movie();
		movie2.title = "별이 잠든 도시";
		movie2.year = 2023;
		
		movie1.printInfo();
		movie1.printSequelInfo();
		movie2.printInfo();
		movie2.printSequelInfo();
		
	}

}
