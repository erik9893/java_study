package step4_01.string;

import java.util.Scanner;

/*
 * # 문자열 속 숫자검사
 * 예) adklajsiod
 * 	     문자만 있다.
 * 예) 123123
 *    숫자만 있다.
 * 예) dasd12312asd
 *    문자와 숫자가 섞여있다.
 */

//15 : 38 시작
//15 : 43 종료
public class StringEx15_내정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		
		System.out.print("입력 : ");
		String text = scan.next();
		
		int cnt = 0;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < text.length(); j++) {
				if(num[i] == text.charAt(j)) {
					cnt ++;
				}
			}
		}
		
		if(cnt == text.length()) {
			System.out.println("숫자만 있다.");
		}else if(cnt == 0) {
			System.out.println("문자만 있다.");
		}else {
			System.out.println("문자와 숫자가 섞여 있다.");
		}
	}

	
}
