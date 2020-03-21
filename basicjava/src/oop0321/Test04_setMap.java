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
		//->순서가 없다
		//->cursor로 접근
		HashSet set = new HashSet();
		set.add(3);
		set.add(2.4);
		set.add("Hi");
		set.add("R");
		set.add(new Integer(5));
		
		System.out.println(set.size());
		System.out.println(set);
		
		//요소 가져오기
		//set이 가지고 잇는 요소들에 접근하기 위해 cursor 생성
		Iterator iter=set.iterator();
		while(iter.hasNext()) {//다음 cursor가 있는지?
			//cursor가 가르키는 요소 가져오기
			System.out.println(iter.next());
//----------------------------------------------------
			//3)Map
			//->순서가 없다
			//->Key와 Value
			
			HashMap map = new HashMap();
			//요소 추가하기
			map.put("one", 3);
			map.put("two",2.4);
			map.put("three","KOREA");
			System.out.println(map.size());
			
			map.put("one",5);			//key는 중복선언 안됨
			map.put("four", "KOREA");		//value는 중복 가능
			
			//요소값 가져오기
			System.out.println(map.get("three"));
			
			
		}
	}//main() end
}//class end
