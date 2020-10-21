package step4_01.string;

import java.util.Scanner;

/*
 * # 끝말잇기 게임
 * 제시어 : 자전거
 * 입력 : 거미
 * 제시어 : 거미
 * 입력 : 미술
 * ...
 */

public class StringEx10_내정답 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String start = "자전거";
		
		while(true) {
			System.out.println("제시어 : " + start);

			System.out.print("입력 : ");
			String word = scan.next();
			
			int size = word.length();
			for (int i = 0; i < word.length(); i++) {
				if(start.charAt(size - 1) == word.charAt(0)) {
					start = word;
				}
			}
		}

		
	}

}
