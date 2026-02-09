package quiz09;

import java.util.Scanner;

public class Calc {
	
	
	void calc() {
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("-----------------------------");
			System.out.println("문제9 좀 더 발전한 계산기");
			System.out.println("1. 계산하기   2. 종료하기");
			System.out.println("-----------------------------");
		
			int choice = sc.nextInt();
			
			
			if(choice == 1) {
				System.out.println("숫자, 연산자, 숫자 입력");
				double a = sc.nextDouble();
				String b = sc.next();
				double c = sc.nextDouble();
				
				double result = aaa(a, b, c);
				
			} else if (choice == 2) {
				System.out.println("종료합니다");
				flag = false;
			} else {
				System.out.println("1.계산하기와 2.종료하기중 선택해 주세요");
			}
		
		} while(flag);
		
	}
	
	double aaa(double a, String b, double c) {
	    double result;

	    if (b.equals("+")) {
	        result = a + c;
	    } else if (b.equals("-")) {
	        result = a - c;
	    } else if (b.equals("*")) {
	        result = a * c;
	    } else if (b.equals("/") && c != 0) {
	        result = a / c;
	    } else {
	        System.out.println("정확히 입력해 주세요");
	        return Double.NaN;
	    }

	    System.out.println(a + b + c + " = " + result);
	    return result;
	}


}
