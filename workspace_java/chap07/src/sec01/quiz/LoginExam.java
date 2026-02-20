package sec01.quiz;

public class LoginExam {

	public static void main(String[] args) {
		
		Login login = new Login("asdaf", "asdasf");
		login.login("aaaa", "aaaa");
		
		NaverLogin naver = new NaverLogin("aaaa", "aaaa");
		naver.login("aaaa", "aaaa");
		
		DaumLogin daum = new DaumLogin("", "");
		daum.login("", "");

	}

}
