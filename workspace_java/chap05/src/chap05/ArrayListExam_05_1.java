package chap05;

import java.util.ArrayList;

public class ArrayListExam_05_1 {

	public static void main(String[] args) {
		
		String a = "a1";
		String b = "b2";
		String c = "c3";
		
		ArrayList list = new ArrayList();
		list.add(a);
		list.add(1);
		list.add("박민호");
		
		String a1 = (String)list.get(0);
		
		System.out.println(a1);

	}

}
