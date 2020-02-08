package oop0208;

public class Test07_for {

	public static void main(String[] args) {
		// 반복문
		//for, while , do~while
		//break :반복문을 빠져나옴
		//continue : 반목문을 계속 실행
		//무한LOOP : 끝 없이 반복

		//형식) for(시작값 ; 종료값 ; 증감){반복하고자 하는 명령어들}
		
		
		//1)증가에 따른 반복
		//유효범위(Scope)
		for(int a = 1 ; a<=3 ; a++) {
			System.out.println("JAVA");
		}//for end
		//for문에 선언된 a변수는 for문안에서만 유효하다.
		//System.out.print(a); 에러
		
		//2)감소에 따른 반복
		int b;
		for(b=3 ; b>=1 ; b=b-1) {
			System.out.println("Python");
		}//for
		System.out.println(b);
		
		for(char ch='A' ; ch<='Z'; ch++) {
			System.out.print(ch);
		}//for end
		
	}//main() end
}//class end
