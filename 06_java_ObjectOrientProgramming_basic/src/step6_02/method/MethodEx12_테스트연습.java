package step6_02.method;

import java.util.Random;

/*
 * # OMR카드 : 클래스 + 메서드
 * 1. 배열 answer는 시험문제의 정답지이다.
 * 2. 배열 hgd에 1~5 사이의 랜덤 숫자 5개를 저장한다.
 * 3. answer와 hgd 값을 비교해 정오표를 출력한다.
 * 4. 한 문제당 20점이다.
 * 예)
 * answer = {1, 3, 4, 2, 5}
 * hgd    = {1, 1, 4, 4, 3}
 * 정오표 = {O, X, O, X, X}
 * 성적   = 40점
 */

class ScoreMng1 {
	Random ran = new Random();
	
	int[] OMR = {1, 3, 4, 2, 5};		//답안지
	int[] myAnswer    = new int[5];		//내정답
	
	int cnt   = 0;	// 정답 개수
	int score = 0;	// 성적
	
	void makeAnswer() {
		for (int i = 0; i < myAnswer.length; i++) {
			myAnswer[i] = ran.nextInt(5)+1;
		}
	}
	
	void showAnswer() {
		System.out.print("OMR  = [");
		for (int i = 0; i < OMR.length; i++) {
			System.out.print(OMR[i] + " ");
		}
		System.out.println("]");
		
		System.out.print("me   = [");
		for (int i = 0; i < myAnswer.length; i++) {
			System.out.print(myAnswer[i] + " ");
		}
		System.out.println("]");
	}
	
	void checkAnswer() {
		cnt = 0;
		
		System.out.print("정오표 = [");
		for (int i = 0; i < OMR.length; i++) {
			if(OMR[i] == myAnswer[i]) {
				cnt ++;
				System.out.print("O ");
			}else {
				System.out.print("X ");
			}
		}
		System.out.println("]");
		
		score = cnt * 20;
		System.out.println("점 수 = " + score + "점");
	}
	
	
	void run() {
		showAnswer();
		makeAnswer();
		checkAnswer();
	}
	
}


public class MethodEx12_테스트연습 {

	public static void main(String[] args) {
		
		ScoreMng1 sm = new ScoreMng1();
		sm.run();

	}

}
