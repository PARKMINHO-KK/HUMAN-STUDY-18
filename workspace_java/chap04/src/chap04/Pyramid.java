package chap04;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
/*
 * ___+___
 * __+++__
 * _+++++_
 * +++++++
 */
		// 1단계
        // +++++
		Scanner plus = new Scanner(System.in);
		int iplus = plus.nextInt();
		
		for(int start = 1; start <= iplus; start++) {
			System.out.print("+");
		}
		System.out.println();
        
        // 2단계
        // +_+_+_+_+_
		for(int start = 1; start <= iplus; start++) {
			System.out.print("+_");
		}
		System.out.println();
        
        // 3단계
        // +++++
        // +++++
        // +++++
		int end = 3;
		for(int start = 1; start <=end; start++) {
			for(int start1 = 1; start1 <= iplus; start1++) {
				System.out.print("+");
			}
			System.out.println();
		}
        
        // 4단계
        // 11111
        // 22222
        // 33333
        // 44444
        // 55555
		end=5;
		for(int start = 1; start <=end; start++) {
			for(int start1 = 1; start1 <= iplus; start1++) {
				System.out.print(start);
			}
			System.out.println();
		}
        
        // 5단계
        // 1
        // 22
        // 333
        // 4444
        // 55555
		end=5;
		for(int start = 1; start <=end; start++) {
			for(int start1 = 1; start1 <= start; start1++ ) {
				System.out.print(start);
			}
			System.out.println();
		}
        
        // 6단계
        // +
        // ++
        // +++
        // ++++
        // +++++
		end=5;
		for(int start = 1; start <=end; start++) {
			for(int start1 = 1; start1 <= start; start1++ ) {
				System.out.print("+");
			}
			System.out.println();
		}
        
        // 7단계
        // 11111
        // 2222
        // 333
        // 44
        // 5
		end=5;
		for(int start = 1; start <=end; start++) {
			for(int start1 = 5; start1 >= start; start1-- ) {
				System.out.print(start);
			}
			System.out.println();
		}
        
        // 8단계
        // +____
        // ++___
        // +++__
        // ++++_
        // +++++
		end=5;
		for(int start = 1; start <=end; start++) {
			for(int start1 = 1; start1 <= start; start1++ ) {
				System.out.print("+");
			}
			for(int start2 = (end-1); start2 >= start; start2-- ) {
				System.out.print("_");
			}
			System.out.println();
		}
        
        // 9단계
        // ____+
        // ___++
        // __+++
        // _++++
        // +++++
		end=5;
		for(int start = 1; start <=end; start++) {
			for(int start2 = (end-1); start2 >= start; start2-- ) {
				System.out.print("_");
			}
			for(int start1 = 1; start1 <= start; start1++ ) {
				System.out.print("+");
			}
			System.out.println();
		}
        
        // 10단계
        // ____+
        // ___+++
        // __+++++
        // _+++++++
        // +++++++++
		end=5;
		for(int start = 1; start <=end; start++) {
			for(int start2 = (end-1); start2 >= start; start2-- ) {
				System.out.print("_");
			}
			for(int start1 = 1; start1 <= (start+(start-1)); start1++ ) {
				System.out.print("+");
			}
			System.out.println();
		}
        
        // 11단계
        // ____+____
        // ___+++___
        // __+++++__
        // _+++++++_
        // +++++++++
		end=5;
		for(int start = 1; start <=end; start++) {
			for(int start2 = (end-1); start2 >= start; start2-- ) {
				System.out.print("_");
			}
			for(int start1 = 1; start1 <= (start+(start-1)); start1++ ) {
				System.out.print("+");
			}
			for(int start2 = (end-1); start2 >= start; start2-- ) {
				System.out.print("_");
			}
			System.out.println();
		}
        
        // 12단계
        // 입력 받은 줄 수 대로 출력
		int end1 = plus.nextInt();
		end=5;
		for(int start = 1; start <=end1; start++) {
			for(int start2 = (end1-1); start2 >= start; start2-- ) {
				System.out.print("_");
			}
			for(int start1 = 1; start1 <= (start+(start-1)); start1++ ) {
				System.out.print("+");
			}
			for(int start2 = (end1-1); start2 >= start; start2-- ) {
				System.out.print("_");
			}
			System.out.println();
		}
		
		
	}

}


