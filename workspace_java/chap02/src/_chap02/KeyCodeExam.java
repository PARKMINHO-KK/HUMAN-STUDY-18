package _chap02;

import java.util.Scanner;

public class KeyCodeExam {

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);

		System.out.print(3);
		System.out.print(4);
		
		System.out.println(5);
		System.out.println(); // <br>처럼 걍 엔터
		System.out.println(6);
		System.out.println("---------------");
		
		String name = "박민호";
		int age = 38;
		System.out.println("이름: " + name +", 나이: "+ age);
		System.out.printf("이름: %s, 나이: %d\n", name, age);
		System.out.println(1111);

		/////////////////////
		// 입력
		int keyCode;
		
		// Scanner 연습하려고 주석 처리함

		/*
		try {
			System.out.print("입력하시오 >> ");
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} */
		
		/* 이클립스 단축기
		필요한것 불러오기 : 컨트롤+쉬프트+O 
		한줄 지우기 : 컨트롤+d
		한줄 복사 : 컨트롤+알트+위 또는 아래 방향키
		뒤로 : 컨트롤 + z
		앞으로 : 컨트롤 + y
		주석 단축키 : 컨트롤 + /
		자동정렬 : 컨트롤+쉬프트+f
		*/
		Scanner scanner = new Scanner(System.in);
		// 엔터까지의 모든 글씨
		String inputDate = scanner.nextLine();
		System.out.println("inputDate: " + inputDate);
		
		// 엔터 쳤을 때 첫번째 띄어쓰기 까지만
//		inputDate = scanner.next();
//		System.out.println("inputDate: " + inputDate);
		
		//문제 
		// 나이를 입력하고 +1 해서 출력
//		int age38 = 38; 내가 한것
//		System.out.println("나이+1: " + (age38+1));
		System.out.println("나이를 입력하세요");
//		String age2 = scanner.nextLine();
//		int age3 = Integer.parseInt(age2);
		
		int age3 = scanner.nextInt();
		
		System.out.println("내년엔 "+ (age3 + 1) +"살 입니다");
		
		
		
		
	}

}
