package oop0208;

public class Test11_for {

	public static void main(String[] args) {
		//���� �ݺ���
		for(int a=1 ; a<=2 ;a++) {
			System.out.println("KOREA");
			
			for(int b=1 ; b<=3 ; b++) {
				System.out.println("SEOUL");
			}
			System.out.println();
		}//for end
		
		//2��~9�� ������ ����ϱ�
		for(int c=2; c<=9 ; c++) {
			System.out.println(c+"��");
			for(int d=1 ; d<=9 ; d++) {
				System.out.println(c+"*"+d+"="+(c*d));
			}
		}//for end
		System.out.println();
		
		//-----------------------------------------------------
		//1)������� ȸ����
		for(int aa=1; aa<=4 ; aa++) {
			for(int bb=1 ; bb<=4 ; bb++) {
				System.out.print("#");
			}//for end
			System.out.println();
		}//for end
		System.out.println();
		
		//2)ȸ���� ����
		for(int aa=1; aa<=4 ; aa++) {
			for(int bb=1 ; bb<=aa ; bb++) {
				System.out.print("@");
			}//for end
			System.out.println();
		}//for end
		System.out.println();
		
		//3)ȸ���� ����
		for(int aa=4; aa>=1 ; aa--) {
			for(int bb=1 ; bb<=aa ; bb++) {
				System.out.print("$");
			}//for end
			System.out.println();
		}//for end
		System.out.println();

	}//main() end

}//class end
