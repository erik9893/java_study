package step6_02.method;
/*
class Ex06{
	
	void test1 (int x, int y) {
		
		int total = 0;
		for (int i=x; i<=y; i++) {
			total += i;
		}
		System.out.println("total = " + total);
		
	}
	
	
	
	void test2(int[] arr) {
		
		int maxNum = 0;
		for (int i=0; i<arr.length; i++) {
			if (maxNum < arr[i]) {
				maxNum = arr[i];
			}
		}
		System.out.println("최대값 = " + maxNum);
		
	}
	
	
	
	void test3 (int[] arr, int idx1, int idx2) {
		
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
		
	}
	
	
	
	void print (int[] arr) {
		
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
}


*/
public class MethodEx06_정답 {

	public static void main(String[] args) {
		
		Ex06 e = new Ex06();
		
		// 문제 1) x부터 y까지의 합을 출력하는 메서드
		int x = 1;
		int y = 10;
		e.test1(x, y);
		
		// 문제 2) arr배열을 전달받아 최대값을 출력하는 메서드
		int[] arr = {87, 100, 35, 12, 46};
		e.test2(arr);
		
		// 문제 3) arr배열과 인덱스 2개를 전달받아, 해당 위치의 값을 교체하는 메서드
		e.print(arr);

		int idx1 = 1;
		int idx2 = 4;
		e.test3(arr, idx1, idx2);
		
		e.print(arr);



	}

}
