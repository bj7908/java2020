package oop0222;

class Score{
	private String name="�ڷγ�";
	private int kor, eng, mat;
	private int aver;
	
	
	
	//�������Լ��� �����ε��� �Ǹ� �⺻�������Լ���
	//�ڵ����� ���������� �ʴ´�
	//�⺻ �������Լ��� ���������� �߰��Ұ��� ��õ!!
	public Score() {}
	public Score(String n) {
		name =n;
	}
	public Score(int kor, int eng, int mat) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	public Score(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	public void disp() {
		String name ="������";     //��������(local variable)
		System.out.println(name); //���������� �켱������ ���� ����
								  //->������
		System.out.println(this.name);//->�ڷγ�
	}//disp() end
	
	
}//class end
	
	




public class Test03_this {

	public static void main(String[] args) {
		// this
		//->Ŭ���� �ڽ��� ����Ű�� ����
		//->�������(field)�� �Ϲݺ���(�Ű�����, ��������)�� �����ϱ� ����
		
		
		//�⺻�������Լ��� �ڵ����� �νĵ��� �ʴ� ���->�����ε�
		//new Score("����ȭ");
		//new Score();
		
		Score one = new Score();
		one.disp();
		
	}//main() end

}//class end
