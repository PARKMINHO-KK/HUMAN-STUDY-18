package sec04;

public class CalcExam {

	public static void main(String[] args) {

		Calc calc = new Calc();
		calc.powerOn();
		
		int a = calc.plus(5, 7);
		System.out.println("a: "+ a);
		
		
		// 호출할 때 이름과 전달인자를 꼭 맞춰야 실행된다
//		calc.plus();
		
		int i = 4;
		a = calc.plus(i, 8);
		
		/**
		 *  javadoc 주석
		 *  두 정수를 입력 받아서
		 *  나누기한 결과를 x/y
		 *  double로 돌려주는 메소드
		 *  	"0으로 나눌 수 없다"고 출력하고
		 *  	0을 돌려 줌
		 *  
		 *  메소드명 : divide
		 *  전달인자 : int x, int y
		 *  리턴타입 : double
		 *  
		 *  @param ixtx, int y
		 *  @return double
		 *  @author parkmino89@naver.com
		 */
		Calc di = new Calc();
		
		double b = di.divide(4, 1);
		System.out.println(b);
		
		/**
		 *  javadoc 주석 gpt 버전
		 *  
		 *  두 정수를 입력 받아서
		 *  첫 번째 수에서 두 번째 수를 뺀 값을
		 *  두 수의 합으로 나눈 결과를
		 *  double 타입으로 돌려주는 메소드
		 *  
		 *  단, 두 수의 합이 0이면
		 *  	"0으로 나눌 수 없다" 출력하고
		 *  	0을 리턴함
		 *  
		 *  계산식 : (x - y) / (x + y)
		 *  
		 *  메소드명 : calcRatio
		 *  전달인자 : int x, int y
		 *  리턴타입 : double
		 *  
		 *  @param x 첫 번째 정수
		 *  @param y 두 번째 정수
		 *  @return double
		 *  @author parkmino89@naver.com
		 */
		
//		Calc ratio = new Calc();
		b = calc.calcRatio(3, 1);
		System.out.println(b);
		
	}

}
