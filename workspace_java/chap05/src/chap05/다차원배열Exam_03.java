package chap05;

public class 다차원배열Exam_03 {

	public static void main(String[] args) {

		int a0 = 5;
		int a1 = 15;
		int a2 = 34;
		
		int[] b0 =new int[3];
		// b의 첫번째 변수에 a0 넣기
		// 두번째 변수에 a1 넣기
		
		b0[0] = a0;
		b0[1] = a1;
		b0[2] = a2;
		
		int[] b1 = new int[3];
		b1[0] = a0+1;
		b1[1] = a1+1;
		b1[2] = a2+1;
		
		// b0와 b1을 배열로 만들기
		int[] [] c0 = new int[2] [3];
		c0[0] = b0;
		c0[1] = b1;
		
		System.out.println(c0[0][1] == a1);
		
		System.out.println("c0.length: "+ c0.length);
		System.out.println("b1의 길이: "+ c0[1].length);
		
		int[][]c1 = new int[][] {{1,2,3},{4,5,6}};
		int[][]c2 = {
						{1,2,3},
						{4,5,6,7}
					};
	
		System.out.println(c0);
		System.out.println(c0[0]);
		System.out.println(c0[0][0]);
		
		/////////////////////////////////////////////////
		System.out.println("----------------------------");
		
		int k1 = 10;
		int k2 = k1;
		System.out.println("k2: "+ k2);
		k1 = 5;
		System.out.println("k2: "+ k2);
		
		int[] d1 = {1,2,3};
		// 얕은 복사( call by reference )
		// = 기호는 stack의 값(또는 주소)만 복사
		// 값을 변경하는 경우 원본도 바뀐다
		int[] d2 = d1;
		
		System.out.println(d2[0]);
		d1[0] = 4;
		System.out.println(d2[0]);
		
		System.out.println(d1[2]);
		d1[2] = 40;
		System.out.println(d2[2]);
		
		// 깊은 복사( call by value )
//		int[] d3 = new int[d1.length];
//		for(int i=0; 1<d1.length; i++) {
//			d3[i] = d1[i];
//		}
		
		// 문제1
		// 꼭 반복문 쓰기
		// 1~5, 11~15, 101~105 를 저장하는 2차원 배열을 만드시오
		int[][] dim = new int[3][5];
//		dim[0][0] = 1;
//		dim[0][1] = 2;
//		dim[0][2] = 3;
//		dim[0][3] = 4;
//		dim[0][4] = 5;
		for(int i=0; i<dim.length; i++) { // 1차원 반복문
			for(int j=0; j<dim[i].length; j++) { // 2차원 반복문
				if(i == 0) { // dim[0][] 일 때 모두
					dim[i][j] = j+1;
//					System.out.println(dim[i][j]);			// 출력을 하나의 반복문으로 하자		
				} else if(i == 1) { // dim[1][] 일 때 모두
					dim[i][j] = j+11;
//					System.out.println(dim[i][j]);          // 출력을 하나의 반복문으로 하자
				} else if(i == 2) { // dim[2][] 일 때 모두
					dim[i][j] = j+101;
//					System.out.println(dim[i][j]);          // 출력을 하나의 반복문으로 하자
				}
			}
		}
		for(int i=0; i<dim.length; i++) { // 하나의 반복문으로 출력
			for(int j=0; j<dim[i].length; j++) {
				System.out.println("dim["+ i +"]["+ j +"] = "+ dim[i][j]);
			}
		}
		
		System.out.println("----------------------------------");
		// 그리고 거기말고 다른 반복으로 모두 출력하시오
		int[][] diff = new int[3][5];
		for(int i=0; i<diff.length; i++) { // 하나의 반복문으로 출력
			for(int j=0; j<dim[i].length; j++) {
				diff[i][j] = dim[i][j];
				System.out.println("diff["+ i +"]["+ j +"] = "+ diff[i][j]);
			}
		}
		
//		gpt 연습문제: 3차원 배열 기본 사용
//		다음 조건을 만족하는 자바 프로그램을 작성하세요.
//		조건
//		크기가 [2][3][4] 인 3차원 정수 배열을 선언한다.
//		배열의 모든 요소에 1부터 시작하는 정수를 순서대로 저장한다.
//		(예: 1, 2, 3, 4, …)
//		3중 반복문을 사용하여 배열에 저장된 모든 값을 출력한다.
//		출력 형식은 다음과 같이 한다.
//		[0][0][0] = 1
//		[0][0][1] = 2
//		...
//		[1][2][3] = 24
		
		int[][][] gpt = new int[2][3][4];
		int value = 1;
		for(int i=0; i<gpt.length; i++) { // 1차원 
			System.out.println("-----------"+ i + "층---------");
			for(int j=0; j<gpt[i].length; j++) { // 2차원
				for(int k=0; k<gpt[i][j].length; k++) { // 3차원
					gpt[i][j][k]=value;
					System.out.printf("[%d][%d][%d] = %d", i, j, k, value);
					System.out.println("");
					value++;
				}
			}
		}
		
		
		
	}
	
}
