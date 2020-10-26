package step6_01.classObject;


import java.util.Scanner;

//class Ex04 {
//
//	int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
//	int[] scores  = new int[5];
//	
//}



public class ClassEx04_내정답 {

	public static void main(String[] args) {
		Ex04 e = new Ex04();
		
		// 문제1) scores배열에 1~100점 사이의 정수를 5개 저장
		// 예   1) 87, 11, 92, 14, 47
		e.scores[0] = 87;
		e.scores[1] = 11;
		e.scores[2] = 92;
		e.scores[3] = 14;
		e.scores[4] = 47;
		// 문제2) 전교생의 총점과 평균 출력
		// 예   2) 총점(251) 평균(50.2)
		int tot = 0;
		for (int i = 0; i < e.scores.length; i++) {
			tot = tot + e.scores[i];
		}
		double ave = tot / (double)e.scores.length;
		
		System.out.println("총점 = " + tot);
		System.out.println("평균 = " + ave);
		
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예   3) 2명
		int cnt = 0;
		for (int i = 0; i < e.scores.length; i++) {
			if(e.scores[i] >= 60 && e.scores[i] <= 100) {
				cnt ++;
			}
		}
		System.out.println(cnt + "명");
		// 문제4) 인덱스를 입력받아 성적 출력
		// 정답4) 인덱스 입력 : 1	성적 : 11점
		Scanner scan = new Scanner(System.in);
		System.out.print("인덱스 입력 : ");
		int idx = scan.nextInt();
		
		System.out.println("성적 : " + e.scores[idx] + "점");
		// 문제5) 성적을 입력받아 인덱스 출력
		// 정답5) 성적 입력 : 11		인덱스 : 1
		System.out.print("성적 입력 : ");
		int score = scan.nextInt();
		idx = 0;
		for (int i = 0; i < e.scores.length; i++) {
			if(e.scores[i] == score) {
				idx = i;
			}
		}
		System.out.println("인덱스 : " + idx);
		// 문제6) 학번을 입력받아 성적 출력
		// 정답6) 학번 입력 : 1003	성적 : 45점
		System.out.print("학번 입력 : ");
		int hak = scan.nextInt();
		idx = 0;
		for (int i = 0; i < e.hakbuns.length; i++) {
			if(e.hakbuns[i] == hak) {
				idx = i;
			}
		}
		System.out.println("성적 : " + e.scores[idx]);
		// 문제7) 학번을 입력받아 성적 출력
		// 		단, 없는학번 입력 시 예외처리
		// 예   7)
		// 학번 입력 : 1002		성적 : 11점
		// 학번 입력 : 1000		해당학번은 존재하지 않습니다.
		System.out.print("학번 입력 : ");
		int hak2 = scan.nextInt();
		idx = -1;
		for (int i = 0; i < e.hakbuns.length; i++) {
			if(e.hakbuns[i] == hak2) {
				idx = i;
			}
		}
		if(idx != -1) {
			System.out.println("성적 : " + e.scores[idx]);
		}else {
			System.out.println("해당학번은 존재하지 않습니다.");
		}
		// 문제8) 1등학생의 학번과 성적 출력
		// 정답8) 1004번(98점)
		int maxIdx = 0;
		int maxScore = 0;
		for (int i = 0; i < e.scores.length; i++) {
			if(e.scores[i] >= maxScore) {
				maxIdx = i;
				maxScore = e.scores[i];
			}
		}
		System.out.println("1등 학생의 학번 : " + e.hakbuns[maxIdx] + ", 점수 : " + maxScore);
	}

}
