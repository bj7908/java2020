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
		
		int a=10, b=3;
		int count2=1;
		while(a-b>=0) {
			a = a-b;
			count2++;
		}
		System.out.println(count2);
		
		
		//����3)
		//��� �����̴� ������ 3cm�ö󰡰�
		//�㿡�� 2.5cm �����´ٰ� �Ҷ�
		//�����̰� 13cm�� ���� ����⿡ �ö󰡷���
		//��ĥ�� �ɸ����� ���Ͻÿ�.
		//->���ѷ����� break�ɱ�
		
		
		
	}//main() end
}//class
