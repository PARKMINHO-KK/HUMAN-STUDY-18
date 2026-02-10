package quiz06;

public class EmpExam {

	public static void main(String[] args) {

		Emp emp1 = new Emp();
		Emp emp2 = new Emp();
		Emp emp3 = new Emp();
		Emp emp4 = new Emp();
		
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
		
		emp4.empno = 2001;
		emp4.ename = "최유진";
		emp4.job = "사원";
		emp4.sal = 3000;
		emp4.mgr = 1002;
		
		EmpTable emptable = new EmpTable();
		
		emptable.addEmp(emp1);
		emptable.addEmp(emp2);
		emptable.addEmp(emp3);
		emptable.addEmp(emp4);
		
//		emptable.info(); // 모든 사원정보 출력
//		
//		emptable.compare(4000); // 6-1 매개변수보다 높은 연봉 사원 출력
		
		emptable.isMgr(2001); // 상사정보 출력
		
		
		
//		EmpTable emp4 = new EmpTable();
		
//		emp4.addEmp(2001, "최유진", "사원", 3000, 2002);
		
//		Emp[] list = new Emp[6];
//		list[0] = emp1;
//		list[1] = emp2;
//		list[2] = emp3;
//		list[3] = emp4;
//		list[4] = emp5;
//		list[5] = emp6;
		
		
	}

}
