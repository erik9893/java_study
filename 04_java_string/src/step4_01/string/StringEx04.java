package step4_01.string;

//문자열 관련 형변환

public class StringEx04 {

	public static void main(String[] args) {
		
		//문자열 -> 숫자 	ex)	"10" -> 10
		
		String strNum = "10";
		int num = Integer.parseInt(strNum);
		System.out.println(num + 1); 	// 11
		
		//숫자 -> 문자열	ex) 10 -> "10"

		// 방법1)
		strNum = num + "";
		System.out.println(strNum + 1); // 101
		
		// 방법2)
		strNum = Integer.toString(num);
		System.out.println(strNum + 1); // 101
		
		// 방법3)
		strNum = String.valueOf(num);
		System.out.println(strNum + 1); // 101
		
		// 번외
		// 구글에 ASCII 코드 검색 (대문자 A, 소문자 a 가능한 암기)
		
		// 문자 -> 숫자
		char ch = 'a';
		int aNum = (int)ch;
		System.out.println(aNum); // 97
		
		// 숫자 -> 문자
		ch = (char)(aNum + 1);
		System.out.println(ch); // b
		
		// a to z 출력
	/*	for (int i = 0; i < 26; i++) {
	*		ch = (char)(aNum + i);
	*		System.out.println(ch);
	*	} 
	*/	
		
	}

}