package step5_02.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

//# 파일 로드하기 : 연습문제


public class FileEx05_내정답 {

	public static void main(String[] args) {
		
		String[] ids = null;
		String[] pws = null;
		int[] moneys = null;
		
		String fileName = "fileTest02.txt";

		File file = new File(fileName);
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			String data = br.readLine() + "\n";
			data += br.readLine() + "\n";
			data += br.readLine();
			
			System.out.println(data);
			
			fr.close();
			br.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
