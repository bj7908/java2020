package oop0321;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Test04_setMap {
	public static void main(String[] args) {
/*
	interface Set{}
	class HashSet implements Set{}
	
	interface Map{}
	class HashMap implements Map{}
*/
		
		//2)Set
		//->������ ����
		//->cursor�� ����
		HashSet set = new HashSet();
		set.add(3);
		set.add(2.4);
		set.add("Hi");
		set.add("R");
		set.add(new Integer(5));
		
		System.out.println(set.size());
		System.out.println(set);
		
		//��� ��������
		//set�� ������ �մ� ��ҵ鿡 �����ϱ� ���� cursor ����
		Iterator iter=set.iterator();
		while(iter.hasNext()) {//���� cursor�� �ִ���?
			//cursor�� ����Ű�� ��� ��������
			System.out.println(iter.next());
//----------------------------------------------------
			//3)Map
			//->������ ����
			//->Key�� Value
			
			HashMap map = new HashMap();
			//��� �߰��ϱ�
			map.put("one", 3);
			map.put("two",2.4);
			map.put("three","KOREA");
			System.out.println(map.size());
			
			map.put("one",5);			//key�� �ߺ����� �ȵ�
			map.put("four", "KOREA");		//value�� �ߺ� ����
			
			//��Ұ� ��������
			System.out.println(map.get("three"));
			
			
		}
	}//main() end
}//class end
