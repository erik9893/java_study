package step4_01.string;

import java.util.Scanner;

/*
 * # 단어 교체하기(replace)
 * 1. text변수 문장 속에서 변경하고 싶은 단어를 입력받아,
 * 2. 교체해주는 기능을 구현한다.
 * 예)
 * 		Life is too short.
 * 		변경하고 싶은 단어입력 : Life
 * 		바꿀 단어입력 : Time
 * 
 * 		Time is too short.
 */


public class StringEx17_내정답 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);
		
		System.out.print("변경하고 싶은 단어를 입력하세요 : ");
		String word = scan.nextLine();
		
		String[] temp = text.split(" ");
		
		int check = -1;
		for (int i = 0; i < temp.length; i++) {
			if(word.compareTo(temp[i]) == 0) {
				check = 1;
			}
				
		}
		
		if(check == 1) {
			System.out.print("바꿀 단어 입력 : ");
			String change = scan.next();
			
			for (int i = 0; i < temp.length; i++) {
				if(word.compareTo(temp[i]) == 0) {
					temp[i] = change;
				}
				System.out.print(temp[i] + " ");
			}
			
		}else {
			System.out.println("입력한 단어와 일치하는 단어가 없습니다.");
		}

	}

}
