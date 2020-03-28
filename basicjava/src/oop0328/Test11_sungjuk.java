package oop0328;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Test11_sungjuk {
	public static void main(String[] args) {
		//성적 프로그램
		//입력파일 : sungjuk.txt
		//결과파일 : result.txt
		String inName="D:/java0201/sungjuk.txt";
		String outName="D:/java0201/result.txt";
		
		//읽기모드
		FileReader fr = null;
		BufferedReader br = null;
		
		//쓰기모드
		FileWriter fw = null;
		PrintWriter out = null;
		
		try {
			
			//1)데이터 가공에 필요한 변수 선언
			String[] name = new String[5];
			int[] kor = new int[5];
			int[] eng = new int[5];
			int[] mat = new int[5];
			
			//2)sungjuk.txt데이터를 가져와서 입력자료 완성
			fr = new FileReader(inName);
			br = new BufferedReader(fr);
			
			int i=0;
			while(true) {
				String line=br.readLine();
				if(line==null) {
					break;
				}
				String[] info = line.split(",");
				name[i] = info[0];			       //"손흥민"
				kor[i] = Integer.parseInt(info[1]);//"90"
				eng[i] = Integer.parseInt(info[2]);//"95"
				mat[i] = Integer.parseInt(info[3]);//"100"
				
				i++;
				
			}//while end(입력자료 완성)

			//4)평균을 구하시오
			int[] aver = new int[5];
			for(int j=0 ; j<i ; j++) {
				aver[j] = (kor[j]+eng[j]+mat[j])/3;
			}
		
			//5)등수를 구하시오
			int[] rank = {1,1,1,1,1};
			for(int a=0 ; a<i ; a++) {
				for(int b=0; b<i; b++) {
					if(aver[a]<aver[b]) {
						rank[a]++;
					}
				}
			}
			
			
			
			//6)result.txt에 결과 출력하기
			fw = new FileWriter(outName, false);
			out = new PrintWriter(fw,true);
			out.println("성/적/결/과");
			out.println("--------------------------------------------------------------------");
			out.println("이름     국어 영어 수학 평균 등수 결과");
			out.println("--------------------------------------------------------------------");
			
			for(int k=0; k<i; k++) {
				out.printf("%-4s %4d %4d %4d %4d %4d",
						name[k],kor[k],eng[k],mat[k],aver[k],rank[k]);
				out.printf("%3s", " ");
				
				//7)과락확인하기
				if(aver[k]>=80) {
					if(kor[k]<40||eng[k]<40||mat[k]<40) {
						out.printf("%-4s","재시험");
					}else {
						out.printf("%-4s","합격");
					}
				}else {
					out.printf("%-4s","불합격");
				}
				
				out.printf("%3s", " ");
				
				for(int star=0 ; star<aver[k]/10; star++) {
					out.printf("★");
				}
				
				out.println();//줄바꿈
			}
			
			System.out.println("result.txt 성적결과 완성");
			
			
		}catch (Exception e) {
			System.out.println("실패:"+e);
		}finally {//자원반납
			try {
				if(fr != null) {fr.close();}
			}catch (Exception e) {}
			try {
				if(br != null) {br.close();}
			}catch (Exception e) {}
			try {
				if(fw != null) {fw.close();}
			}catch (Exception e) {}
			try {
				if(out != null) {out.close();}
			}catch (Exception e) {}
		}
		
		
	}//main() end
}//class end
