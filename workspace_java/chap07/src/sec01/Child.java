package sec01;

public class Child extends Parent {

	void printName() {
		System.out.println("Child의 printName 실행");
		
		System.out.println("name: "+ name);
		
		System.out.println("this.name: "+ this.name);
		
		String name = "지역변수 선언 가능";
		
		System.out.println("super.name: "+ super.name);
	}
	
	// 지역변수(전달인자)가 필드를 가리는 현상
	// shadow
	void setName(String name) {
		this.name = name;
	}
	
	// 자식 필드가 부모 필드를 가리는 현상
	// overshadow
	String name = "Child의 name";
	
	Child(){
		System.out.println("Child 생성자");
	}
	
}
