package step4_01.string;


public class StringEx05_내정답 {

	public static void main(String[] args) {

		String jumin = "890101-2012932";
		// 문제 1) 나이 출력
		// 정답 1) 32세
		String fr = jumin.substring(0, 3);
		String strage = "19" + jumin.substring(0, 2); // 1989
		
		int num = Integer.parseInt(strage);
		int age = 2020 - num + 1;
		
		String answer = "";
		answer += age + "";
		
		System.out.println(answer + "세");
		// 문제 2) 성별 출력
		// 정답 2) 여성

		char ch = jumin.charAt(7);
		
		if(ch == '2') {
			System.out.println("여성");
		}else if(ch == '1') {
			System.out.println("남성");
		}
		
			
			
	}

}
