package oop0208;

public class Test07_for {

	public static void main(String[] args) {
		// �ݺ���
		//for, while , do~while
		//break :�ݺ����� ��������
		//continue : �ݸ��� ��� ����
		//����LOOP : �� ���� �ݺ�

		//����) for(���۰� ; ���ᰪ ; ����){�ݺ��ϰ��� �ϴ� ��ɾ��}
		
		
		//1)������ ���� �ݺ�
		//��ȿ����(Scope)
		for(int a = 1 ; a<=3 ; a++) {
			System.out.println("JAVA");
		}//for end
		//for���� ����� a������ for���ȿ����� ��ȿ�ϴ�.
		//System.out.print(a); ����
		
		//2)���ҿ� ���� �ݺ�
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
