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
		System.out.println();
		
		//--------------------------------------------------
		/*do ~ while*/
		//do{
		//  ������ true�̸� ����
		//}while(����);
		
		int c = 1;
		do {
			System.out.println("JEJU");
			c=c+1;
		}while(c<=3);
		System.out.println();
		//do~while���� ������ Ʋ������ �ѹ��� �����Ѵ�.
		int d=10;
		do {
			System.out.println("BUSAN");
			d=d+1;
		}while(d<=5);
		
		
		
	}//main() end
}//class end
