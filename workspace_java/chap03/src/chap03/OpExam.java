package chap03;

public class OpExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 10;
		
		x++;
		System.out.println("x: "+ x);
		
		x = 10;
		x = x + 1;
		// 나한테 +1 해서 다시 나한테 저장할 때 줄여쓰는 형태 
		// 줄여쓰는 형태
		x += 1; // 위와 같은 코드
		x++; // 위와 같은 코드
			// 단, +1만 가능
		
		x=10;
		++x;
		System.out.println("++x: "+ x);
		
		x=10;
		x--;
		--x;
		System.out.println("x :"+ x);
		
		x = 10;
		int z = ++x;
		System.out.println("z: "+ z);
		System.out.println("z: "+ x);
		
		x = 10;
		z = x++;
		System.out.println("z(x++): "+ z);
		System.out.println("z(x++): "+ x);
		
		x = 10;
		System.out.println(("x++: " + x++) + ("x: "+x));
		
		x = 10;
		z = x++ + ++x;
		// 예측 : 21
		System.out.println("z: "+ z);
		
		x = 1;
		z = x++ - --x * x++ - x--;
		// z와 x의 출력값
		// 예측 z: -2
		// 예측 x: 1
		System.out.println("z: "+ z);
		System.out.println("x: "+ x);
		
		// 나누기 할 때 0으로 나누지 않도록 조심
		int b = 10;
//		int c = b / 0;
		
		double d = 7.3;
		double e = d / 0;
		System.out.println("d/0: "+ e); // infinity
		
		// 나머지
		int f = 10 % 3;
		System.out.println(f);
		// 특징이 0부터 ~ 나머지 하는 숫자보다 하나 작은 것만 나온다
		
		int num = 149;
		int num100 = num/100;
		int num10 = num%100/10;
		int num1 = num%10;
		System.out.println("백의 자리: "+ num100);
		System.out.println("십의 자리: "+ num10);
		System.out.println("일의 자리: "+ num1);
		
		System.out.println(0.1);
		System.out.println(0.1f);
		System.out.println(0.1 == 0.1f);
		// 소수점은 근사치로 저장된다
		//그나마 같은 타입으로 변환해서 비교하면 수월하다
		
		String s1 = "s1";
		String s2 = "s1";
		System.out.println(s1.equals(s2));
		// 글씨는 무조건 equals()로 비교한다
		System.out.println("asdg".equals(s1));
		
		int c1 = 22;
		int c2 = 4;
		System.out.println("몫: "+ c1/c2);
		System.out.println("나머지: "+ c1%c2);
		
		// 문제1
		// 난 돈이 10000원 있음
		// 1. 4500원 짜리 쌍화차를 최대 몇 잔 살 수 있는가?
		int me = 10000;
		int sa = 4500;
		System.out.println("최대 "+ me/sa + "잔");
		// 2. 그리고 남는 돈은?
		System.out.println("남는 돈: "+ me%sa + "원");
		
		// 문제2
		// 올영에서 꿀홍차가 8000원인데
		// 15% 세일! 그렇다면 가격은?
		int hu = 8000;
		System.out.println("15% 세일가: "+ hu/100*(100-15) + "원!");
		
		// 문제3-0
		// 1234를 10의자리 이하 버림
		int w1 = 1234;
		System.out.println("결과: " + w1/100*100);
		// 문제3
		double v1 = 1000;
		double v2 = 794.0;
		double v3 = (int)(v1/v2*1000);
		// v1/v2를 소수점 3자리 까지만 출력하시오
		// 오칙연산만 쓰기
		System.out.println("소수점 3자리: "+ (double)(v3/1000));
		
		// 문제4
		// 17000원이 있을 때
		// 5000원 몇 장
		// 1000원 몇 장
		int man = 17000;
		int fth = man/5000;
		int oth = man%5000/1000;
		System.out.println("5000원: "+ fth + "장");
		System.out.println("1000원: "+ oth + "장");
		
		// 삼항 연산자
		int s = 95;
		String grade = ( s > 90 ) ? "A" : "B" ;
		System.out.println("grade: " + grade);
		
		
	}

}
