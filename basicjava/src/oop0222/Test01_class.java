package oop0222;//<-���� Ŭ������ ������ġ
				//<-package�� �ѹ��� ����

//Ŭ������ ������ġ ����
//import�� ������ ���� ����
import java.io.*;
import java.util.*;
import java.sql.*;

class Sungjuk{ //package class Sungjuk
			   //->package �����ؾ߸� �Ѵ�.
	//�ĺ���
	//->������Ʈ�� : basicjava
	//->��Ű���� : oop0222
	//->Ŭ������ : Sungjuk Ŭ�������� ù���ڴ� �ַ� �빮�ڷ� �Ѵ�
	//->������, �Լ���, ��ü��
	
	//Access Modifier ��������, ���ټ���, ��������
	//->private   : �����. Ŭ�������ο����� ���ٰ���
	//->package   : ����package�������� ���� ����. ������ ��� �⺻��
	//->protected : ��Ӱ��迡 �ִ�  Ŭ������ �ٸ�package�� �����ϴ� ��쿡�� ���� ����
	//->public    : ����. basicjava������Ʈ ������ ��� ���� ����
	
	
	//Ŭ�������ο����� (Access Modifier)��������� ������� ���� �����ϴ�.
	//������� field
	public String name;
	int kor,eng,mat; //package �����ؾ߸� ��.
	private int aver;
	
	
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
	
	private void view() {}//vied() end
	
	
	
	
	
} //class end
//------------------------------------------------------------------------

public class Test01_class {

	public static void main(String[] args) {
		//class Ŭ����
		//->�����ڷ���
		//->����� ���� �ڷ���
		//->������� : �������(field) + ����Լ�(method)
		//->Ŭ������ �޸𸮸� (����) �Ҵ��ϰ� ���(new ������) : ��ü(object)
		//��ü�������� : new  �������Լ�()
		
		int a = 3; //a�� �Ϲݺ���
		
		//new Sungjuk(); //��ü Object
		   				 //RAM�� heap���� #50������ �޸� Ȯ��
		
		//sj ��������(reference)����
		Sungjuk sj = new Sungjuk();
		//���������� ���� ��ü�� �����ϴ� ������ : . ������
		sj.name = "ȫ�浿"; //public �Ӽ��� ���ٰ���
		sj.kor = 100;     //package�Ӽ� ���� ����
		sj.eng = 50;
		sj.mat = 75;
		//sj.aver ���� . private �Ӽ��� ���� �Ұ���
		System.out.println(sj.name);
		System.out.println(sj.kor);
		System.out.println(sj.eng);
		System.out.println(sj.mat);
		
		sj.calc();
		sj.disp();
		//sj.view() ���� . private�Ӽ��� ���� �Ұ���
//-----------------------------------------------------------------------
		//Ŭ������ �������� = ��ü(Object)
		Sungjuk sungjuk = new Sungjuk();
		sungjuk.name = "�迬��";
		sungjuk.kor = 70;
		sungjuk.eng = 85;
		sungjuk.mat = 60;
		sungjuk.calc();
		sungjuk.disp();
		
//------------------------------------------------------------------------
		//���������� ������ �ִ� ��ü�� �ּҰ�
		System.out.println(sj.hashCode());		//#50����
		System.out.println(sungjuk.hashCode()); //#60����
		
		Sungjuk tmp = sj;
		System.out.println(tmp.hashCode());     //#50����
//------------------------------------------------------------------------
		
		
		
	}//main() end

}//class end
