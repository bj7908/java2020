package oop0208;

public class Test01_operator {

	public static void main(String[] args) {
		/*삼항연산자*/
		//->형식) (조건) ? 참 : 거짓;
		int a=3;
		System.out.println(a*-1);//이항연산자
		System.out.println(-a);  //단항연산자
		
		String str = (5<3) ? "맞다" : "틀리다";
		System.out.println(str);
		System.out.println();
		//----------------------------------------
		//문제)절대값()을 구하시오 -> 무조건 양수로 출력하시오
		
		int b = -5;
		int num1 = b>0 ? b : -b;
		
		System.out.println(b + "의 절대값 : "+ num1);
		
		//문제2)세개의 수 주엥서 가장 큰 수를 구하시오.
		int x=-20, y=9, z=-10;
		
		//int num2 = x>y ? (x>z ? x : z) : (y>z ? y : z); //내가 푼 방법
		
		int max = (x>y) ? x : y;
		max = (max>z) ? max : z;
		
		System.out.println(x+", "+y+", "+z+" 중 가장 큰 수 :"+max);
		System.out.println();
		//------------------------------------------------------
		//Math : 수학 관련 클래스
		System.out.println(Math.abs(-3));   //절대값 구해주는 함수
		System.out.println(Math.max(7, 9)); //큰 값 구하기
		System.out.println(Math.max(2, Math.max(4, 6))); //함수 안에 함수를 더 넣을 수 있다.
		System.out.println();
		
	}//main() end

}//class end
