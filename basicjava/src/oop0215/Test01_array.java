package oop0215;

public class Test01_array {

	public static void main(String[] args) {
		//Array �迭
		//->������ �ڷ����� ���� �Ѱ��� ������ 1���̻��� ������ �� �ִ�.
		//->�迭�� ����(index)�� 0���� �����ؼ� 1�� �����Ѵ�.
		//->�迭�� �� ��� : element
		//->new������ : �޸� �Ҵ� ������
		//-> 1���� �迭 : [��]      ��, column, ĭ
		//-> 2���� �迭 : [��][��]   ��, row, ��
		//-> 3���� �迭 : �ڹٿ��� ����
		
	//-----------------------------------------------------
		//1) 1���� �迭
		int[] kor = new int[3]; //4byte*3�� = 12byte �޸𸮿� �Ҵ��
		kor[0] = 10;
		kor[1] = 20;
		kor[2] = 30;
		
		System.out.println(kor[0]);
		System.out.println(kor[1]);
		System.out.println(kor[2]);
		
		System.out.println(kor.length);//3 length-> �迭 ���(element)�� ����
		System.out.println();
		
	//------------------------------------------------------
		int[] kor2 = {40, 50 ,60};
		
		for(int i=0 ; i<kor2.length ; i++) {
			System.out.println(kor2[i]);
		}
		
		System.out.println(kor2.length);
		System.out.println();
		
		//System.out.println(kor2[3]); 
		//ArrayIndexOutOfBoundsException �߻�
		//3��° ��Ұ��� �������� ����
		
	//-------------------------------------------------------
		String[] name = {"����ȭ","���޷�","���϶�"};
		for(int i=0; i<name.length ; i++) {
			System.out.println(name[i]);
		}
		System.out.println();
	//-------------------------------------------------------
		double[] height = {165.2, 180.6 ,175.9};
		for(int i=0; i<height.length ; i++) {
			System.out.println(height[i]);
		}
		System.out.println();
	//-------------------------------------------------------
		char[] ch = {'S','K','Y'};
		for(int i=0; i<ch.length ; i++) {
			System.out.println(ch[i]);
		}
		System.out.println();
		
	}//main() end

}//class end
