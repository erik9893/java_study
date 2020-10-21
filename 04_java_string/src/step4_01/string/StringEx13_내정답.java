package step4_01.string;

// # 정렬 (사전순으로 정렬해 보시오.)
// 15 : 06 시작
// 15 : 10 종료
public class StringEx13_내정답 {

	public static void main(String[] args) {
		
		String[] names = {"홍길동", "김유신", "마동석", "자바킹", "서동요"};
		
		for (int i = 0; i < names.length; i++) {
			String min = names[i];
			int minIdx = i;
			for (int j = i; j < names.length; j++) {
				if(min.compareTo(names[j]) > 0) {
					min = names[j];
					minIdx = j;
				}
			}
			
			String temp = names[i];
			names[i] = names[minIdx];
			names[minIdx] = temp;
		}		
		
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}
		
	}

}
