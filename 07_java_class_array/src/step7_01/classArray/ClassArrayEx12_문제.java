package step7_01.classArray;

// 문자열(2단계) [문제]

class Test{

	int num;	  // 인덱스
	int size;	  // 데이터의 개수
	char[] data;  // 데이터의 저장 배열
	
	void print() {
		for(int i=0; i<size; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}
	
}


public class ClassArrayEx12_문제 {

	public static void main(String[] args) {
		
	
        // data의 정보를 클래스배열에 저장.
		// 첫번째 /는 인덱스이다.
		// 두번째 /는 데이터의 개수이다.
		// 두번째 / 이후부터 data의 정보이다.
		
		// Test[] t;
		String data ="6\n";						// Test의 크기
		data += "0/2/a/b\n";					// 인덱스 / 데이터개수 / 데이터 ~~
		data += "1/3/a/b/c\n";					// 인덱스 / 데이터개수 / 데이터 ~~
		data += "2/5/a/b/c/d/e\n";				// 인덱스 / 데이터개수 / 데이터 ~~
		data += "3/4/a/b/c/d\n";				// 인덱스 / 데이터개수 / 데이터 ~~
		data += "4/3/a/b/c\n";					// 인덱스 / 데이터개수 / 데이터 ~~
		data += "5/1/a";						// 인덱스 / 데이터개수 / 데이터 ~~

		String[] temp = data.split("\n"); // new line 기준으로 잘라서 temp배열에 저장
		int size = Integer.parseInt(temp[0]);// size = temp[0] = 6(정수로 변경)
		
		Test[] t = new Test[size]; //t라는 객체의 클라스배열을 생성 
		
		for (int i = 0; i < size; i++) {
			t[i] = new Test(); // 클래스 Test의 변수를 사용하기 위해 선언
		}
		
		for(int i = 0; i < size; i++) {
			String[] info = temp[i+1].split("/"); // "/"기준으로 잘라서 info배열에 저장
			// temp[i + 1] = 0 | 2 | a | b
			t[i].num = Integer.parseInt(info[0]); //info[0] = 0(index)를 정수형으로 t.num에 저장 
			t[i].size = Integer.parseInt(info[1]); //info[1] = 2(data의 개수)를 t.size에 저장
			
			t[i].data = new char[t[i].size]; // t[i].data에 t[i].size만큼 		생성
			
			int k = 2;
			for (int j = 0; j < t[i].data.length; j++) {
				t[i].data[j] = info[k].charAt(0);
				k++;
				// a,b,c... 를 1개씩 나눠서 t[i].data[j]에 저장
			}
		}
		
		for (int i = 0; i < size; i++) {
			t[i].print(); //출력
		}
		

	}

}
