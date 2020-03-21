package oop0321;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

class Mountain{
	String name; //���̸�
	int height;  //�����
	public Mountain() {}
	public Mountain(String name, int height) {
		this.name = name;
		this.height = height;
	}
}

public class Test05_generic {

	public static void main(String[] args) {
		// Generic ���׸�
		//<E>	   Element
		//<k, v>   Key, Value
		//<T>
		//<?>
		//���׸����� �������� �����ϴ�

		//int[] a = new int[3];
		//a[0]=1.3; ����. int���� ���԰����ϴ�.
		
		Vector<String> vec = new Vector<String>();
		vec.add("");
		vec.add(new String());
		//vec.add(3);
		//vec.add(new Integer(5));
		//vec.add(2.4);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(new Integer(3));
		list.add(5);	//����ڽ� : �⺻���� �ڵ����� ������ȭ �ȴ�.
		//list.add("");
		//list.add(new Double(2.4));

		HashMap<String, Double> map = new HashMap<String, Double>();
		map.put("",2.4);
		map.put("",new Double(5.6));
		//map.put("", 3);
//--------------------------------------------------------------------
		Mountain m1 = new Mountain("�Ѷ��", 1950);
		Mountain m2 = new Mountain("���ѻ�", 1200);
		Mountain m3 = new Mountain("���ǻ�", 1300);
		
		ArrayList<Mountain> items =new ArrayList<Mountain>();
		items.add(m1);
		items.add(m2);
		items.add(m3);
		
		for(int i=0; i<items.size(); i++) {
			Mountain item =items.get(i);
			System.out.println("���̸�:"+item.name+" / �ع�:"+item.height);
		}//for end
		
	}

}
