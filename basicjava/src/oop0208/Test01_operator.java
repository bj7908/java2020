package oop0208;

public class Test01_operator {

	public static void main(String[] args) {
		/*���׿�����*/
		//->����) (����) ? �� : ����;
		int a=3;
		System.out.println(a*-1);//���׿�����
		System.out.println(-a);  //���׿�����
		
		String str = (5<3) ? "�´�" : "Ʋ����";
		System.out.println(str);
		System.out.println();
		//----------------------------------------
		//����)���밪()�� ���Ͻÿ� -> ������ ����� ����Ͻÿ�
		
		int b = -5;
		int num1 = b>0 ? b : -b;
		
		System.out.println(b + "�� ���밪 : "+ num1);
		
		//����2)������ �� �ֿ��� ���� ū ���� ���Ͻÿ�.
		int x=-20, y=9, z=-10;
		
		//int num2 = x>y ? (x>z ? x : z) : (y>z ? y : z); //���� Ǭ ���
		
		int max = (x>y) ? x : y;
		max = (max>z) ? max : z;
		
		System.out.println(x+", "+y+", "+z+" �� ���� ū �� :"+max);
		System.out.println();
		//------------------------------------------------------
		//Math : ���� ���� Ŭ����
		System.out.println(Math.abs(-3));   //���밪 �����ִ� �Լ�
		System.out.println(Math.max(7, 9)); //ū �� ���ϱ�
		System.out.println(Math.max(2, Math.max(4, 6))); //�Լ� �ȿ� �Լ��� �� ���� �� �ִ�.
		System.out.println();
		
	}//main() end

}//class end
