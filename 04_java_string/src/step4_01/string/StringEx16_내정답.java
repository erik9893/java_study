package step4_01.string;

import java.util.Scanner;

/*
 * # 단어 검색
 * 1. 단어를 입력받아 text변수 문장 속에 해당 단어가 있는지 검색한다.
 * 2. 단어가 존재하면 true
 *    단어가 없으면 false를 출력한다.
 */

// 16 : 09 시작
// 16 : 23 종료
public class StringEx16_내정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);
		
		System.out.print("검색할 단어를 입력하세요 : ");
		String word = scan.next();

		String[] temp = text.split(" ");
		
		int check = -1;
		for (int i = 0; i < temp.length; i++) {
			if(word.compareTo(temp[i]) == 0) {
				check = 1;
			}
				
		}
		
		if(check == -1) {
			System.out.println(false);
		}else if(check == 1) {
			System.out.println(true);
		}
		
	}

}
