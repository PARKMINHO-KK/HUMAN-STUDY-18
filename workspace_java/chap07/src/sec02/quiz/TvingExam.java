package sec02.quiz;

public class TvingExam {

	public static void main(String[] args) {
//		문제 1
//
//		// 이전에 만들었던 로그인 관련되 내용을
//		// 상속-다형성으로 발전시켜 봄
//		[OAuth]
//		[Naver extends OAuth]
//		[Kakao extends OAuth]
//
//		boolean 회원가입(id, pw)
//		boolean 회원check(id, pw)
//		// boolean 로그인() - 안에서 Scanner 발동
//		boolean 로그인(id, pw)
//
//		[Tving]
//		Tving로그인(OAuth)
//		// Tving로그인(OAuth, id, pw)
//		    // Scanner 또는 전달인자
//		    if(OAuth.로그인(id, pw))
//		        "Tving 메인 페이지 표시"
//		    else
//		        "다시 로그인 하세요"
		
		//Naver 회원가입
		Naver naver = new Naver();
		naver.join("asdf", "1234");
		//Kakao 회원가입
		Kakao kakao = new Kakao();
		kakao.join("zxcv", "5678");
		
		//Tving 회원가입
		Tving tving = new Tving();
		tving.join("asdf","1234");
		
		
	}

}
