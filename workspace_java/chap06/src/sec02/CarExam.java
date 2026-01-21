package sec02;

public class CarExam {
	
	static int a = 10;

	public static void main(String[] args) {

		// Car 클래스를 생성해서 변수에 담아주세요
		Car myCar = new Car();
		
		System.out.println(myCar.company);
		myCar.company = "bmw";
		System.out.println(myCar.company);
		
		System.out.println(myCar.speed);
		myCar.speed = 170;
		System.out.println(myCar.speed);
		
		Car myCar2 = new Car();
		System.out.println(myCar2.company);
		
		System.out.println("a: "+ a);
		
		// 깜짝퀴즈
		// China 클래스 만들기
		// 필드 
		// 		name // 가게 이름
		// 		address // 주소
		// 		menus // 2개 이상의 메뉴를 가지는 메뉴목록
		// ChinaExam 을 만들어서
		// 		중국집 2개를 생성해서
		//		1. 필드값 출력
		// 		2. 필드값 바꾸고 출력
	}

}
