package oop0321;


import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Test03_List {

	public static void main(String[] args) {
		//JAVA Collection Framework
		//->�����͸� ��Ƽ� ������ �� �ִ� Ŭ���� �� �������̽�
		//->�迭 Array
		//->��� Element
		//List�迭 : ������ �ִ�. 0��°���� ����
		//-> List, Veector, ArrayList ~~~��
		//Set�迭   : ������ ����.
		//-> Set, HashSet ~~~��
		//Map�迭   : ������ ����. key�� value�� ����
		//-> Map, HashMap, HashTable ~~~
		
		//1)List 
/*
  interface List{}				//�߻��������̽�
  class Vector implements List{}
  class ArrayList implements List{}

  //������
  List list=new Vector();
  List list=new ArrayList();
 */
		Vector vec=new Vector();
		vec.add(3);
		vec.add(2.4);
		vec.add("Kim");
		vec.add('r');
		vec.add(new Integer(5));
		vec.add(new Double(7.2));
		
		System.out.println(vec);
		//����� ����
		System.out.println(vec.size());//6
		//0��° ��� ��������
		System.out.println(vec.get(0));//3
		
		for(int i=0 ; i<vec.size() ; i++) {
			System.out.println(vec.get(i));
		}
		
		//��� �����ϱ�
		vec.remove(2);
		System.out.println(vec);
		System.out.println(vec.size());
		
		//��� ���� ����
		//vec.removeAllElements();
		System.out.println(vec.size());
		
		if(vec.isEmpty()) {
			System.out.println("�������");
		}else {
			System.out.println("������� ����");
		}
		
		//remove�� ����ؼ� ��Ҹ� �� �����ض�.
		for(int i=vec.size() ; 0<i; i--) {
			System.out.println(vec.remove(i-1));
			System.out.println(vec);
		}
		System.out.println();
//---------------------------------------------------------
		List list=new ArrayList();
		list.add(1);
		list.add(2.4);
		list.add("KOREA");
		System.out.println(list.size());
		
		
		
	}//main() end
}//class end 
