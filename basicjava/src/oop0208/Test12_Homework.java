package oop0208;

public class Test12_Homework {
	public static void main(String[] args) {
		//����1)
		//���ٿ� ���ĺ��� 5���� ����ϱ�
		char A = 'A';		
		char Z = 'Z';
		
		int count = 0;
		for(char a = A ; a<=Z ; a++) {
			if(count%5==0) {
				System.out.println();
			}
			System.out.print(a);
			count++;
		}
		System.out.println();
		System.out.println();
		
		//����2)
		//x���� 10���κ��� x�� ���� �� ����
		//����� ������ �Ǹ� x�� ��� ���°��� ���Ͻÿ�
		// 10-3 = 7 ,  7-3 = 4 , 4-3 = 1 , 1-3 = -2  =>4������ ����
		//���ѷ����� break �ɱ�
		
		int a=10, c=a, b=3;
		int count2=1;
		while(c-b>0) {
			c = c-b;
			count2++;
		}
		System.out.println(a+"������ "+b+"���� "+count2+"�� ������ ������ �˴ϴ�.");
		System.out.println();
		
		//����3)
		//��� �����̴� ������ 3cm�ö󰡰�
		//�㿡�� 2.5cm �����´ٰ� �Ҷ�
		//�����̰� 13cm�� ���� ����⿡ �ö󰡷���
		//��ĥ�� �ɸ����� ���Ͻÿ�.
		//->���ѷ����� break�ɱ�
		
		//int oneDay = 0.5;
		int top = 13;
		int dayCount = 0;

		for(float oneDay = 0 ; oneDay <= top ; oneDay += 0.5){
		dayCount++;
		}
		System.out.println("�����̰� "+top+"cm �ö󰡴µ� "+dayCount+"�� �ɸ��ϴ�.");

		
	}//main() end
}//class
