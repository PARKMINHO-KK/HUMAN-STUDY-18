package _chap02;

public class VarTypeExam {

	public static void main(String[] args) {

		byte b1;
		b1 = 127;
		System.out.println("b1: "+ b1);
//		b1 = 128;
		
		char c1 = 65;
		System.out.println("c1: "+ c1);
		char c2 = 65 + 2;
		System.out.println("c2: "+ c2);
		char c3 = 'B';
		System.out.println("c3 - c1 : "+ (c3 - c1)    );
		
		// L또는 l을 붙이면 명시적인 long
		long l1 = 2200000000L;
		long l2 = 30;
		
		String s1 = "최민수";
		System.out.println("s1: "+ s1);
		
		String s2 = "최\"민수\"";
		System.out.println("s2: "+ s2);
		
		String s3 = "\\최\t민\n수";
		System.out.println("s3: "+ s3);
		
		System.out.println("글씨"+3);
		System.out.println("글씨"+ 3 + 2); //글씨 32
		System.out.println("글씨"+ (3 + 2)); //글씨 32
		System.out.println(3 + 2 +"글씨"); // 5글씨
		
//		int a = 3.14;
		
		float f1 = 3.14f;
		System.out.println("f1: "+ f1);
		
		double d1 = 3.14;
		System.out.println("d1: "+ d1);
		
		float f2 = 0.1234567890123f;
		System.out.println("f2: "+ f2);
		// float의 정밀도 : 소수점 7자리
		
		double d2 = 0.12345678901234567890;
		System.out.println("d2: "+ d2);
		// double의 정밀도 : 소수점 16자리
		
		double d3 = 5e3;
		System.out.println("d3: "+ d3);
		
		boolean stop = true;
		boolean start = false;
		System.out.println("stop: "+ stop);
		
		// 문제 1
		// 내 나이를 저장
		int ca = 38;
		System.out.println("age: "+ ca);
		
		
		// 문제 2
		// 운전면허가 있다/없다
		boolean yes = true;
		System.out.println("licence: "+ yes);
		
		
		// 문제 3
		// 우리집에 있는 스마트 폰의 개수
		int ph = 2;
		System.out.println("phone: "+ ph);
		
		// 문제 4
		// 내 이름 저장
		String na = "minhopark";
		System.out.println("name: "+ na);
		
		
		// 문제 5
		// 1평은 3.3제곱미터, 5평이 몇 제곱미터인지 (계산해서) 저장
		double py = 3.3*5;
		System.out.println("pyung: "+ py);
		
		// 문제 6
		// 6-1 : 두 변수 x, y에 각각 숫자를 넣고
		// 출력 결과 : "3 > 4 결과는 false 입니다"
		int x = 3;
		int y = 4;
		System.out.println(x + ">" + y + "결과는" + (x>y));
		
		
		// 6-2 : x, y 값 바꿔서 정답 나오는지 출력
		System.out.println(x + "<" + y + "결과는" + (x<y));
		
		// 문제 7
		/*
		 * 숫자 149
		 * ---------
		 * 출력 결과
		 * ---------
		 * "백의 자리 : 1"
		 * "십의 자리 : 4"
		 * "일의 자리 : 9"
		 */
		
		int num = 149;
		System.out.println("백의 자리: " + num/100);
		System.out.println("십의 자리: " + (num-(num/100*100))/10);
		System.out.println("일의 자리: " + (num-(num/10*10)));
		
		
		// 문제 8
		// 회식비 43000원
		// 참석인원 4명
		// 인당얼마?
		// 8-1 : 디테일하게 원단위까지
		// 8-2 : 만원 단위까지만 받기
		// 8-2-1 : 주최자는 얼마 내야하는가?
		
		int num2 = 43000;
		int t1 = num2/4;
		int t2 = t1/10000*10000;
		
		System.out.println("인당 원: " + t1);
		System.out.println("인당 만원: " + t2);
		System.out.println("주최자: " + (num2-(t2*3)));
		
		// 문제 9
		String left = "오예스";
		String right = "사탕";
		
		//뭔가 하기
		String center = left;
		left = right;
		right = center;
		System.out.println("left: " + left); // 사탕
		System.out.println("right: " + right); // 오예스
		
		
		
	}

}
