package quiz05;

import java.util.ArrayList;

public class EmpExam {

	public static void main(String[] args) {
		
		Emp emp1 = new Emp();
		Emp emp2 = new Emp();
		Emp emp3 = new Emp();
		
		emp1.empno = 1001;
		emp1.ename = "김민호";
		emp1.job = "사원";
		emp1.sal = 3200;
		emp1.mgr = 1002;
		
		emp2.empno = 1002;
		emp2.ename = "이지훈";
		emp2.job = "대리";
		emp2.sal = 4200;
		emp2.mgr = 1003;
		
		emp3.empno = 1003;
		emp3.ename = "박수진";
		emp3.job = "과장";
		emp3.sal = 5500;
		emp3.mgr = null;
		
//		int[] empno_list = new int[3];
//		empno_list[0] = 1001;
//		empno_list[1] = 1002;
//		empno_list[2] = 1003;
		
//		Emp[] emp_list = new Emp[3]; // Array로 풀이
//		emp_list[0] = emp1;
//		emp_list[1] = emp2;
//		emp_list[2] = emp3;
		
		ArrayList<Emp> emp_list = new ArrayList(); // ArrayList로 풀이
		emp_list.add(emp1);
		emp_list.add(emp2);
		emp_list.add(emp3);
		
//		for(int i=0; i<emp_list.length; i++) { // Array for문
////			String a = "emp"+(i+1);
//			emp_list[i].info();
//		}
		
		for(int i=0; i<emp_list.size(); i++) { // ArrayList for문
			emp_list.get(i).info();
		}

	}

}
