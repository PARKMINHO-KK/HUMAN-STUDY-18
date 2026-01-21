package sec04;

public class Calc {

	// 메소드 선언
	void powerOn() {
		int a;
		a = 10;
		
		System.out.println("전원을 켭니다");
	}
	
	// 잠깐 return 배우고 왔음
	
	int plus(int x, int y) {
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		
		int result = x + y;
		return result;
	}
	
	double divide (int x, int y) {
		System.out.println("메소드명: divide");
		System.out.println("전달인자: int x, int y");
		System.out.println("리턴타입: double");
		
		if(y == 0) {
			System.out.println("0으로 나눌 수 없다");
			return 0;
		} else {
			double result = (double)x/y;
			return result;			
		}
	}
	
	double result = 0;  // return 한번만 쓰는 방식
	double calcRatio (int x, int y) {
		if((x+y) == 0) {
			System.out.println("0으로 나눌 수 없다");
			result = 0;
		} else {
			result = (double)(x-y)/(x+y);
		}
		return result;
	}
	
}
