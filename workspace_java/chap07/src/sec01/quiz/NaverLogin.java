package sec01.quiz;

public class NaverLogin extends Login {

	NaverLogin(String id, String pw){
		super(id, pw);
	}
	
	@Override
	void login(String id, String pw) { // 로그인 실행
		if(loginCheck(id, pw)) {
			System.out.println("네이버 로그인 성공");
		} else {
			System.out.println("네이버 로그인 실패");
		}
	}
		

}
