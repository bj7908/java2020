package oop0208;

public class Test09_continue {

	public static void main(String[] args) {
		//break�� continue
		for( int a=1 ; a < 10 ; a++) {
			if(a == 5) {
				break; //�ݺ����� �������ö� ����
			}
			System.out.print(a+" ");
		}
		System.out.println();
		
		for( int a=1 ; a < 10 ; a++) {
			if(a == 5) {
				continue; //�ݺ����� ��� ����
			}
			System.out.print(a+" ");
		}
		System.out.println();
		
	}//main() end

}//class
