package oop0222;

class Jumsu{
	private String name;
	private int kor, eng, mat;
	private int aver;
	
	//�⺻������ �Լ� �ڵ� �߰�
	//�޴� Source -> Generate Constructors From Superclass...
	public Jumsu() {}
	
	//�Ű����� �ִ� �������Լ� �ڵ� �ڵ� �߰�
	//�޴� Source -> Generate Constructor using field...
	public Jumsu(String name) {
		this.name = name;
	}

	public Jumsu(int kor, int eng, int mat, int aver) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	public Jumsu(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	
}//Jumsu end



public class Test04_constructor {

	public static void main(String[] args) {
		//������ �ڵ� �ڵ�
		//�⺻������ �Լ� �ڵ� �߰�
		//�޴� Source -> Generate Constructors From Superclass...
		//�Ű����� �ִ� �������Լ� �ڵ� �ڵ� �߰�
		//�޴� Source -> Generate Constructor using field...
		
		
	}//main() end
}//class end
