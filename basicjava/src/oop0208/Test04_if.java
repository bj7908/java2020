package oop0208;

public class Test04_if {

	public static void main(String[] args) {
		//���
		//->���α׷��� �帧�� ����
		//->���ǹ� : if,if-else,if-else if, switch ~ case
		//->�ݸ� : for, while, do~while
		//break
		//continue
		
		//------------------------------------------------
		//���� ���α׷�
		String name ="����ȭ";
		int kor=90, eng=100, mat=100;
		
		//��ձ��ϱ�
		int aver=(kor+eng+mat)/3;
		
		//���
		System.out.println("�̸�: "+name);
		System.out.println("����: "+kor);
		System.out.println("����: "+eng);
		System.out.println("����: "+mat);
		System.out.println("���: "+aver);
		System.out.println();
		
		//����� 95�� �̻��̸� ���л�
		if(aver >= 95) {
			System.out.println(name+"�л��� ���л��Դϴ�.");
		}//if end
		
		//��������(kor)�� 70�� �̻��̸� �հ�, �ƴϸ� ���հ� 
		if(kor >= 70) { 
			System.out.println("�հ�");
		}else {
			System.out.println("���հ�");
		}
	}//main() end

}//class end
