package step4_01.string;

import java.util.Random;
import java.util.Scanner;

/*
	문제) 영어단어 맞추기  
	영어단어가 전부 * 로 표시된다. 
	영어단어를 입력받고 틀릴때마다 랜덤으로 한글자씩 벗겨진다. (점수는 5점씩 감점)
	 조건) 만약에 같은 철자가 여러개면 한번에 벗겨진다. 
	전부 벗겨지거나 맞추면 종료 
*/

// 15 : 26 시작  
// 16 : 30 종료 (10분 휴식)
public class StringEx18_내정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int score = 100;
		String word = "performance";
		String meaning = "공연";
		int size = word.length();
		int check[] = new int[size];  // 힌트 체크를 통해서 확인할수있다.
		// 1이면 같은 철자 확인 0이면 *표시
		while (true) {
			
			System.out.println("뜻 : " + meaning);
			System.out.print("문제 : ");
			for (int i =0; i< size; i++) {
				if(check[i] == 1) {// 같은 철자 확인
					System.out.print(word.charAt(i));
				}else if(check[i] == 0) {
					System.out.print("*");
				}
				
			}
			System.out.println();
			System.out.println("영어단어를 입력하세요 >>> ");
			String me = scan.next();
			
			
			if(!me.equals(word)) {
				int r = ran.nextInt(size);
				if(check[r] == 0) {
					check[r] = 1;
					
				}
				for (int i = 0; i < size; i++) {
					if(word.charAt(i) == me.charAt(i)) {
						check[i] = 1;
					}
				}
				score -= 5;		
				
			}else if(me.equals(word)) {
				System.out.println("정답!");
				System.out.println("점수 : " + score + "점");
				break;
			}
			
		}

	}

}
