package oop0208;

public class Test10_while {

	public static void main(String[] args) {
		/*while�ݺ���*/
		//-> while(����) {������ture�̸� ����}
		//-> while(true){} ����LOOP
		//-> for(;;){} ����LOOP
		
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
		
		
		
	}//main() end
}//class end
