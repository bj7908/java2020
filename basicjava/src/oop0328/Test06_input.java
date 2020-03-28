package oop0328;

import java.io.*;

public class Test06_input {
	public static void main(String[] args) {
		//파일 내용 읽기
		try {
			String fileName="D:/java0201/javaGit/java2020/basicjava/src/oop0328/Test03_thread.java";
			
			//파일 가져오기
			FileReader fr = new FileReader(fileName);
			
			//파일 내용 읽기(cursor가 맨 앞을 가리킴)
			BufferedReader br = new BufferedReader(fr);
			
			int cnt = 0; // 행번호
			
			while(true) {
				//엔터(\n)를 기준으로 읽어옴
				String line = br.readLine();
				if(line == null) { //파일의 끝인지? ENd of File
					break;
				}
				
				System.out.println((++cnt)+line);
				//10행마다 밑줄 긋기
				if(cnt%10 ==0) {
					System.out.println("******************************************************");
				}
			}
			//자원반납(순서주의)
			br.close();
			fr.close();
			
		}catch (Exception e) {
			System.out.println("실패 :"+e);
		}
		
	}//main() end
}//class end
