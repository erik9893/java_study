package step6_02.method;

class Student1{
	
	/*
	 * 
	 * #클래스의 구성요소
	 * 
	 * [1] 변수
	 * [2] 메서드 (method)
	 * 
	 * 2-1) void : return 타입 (int , double, char, int[], String)
	 * 2-2) say : 메서드명 ( 주로 소문자로 시작하고 동사형태로 작성한다. )
	 * 2-3) () : 입력값을 받는 부분
	 * 2-4) {} : method의 영역
	 * 2-5) return : 반환값
	 * 	
	 */
	
	
	
	//변수
	
	//메서드
	
	void say() {//void위치는 return값에 따라 int,String등으로 입력
		System.out.println("안녕하세요.");
//		return; // return값이 void(없다)일때는 생략가능
	}
}

public class MethodEx01 {

	public static void main(String[] args) {
		Student1 std = new Student1();
		
		std.say();

	}

}
