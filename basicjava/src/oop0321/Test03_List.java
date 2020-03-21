package oop0321;


import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Test03_List {

	public static void main(String[] args) {
		//JAVA Collection Framework
		//->데이터를 모아서 저장할 수 있는 클래스 및 인터페이스
		//->배열 Array
		//->요소 Element
		//List계열 : 순서가 있다. 0번째부터 시작
		//-> List, Veector, ArrayList ~~~등
		//Set계열   : 순서가 없다.
		//-> Set, HashSet ~~~등
		//Map계열   : 순서가 없다. key와 value로 구성
		//-> Map, HashMap, HashTable ~~~
		
		//1)List 
/*
  interface List{}				//추상인터페이스
  class Vector implements List{}
  class ArrayList implements List{}

  //다형성
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
		//요소의 갯수
		System.out.println(vec.size());//6
		//0번째 요소 가져오기
		System.out.println(vec.get(0));//3
		
		for(int i=0 ; i<vec.size() ; i++) {
			System.out.println(vec.get(i));
		}
		
		//요소 삭제하기
		vec.remove(2);
		System.out.println(vec);
		System.out.println(vec.size());
		
		//요소 전부 삭제
		//vec.removeAllElements();
		System.out.println(vec.size());
		
		if(vec.isEmpty()) {
			System.out.println("비어있음");
		}else {
			System.out.println("비어있지 않음");
		}
		
		//remove를 사용해서 요소를 다 삭제해라.
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
