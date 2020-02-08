package oop0208;

public class Test10_while {

	public static void main(String[] args) {
		/*while반복문*/
		//-> while(조건) {조건이ture이면 수행}
		//-> while(true){} 무한LOOP
		//-> for(;;){} 무한LOOP
		
		int a=1;
		while(a<=3) {
			System.out.println("SEOUL");
			a=a+1;
		}//while end
		System.out.println();
		
		
		int b=1;
		while(true) {
			System.out.println("KOREA");
			b=b+1;
			if(b==5) {
				break;
			}
		}//while end
		System.out.println();
		
		//--------------------------------------------------
		/*do ~ while*/
		//do{
		//  조건이 true이면 수행
		//}while(조건);
		
		int c = 1;
		do {
			System.out.println("JEJU");
			c=c+1;
		}while(c<=3);
		System.out.println();
		//do~while문은 조건이 틀리더라도 한번은 수행한다.
		int d=10;
		do {
			System.out.println("BUSAN");
			d=d+1;
		}while(d<=5);
		
		
		
	}//main() end
}//class end
