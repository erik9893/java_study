package step6_02.method;

/*
 * 
 * 메서드의 4가지 타입
 * 
 * 입력값(파라메타,매개변수,인자,인수,아규먼트)과
 * 결과값의 유무에 따라 4가지 형태로 나뉜다.
 * 
 * 입력값이 있고 , 결과값이 있다. ( 11 )
 * 입력값이 있고 , 결과값이 없다. ( 10 )
 * 입력값이 없고 , 결과값이 있다. ( 01 )
 * 입력값이 없고 , 결과값이 없다. ( 00 )
 * 
 * */

class MethodType {
	
	int type11(int arg1 , int arg2) {
		return arg1 + arg2;
	}
	
	void type10(int arg1, int arg2) {
		System.out.println(arg1 + arg2);
	}
	
}

public class MethodEx02 {

	public static void main(String[] args) {

		MethodType mt = new MethodType();
		
		// 입력값과 결과값이 모두 있는 경우
		int type11Res = mt.type11(100, 300); // return값을 변수에 저장
		System.out.println(type11Res);
		
		// 입력값은 있고 결과값이 없는 경우
		mt.type10(100, 300);
		
	
		
		
		
	}

}
