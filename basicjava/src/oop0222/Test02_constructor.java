package oop0222;


class School{
	//�������(field)
	//private�Ӽ��� Ȱ���Ͽ� Ư������� �����Ҽ� �ִ�.
	private String name;
	private int kor,eng, mat;
	private int aver;
	
	//������ �Լ�
	//->Ŭ������� ������ �Լ�
	//-> �Լ��� �������� �������� �ʴ´�.
	//public void School() {} ����!!
	public School() { //�⺻������ default constructor
					  //�ڵ� ���� �ȴ�
		System.out.println("School()...");
		
		
	}//School() end
	
	//�������Լ��� �����ε�(�Լ��� �ߺ�����)�� �����ϴ�.
	public School(String n) { //�Ű����� parameter
		name=n; //�ɹ�����
	}
	
	public School(int k, int e, int m) {
		kor = k;
		eng = e;
		mat = m;
	}
	
	public School(String n, int k, int e, int m) {
		name = n;
		kor = k;
		eng = e;
		mat = m;
	}

	//����Լ� method
	public void calc() {
		aver = (kor+eng+mat)/3;
	} //calc() end
	
	void disp() { //package �������� �����Ǿ� ����.
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(mat);
		System.out.println(aver);
		
	}//disp() end
	
	
}//class end


public class Test02_constructor {

	public static void main(String[] args) {
		// Constructor ������ �Լ� 
		//->new�����ڿ� �Բ� �޸� �Ҵ��Ҷ� ���
		//->Ŭ���� ��� ������ �Լ�(������ �Լ�)
		//->�����ε��� ����
		
		// Destructor �Ҹ��� �Լ� (C������ ����� �Ѵ�)
		//->�ڹٿ��� ����!!
		//->Garbage Collecting : JVM�� �ڵ����� �޸� ȸ���� ��
		
		
		//�޸� �Ҵ��Ҷ� �������Լ��� ȣ���Ѵ�.
		new School();
		School one = new School("ȫ�浿");
		School two = new School(1,2,3);
		School three = new School("ȫ�浿",1,2,3);
		
		one.calc(); one.disp();
		two.calc(); two.disp();
		three.calc(); three.disp();
		
		//System.out.println(one);
		//System.out.println(two);
		//System.out.println(three);
		
		//null ���°�
		School four = null;
		
		
		
		
	}//main()end

}//class end
