package oop0222;

import java.lang.*; // <-자바의 기본 팩키지
					// <-생략가능

public class Test05_class {
	public static void main(String[] args) {
		// 기본클래스
		//static 접근방식 : 클래스명.멤버변수
		//                클래스명.멤버함수()
		
		
		//Math클래스 : 수학 관련 클래스
		//System.out.println(Math.E); 
		//System.out.println(Math.PI); 
		//절대값
		//System.out.println(Math.abs(-1));	  //1
		//System.out.println(Math.abs(-5.2));   //5.2
		//소수점 올림
		//System.out.println(Math.ceil(1.3));   //2.0
		//소수점 버림
		//System.out.println(Math.floor(2.7));  //2.0
		//소수점 반올림
		//System.out.println(Math.round(3.9));  //4
		//최대값
		//System.out.println(Math.max(5, 7));   //7
		
		//random값 , 난수, 임의로 발생한 값
		//난수의 발생범위: 0.0 <= r < 1.0
		//System.out.println(Math.random());
		//System.out.println(Math.random()*2);
		//System.out.println((int)(Math.random()*4));
		
		//문)주사위 범위 1~6 사이의 수를 랜던값으로 발생
		System.out.println((int)(Math.random()*6)+1);
		
		//문)로또번호 1~45 사이의 수를 랜덤값으로 발생
		for(int i=0 ; i<6 ; i++) {
			System.out.println((int)(Math.random()*45)+1);
		}
//----------------------------------------------------------------
		//Integer클래스
		//10진수 -> 2진수 변환
		System.out.println(Integer.toBinaryString(15)); 
		//10진수 -> 8진수 변환
		System.out.println(Integer.toOctalString(15)); 
		//10진수 -> 16진수 변환
		System.out.println(Integer.toHexString(15));
		
		Integer inte1= new Integer(3);
		Integer inte2= new Integer("5");
		
		//참조형3 ->기본형 byte 3으로 변환
		System.out.println(inte1.byteValue());  //3
		//참조형5 ->기본형 float 5.0으로 변환
		System.out.println(inte2.floatValue()); //5.0
		
		//"123" -> 123
		System.out.println(Integer.parseInt("123"));
		System.out.println("4"+"5");
		System.out.println(Integer.parseInt("4")+Integer.parseInt("5"));
		
		
		
	}//main() end
}//class end
