package quiz05;

public class Emp {

	int empno;
	String ename;
	String job;
	int sal;
	Integer mgr;
	
//	public void info(
//			int empno, String ename, String job,
//			int sal, Integer mgr
//			) {
//		this.empno = empno;
//		this.ename = ename;
//		this.job = job;
//		this.sal = sal;
//		this.mgr = mgr;
//		
//		System.out.println("사번 : "+ empno);
//		System.out.println("이름 : "+ ename);
//		System.out.println("직급 : "+ job);
//		System.out.println("연봉 : "+ sal);
//		System.out.println("상사의 사번 : "+ mgr);
//		System.out.println("");
	
	public void info() {
		System.out.println("사번 : "+ this.empno);
		System.out.println("이름 : "+ ename);
		System.out.println("직급 : "+ job);
		System.out.println("연봉 : "+ sal);
		System.out.println("상사의 사번 : "+ mgr);
		System.out.println("");
	}
	
}
