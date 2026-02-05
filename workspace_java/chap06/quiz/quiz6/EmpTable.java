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
	
}
