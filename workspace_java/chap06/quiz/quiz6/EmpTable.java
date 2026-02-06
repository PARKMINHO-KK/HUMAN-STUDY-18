package quiz6;

import java.util.ArrayList;

public class EmpTable {

	ArrayList<Emp> list = new ArrayList();
	
	void addEmp(Emp emp) {
		list.add(emp);
	}
	
//	Emp addEmp(
//				int empno,
//				String ename,
//				String job,
//				int sal,
//				Integer mgr	) 
//			{
//				e.empno = empno;
//				e.ename = ename;
//				e.job = job;
//				e.sal = sal;
//				e.mgr = mgr;		
//				return new Emp();
//}  
	
	
	void info() {
		for(int i=0; i<list.size(); i++) {
			Emp emp = list.get(i); 
			System.out.println("사번 : "+ emp.empno);
			System.out.println("이름 : "+ emp.ename);
			System.out.println("직급 : "+ emp.job);
			System.out.println("연봉 : "+ emp.sal);
			System.out.println("상사의 사번 : "+ emp.mgr);
			System.out.println("");			
		}
	}
	
	void compare(int sal) {
		for(int i=0; i<list.size(); i++) {
			Emp emp = list.get(i);
			if(emp.sal > sal) {
				System.out.println("사번 : "+ emp.empno);
				System.out.println("이름 : "+ emp.ename);
				System.out.println("직급 : "+ emp.job);
				System.out.println("연봉 : "+ emp.sal);
				System.out.println("상사의 사번 : "+ emp.mgr);
				System.out.println("");
			}
		}
	}
	
	
	void isMgr(int empno) {
		boolean findEmpno = false;
		boolean findMgr = false;
		for(int i=0; i<list.size(); i++) {
			Emp emp = list.get(i);
			if(empno == emp.empno) {
				findEmpno = true;
				Integer a = emp.mgr;
				if(a == null) {
					System.out.println("상사없음");
					a = 0;
				}
				for(int j=0; j<list.size(); j++) {
					emp = list.get(j);
					if(a == emp.empno) {
						findMgr = true;
						System.out.println("상사사번 : "+ emp.empno);
						System.out.println("상사이름 : "+ emp.ename);
						System.out.println("상사직급 : "+ emp.job);
						System.out.println("상사연봉 : "+ emp.sal);
						System.out.println("상사상사의 사번 : "+ emp.mgr);
						System.out.println("");		
					} // else { // for문 내에서 출력하면 찾기 전까지 반복하여 출력
//						System.out.println("상사가 없는 사원입니다");
//					}
				}
			} //else { // for문 내에서 출력하면 찾기 전까지 반복하여 출력
//				System.out.println("없는 사원번호 입니다");
//			}
		}
		if(!findEmpno) {
			System.out.println("없는 사원번호 입니다");
		}
//		if(!findMgr) {
//			System.out.println("상사가 없는 사원입니다");
//		}
	}
	
	
}
