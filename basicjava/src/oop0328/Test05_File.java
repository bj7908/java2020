package oop0328;

import java.io.File;

//import java.io.*;



public class Test05_File {
	public static void main(String[] args) {
		//File클래스
		//->파일 정보(파일명, 확장명, 파일크기)를 확인할 수 있다.
		
		try {
			//String fileName = "D:\\java0201\\Java수업.txt";
			//경로 구분시 / 사용 가능함
			String fileName = "D:/java0201/Java수업.txt";
			
			//파일 담기
			File file = new File(fileName);
			if(file.exists()) {		//파일이 존재하는지?
				System.out.println("파일있음");
				long filesize = file.length();
				System.out.println(filesize+"바이트(byte)");
				System.out.println(filesize/1024+"KB");
				
				//파일명
				System.out.println(file.getName());
				//경로명+파일명
				System.out.println(file.getPath());
				
				file.delete();
				//파일이 삭제됬는지 안됬는지 다시 확인하기
				if(file.exists()) {
					System.out.println("파일삭제미완료");
				}else {
					System.out.println("파일삭제완료");
				}
				
				
				
			}else {
				System.out.println("파일없음"); 
			}
			
		}catch (Exception e) {
			System.out.println("실패"+ e);
		}//try end
		
		
		
	}//main() end
}//class end
