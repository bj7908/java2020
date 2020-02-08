package oop0208;

public class Test09_continue {

	public static void main(String[] args) {
		//break와 continue
		for( int a=1 ; a < 10 ; a++) {
			if(a == 5) {
				break; //반복문을 빠져나올때 쓰임
			}
			System.out.print(a+" ");
		}
		System.out.println();
		
		for( int a=1 ; a < 10 ; a++) {
			if(a == 5) {
				continue; //반복문을 계속 실행
			}
			System.out.print(a+" ");
		}
		System.out.println();
		
	}//main() end

}//class
