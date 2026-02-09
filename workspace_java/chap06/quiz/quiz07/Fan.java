package quiz07;

import java.util.Scanner;

public class Fan {

	void active() {
		boolean flag = true;
		boolean power = false;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("-----------------------------------");
			System.out.println("선풍기 Fan 동작 시스템");
			System.out.println("1.전원켜기 2.약풍 3.강풍 4.전원끄기");
			System.out.println("-----------------------------------");
			
			int a = sc.nextInt();
			
			if(a == 1) {
				if(power) {
					System.out.println("전원이 켜져 있습니다");
				} else {
					System.out.println("전원을 켭니다");
					power = true;
				}
			} else if (a == 2) {
				if(power) {
					System.out.println("약풍입니다");					
				} else {
					System.out.println("전원이 꺼져 있습니다");
				}
			} else if (a == 3) {
				if(power) {
					System.out.println("강풍입니다");					
				} else {
					System.out.println("전원이 꺼져 있습니다");
				}
			} else if (a == 4) {
				if(power) {
					System.out.println("전원을 끕니다");
					power = false;
					flag = false;
				} else {
					System.out.println("전원이 꺼져 있습니다");
				}
			} else {
				System.out.println("다시 입력해 주세요");
			}
		
		} while (flag);
		
		sc.close();
	}
	
}
