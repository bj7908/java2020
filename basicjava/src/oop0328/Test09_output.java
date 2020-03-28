package oop0328;

import java.io.FileWriter;
import java.io.PrintWriter;

public class Test09_output {

	public static void main(String[] args) {
		//파일 출력하기
		FileWriter fw = null;
		try {
			String fileName = "d:/java0201/sungjuk.txt";
			//파일 쓰기 모드에서
			//해당파일이 존재하지 않으면 생성(create)
			//만일, 해당피일이 존재하면 선택(overwrite(덮어쓰기) 또는 append(이어쓰기))
			
			//true 추가, false 덮어쓰기
			fw = new FileWriter(fileName, false);
			
			//true 버퍼클리어
			PrintWriter out = new PrintWriter(fw, true);
			out.println("손흥민,90,95,100");
			out.println("박지성,55,95,80");
			out.println("김연아,100,60,70");
			out.println("개나리,90,75,100");
			out.println("진달래,90,55,80");
			out.close();//자원반납
			
			System.out.println("sungjuk.txt완성됨");
			
		}catch (Exception e) {
			System.out.println("실패:"+e);
		}finally {
			try {
				if(fw != null) {fw.close();}
			}catch (Exception e) {}
		}

	}

}
