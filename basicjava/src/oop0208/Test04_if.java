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
		int kor=100, eng=100, mat=35;
		
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
			System.out.println("����: �հ�");
		}else {
			System.out.println("����: ���հ�");
		}//if end
		
		//���������� 90���̻� A����
		//		  80���̻� B����
		//		  70���̻� C����
		//		  60���̻� D����
		//		    ������ F����
		
		if(mat >= 90) {
			System.out.println("����: A����");
		}else if(mat >= 80) {
			System.out.println("����: B����");
		}else if(mat >= 70) {
			System.out.println("����: C����");
		}else if(mat >= 60) {
			System.out.println("����: D����");
		}else {
			System.out.println("����: F����");
		}
		System.out.println();
		//---------------------------------------------
		//����
		//����� 70���̻��̸� �հ�
		//(��, �������߿��� �Ѱ����̶� 40�� �̸� �����)
		//�ƴϸ� ���հ�
		if(aver >= 70) {
			//or�������� Ǯ������,
//			if(kor<40 || eng<40 || mat<40) {
//				System.out.println("�����");
//			}else {
//				System.out.println("�հ�");
//			}//if end
			//and�������� Ǯ������,
			if(kor<=40 && eng >=40 && mat>=40) {
				System.out.println("�հ�");
			}else {
				System.out.println("�����");
			}
		}else {
			System.out.println("���հ�");
		}//if end
		
		
		
	}//main() end

}//class end
