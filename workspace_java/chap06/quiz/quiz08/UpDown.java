package quiz08;

import java.util.Scanner;

public class UpDown {
	
	void play() {
		int answer = (int)(Math.random()*10+1);
		
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		int count = 0;
		
		do {
			System.out.println("-----------------------------");
			System.out.println("Up/Down Game Start");
			System.out.println("1~10 사이의 숫자를 입력하세요");
			System.out.println("-----------------------------");
			
			int a = sc.nextInt();
			
			if(answer == a) {
				count++;
				System.out.println("입력한 숫자 : " + a);
				System.out.println("결과는 : 정답입니다.");
				System.out.println("시도횟수 : " + count + "회");
				flag = false;
			} else if(a > 0 && a < answer) {
				count++;
				System.out.println("입력한 숫자 : " + a);
				System.out.println("결과는 : Up");
			} else if(a < 11 && a > answer) {
				count++;
				System.out.println("입력한 숫자 : " + a);
				System.out.println("결과는 : Down");
			} else {
				count++;
				System.out.println("입력한 숫자 : " + a);
				System.out.println("다시 입력해 주세요");
			}
			
		} while(flag);
		
		sc.close();
	}

}
