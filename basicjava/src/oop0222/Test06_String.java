package oop0222;

import java.util.*;
import java.util.StringTokenizer;

public class Test06_String {

	public static void main(String[] args) {
		// String 클래스
		String name="Corona";
		String str = new String("Gone With The Wind");
		System.out.println(name);
		System.out.println(str);
		
		System.out.println(name.length());
		System.out.println(str.length());
		
		//0번째 글자
		char c= str.charAt(0);
		System.out.println(c); //'G'
		//마지막 글자
		char d= str.charAt(str.length()-1);
		System.out.println(d); //'d'
		//"e" 문자열의 순서값
		System.out.println(str.indexOf("e")); //3
		System.out.println(str.lastIndexOf("e")); //12
		//일치하지 문자열이 없느 경우
		System.out.println(str.indexOf("r"));//-1
		//'n' -> 'N'으로 치환
		System.out.println(str.replace('n', 'N'));
		//전부 소문자로 치환
		System.out.println(str.toLowerCase());
		//전부 대문자로 치환
		System.out.println(str.toUpperCase());
		
		if(str.isEmpty()){ //문자열갯수가 0인지?
			System.out.println("공백이다");
		}else {
			System.out.println("공백이 아니다");
		}//if end
		
		//문자열 자르기
		//5번째 ~ 문자열 마지막까지
		System.out.println(str.substring(5));
		//5번째 ~ (11-1)까지
		System.out.println(str.substring(5,11));
		
		//문자열 분리해서 가져오기
		String[] word=str.split(" ");
		for(int i=0 ; i<word.length ; i++) {
			System.out.println(word[i]);
		}
		
		//문자열 맨앞과 뒤의 공백제거
		System.out.println("#"+" s k y ".trim()+"#");
		
		String a = "HAPPY";
		String b = new String("HAPPY");
		if(a == b) { //서로 다르다
			System.out.println("서로같다");
		}else {
			System.out.println("서로 다르다");
		}//if end
		
		//문자열에서 문자열 내용을 비교하고자 하는 경우
		//equals()함수를 이용할 것
		if(a.equals(b)) { //서로 같다
			System.out.println("서로같다");
		}else {
			System.out.println("서로 다르다");
		}//if end
		
//--------------------------------------------------------------------
		String id="";
		id += "ONE";
		System.out.println(id);
		id += "TWO";
		System.out.println(id);
		id += "THREE";
		System.out.println(id);
		
		StringBuffer sb1=new StringBuffer();
		sb1.append("JAVA");
		System.out.println(sb1);
		sb1.append("Python");
		System.out.println(sb1);
		sb1.append("R");
		System.out.println(sb1);
		
		StringBuilder sb2 = new StringBuilder();
		sb2.append("SEOUL");
		System.out.println(sb2);
		sb2.append("JEJU");
		System.out.println(sb2);
		sb2.append("BUSAN");
		System.out.println(sb2);
		
		//Chapter 11 교재 참조
		StringTokenizer st = new StringTokenizer("Hi,Hello",",");
		
		
	}//main() end

	private static char[] typeOf(String a) {
		// TODO Auto-generated method stub
		return null;
	}
}//class end
