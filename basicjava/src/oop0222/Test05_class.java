package oop0222;

import java.lang.*; // <-�ڹ��� �⺻ ��Ű��
					// <-��������

public class Test05_class {
	public static void main(String[] args) {
		// �⺻Ŭ����
		//static ���ٹ�� : Ŭ������.�������
		//                Ŭ������.����Լ�()
		
		
		//MathŬ���� : ���� ���� Ŭ����
		//System.out.println(Math.E); 
		//System.out.println(Math.PI); 
		//���밪
		//System.out.println(Math.abs(-1));	  //1
		//System.out.println(Math.abs(-5.2));   //5.2
		//�Ҽ��� �ø�
		//System.out.println(Math.ceil(1.3));   //2.0
		//�Ҽ��� ����
		//System.out.println(Math.floor(2.7));  //2.0
		//�Ҽ��� �ݿø�
		//System.out.println(Math.round(3.9));  //4
		//�ִ밪
		//System.out.println(Math.max(5, 7));   //7
		
		//random�� , ����, ���Ƿ� �߻��� ��
		//������ �߻�����: 0.0 <= r < 1.0
		//System.out.println(Math.random());
		//System.out.println(Math.random()*2);
		//System.out.println((int)(Math.random()*4));
		
		//��)�ֻ��� ���� 1~6 ������ ���� ���������� �߻�
		System.out.println((int)(Math.random()*6)+1);
		
		//��)�ζǹ�ȣ 1~45 ������ ���� ���������� �߻�
		for(int i=0 ; i<6 ; i++) {
			System.out.println((int)(Math.random()*45)+1);
		}
//----------------------------------------------------------------
		//IntegerŬ����
		//10���� -> 2���� ��ȯ
		System.out.println(Integer.toBinaryString(15)); 
		//10���� -> 8���� ��ȯ
		System.out.println(Integer.toOctalString(15)); 
		//10���� -> 16���� ��ȯ
		System.out.println(Integer.toHexString(15));
		
		Integer inte1= new Integer(3);
		Integer inte2= new Integer("5");
		
		//������3 ->�⺻�� byte 3���� ��ȯ
		System.out.println(inte1.byteValue());  //3
		//������5 ->�⺻�� float 5.0���� ��ȯ
		System.out.println(inte2.floatValue()); //5.0
		
		//"123" -> 123
		System.out.println(Integer.parseInt("123"));
		System.out.println("4"+"5");
		System.out.println(Integer.parseInt("4")+Integer.parseInt("5"));
		
		
		
	}//main() end
}//class end
