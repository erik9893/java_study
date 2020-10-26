package step6_01.classObject;

import java.util.Random;
import java.util.Scanner;

/*
 * # 기억력 게임 : 클래스 + 변수
 * 1. front 배열 카드 10장을 섞는다.
 * 2. front 배열에서 같은 카드를 골라 카드의 위치를 입력한다.
 * 3. 선택한 2장의 카드가 같은 카드이면, back 배열에 표시한다.
 * 4. 모든 카드가 뒤집히면(back배열의 0이 사라지면) 게임은 종료된다. 
 */

/*
class Ex09{
	
	int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
	int[] back = new int[10];
	int answerCnt = 0;		
	
}
*/

public class ClassEx09_내정답 {

	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		Ex09 e = new Ex09();
		
		for (int i = 0; i < e.front.length; i++) {
			if(e.front[i] == 1) {System.out.print("☆ ");}
			else if(e.front[i] == 2) {System.out.print("★ ");}
			else if(e.front[i] == 3) {System.out.print("＃ ");}
			else if(e.front[i] == 4) {System.out.print("＆ ");}
			else if(e.front[i] == 5) {System.out.print("§ ");}
		}

	}

}
