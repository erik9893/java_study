package step4_01.string;

//  시작
//

public class StringEx19_테스트문제 {

	public static void main(String[] args) {
		
		String [][] student = {{"aaa","신촌","1001"}, {"bbb","강남","1002" },
				{"ccc" ,"대치", "1003"} , {"ddd" , "강동","1004"}};
		String[][] score = {
				{"1001" ,"100" ,"20" , "30"},
				{"1002" ,"10" ,"60" , "60"},
				{"1003" ,"23" ,"63" , "31"},
				{"1004" ,"45" ,"30" , "35"},
		};

		//학생 정보와 성적이 담긴 데이터 이다 
		//student ==> 1.id 2.주소 3.번호
		//score ==> 1.번호 2.국어 3.수학 4.영어 점수 이다 
		//문제1) 전체 성적이 1등인 학생 이름 출력 

		//각 번호별 점수를 합해서 비교한다.
		//비교후 가장 큰 값을 갖고 있는 번호의 인덱스 값을 student배열을 찾아
		// split으로 이름,주소,번호를 나눠 저장한 후 이름만 출력
		
		String maxKor = "";
		String maxMat = "";
		String maxEng = "";
		
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score.length; j++) {
				
			}
		}
	}

}
