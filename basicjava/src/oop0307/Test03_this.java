package oop0307;

class Sungjuk{
	//�������
	String name;
	int kor, eng, mat;
	int aver;
	//������ �Լ�
	public Sungjuk() { //�⺻������ �Լ� default constructor
		this("����ȭ"); //�ڽ��� �������Լ��� ȣ���Ҷ�
	}
	public Sungjuk(String name) {}
	public Sungjuk(int kor, int eng, int mat) {
		this("����ȭ");
		this.aver=(kor+eng+mat)/3;
		//this("����ȭ"); ����
		//->�������Լ��� ȣ���ϴ°�� ù�ٿ��� ȣ���Ѵ�.
	}
	
	public Sungjuk(String name, int kor, int eng, int mat) {
		calc(); //�Ϲݸ޼ҵ� ȣ���� �� �ִ�.
	}
	//����Լ�(method)
	public void calc() {
		//this("ȫ�浿",10,20,30); 	//����
									//�Ϲ� �޼ҵ忡�� �������Լ��� ȣ���� �� ����.
	}
} //class end

public class Test03_this {

	public static void main(String[] args) {
		//�������Լ� ȣ�� ����
		//this()
		//->�������Լ��� �ڽ��� �������Լ��� ȣ���Ҷ�
		
		
	}//main() end
}//class end
