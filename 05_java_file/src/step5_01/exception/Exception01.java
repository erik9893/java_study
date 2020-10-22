package step5_01.exception;

/*
 * 
 * 예외 (Exception) 처리
 * 
 * 심각한 오류를 발생시킬 수 있는 내용은
 * try, catch 구문안에 마나들도록 강제한다.
 * 
 * try : 에러가 나ㅏ지 않을 경우 정상적으로 실행 될 명령어
 * catch : try{} 안의 명령어가 실행되는 중 에러가 발생할 경우 분기 되는 명령어
 * 
 * -try 없이 catch가 단독으로 올 수 없고, catch 없이 try가 단독으로 올 수 없다.
 * 
 */

public class Exception01 {

	public static void main(String[] args) {

		try {
		int[] testArr = new int[5];
		
//		System.out.println(testArr[0]); // 일반적인 경우
		System.out.println(testArr[999]); // 배열 범위 초과
//		System.out.println(testArr[0]/0); // 연산에러
		}catch(ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();//에러 메세지도 띄워줌
			System.out.println("배열 범위 초과 에러");
		}catch (ArithmeticException e) {
			System.out.println("0으로 나눈 에러");
		}catch (Exception e) {
			System.out.println("모든 에러처리 ( 모든 에러클래스의 에러의 조상 )");
		}
	}

}
