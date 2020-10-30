package step7_01.classArray;

// 문자열(1단계)[문제]


class StudentList{

	String name;
	int score;
	
	void print() {
		System.out.println(this.name + " : " + this.score);
	}
	
}



public class ClassArrayEx11_문제 {

	public static void main(String[] args) {
		
		String data = "3\n"; 				// studentList의 크기
		data +="김영희/30\n";				// 이름/성적
		data += "이만수/40\n";
		data += "이철민/60";
		
		//StudentList[] st;  ==> StudentList[] st + new StudentList[size]; 하기 위해 
		//문제) data에 있는 내용을 잘라서 StudentList에 저장후 출력 하시오.
		// 3 | 김영희/30 | 이만수/40 | 이철민/60
		String[] temp = data.split("\n"); // newLine을 기준으로 잘라서 temp배열에 저장
		int size = Integer.parseInt(temp[0]); // size 변수 = temp[0]값 = 3
		
		StudentList[] st = new StudentList[size]; // st를 size(3) 만큼 생성
		for (int i = 0; i < size; i++) { 
			st[i] = new StudentList();	//st배열	시작
		}
		
		for(int i = 0; i<size; i++) {
			String[] info = temp[i+1].split("/"); // temp 배열 1,2 "/"로 구분해 info배열에 저장
			
			st[i].name = info[0]; // "/" 앞에있는 것을 info[0]에 저장됨 = st[i].name에 연결
			st[i].score = Integer.parseInt(info[1]); // "/"뒤에 있는것을 info[1]에 저장됨 = st[i].socre를 정수로 바꿔연결
			
			st[i].print();//출력
		}
		System.out.println();
	}

}
