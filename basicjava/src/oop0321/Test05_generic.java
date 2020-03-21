package oop0321;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

class Mountain{
	String name; //산이름
	int height;  //산높이
	public Mountain() {}
	public Mountain(String name, int height) {
		this.name = name;
		this.height = height;
	}
}

public class Test05_generic {

	public static void main(String[] args) {
		// Generic 제네릭
		//<E>	   Element
		//<k, v>   Key, Value
		//<T>
		//<?>
		//제네릭에는 참조형만 가능하다

		//int[] a = new int[3];
		//a[0]=1.3; 에러. int형만 대입가능하다.
		
		Vector<String> vec = new Vector<String>();
		vec.add("");
		vec.add(new String());
		//vec.add(3);
		//vec.add(new Integer(5));
		//vec.add(2.4);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(new Integer(3));
		list.add(5);	//오토박싱 : 기본형이 자동으로 참조형화 된다.
		//list.add("");
		//list.add(new Double(2.4));

		HashMap<String, Double> map = new HashMap<String, Double>();
		map.put("",2.4);
		map.put("",new Double(5.6));
		//map.put("", 3);
//--------------------------------------------------------------------
		Mountain m1 = new Mountain("한라산", 1950);
		Mountain m2 = new Mountain("북한산", 1200);
		Mountain m3 = new Mountain("설악산", 1300);
		
		ArrayList<Mountain> items =new ArrayList<Mountain>();
		items.add(m1);
		items.add(m2);
		items.add(m3);
		
		for(int i=0; i<items.size(); i++) {
			Mountain item =items.get(i);
			System.out.println("산이름:"+item.name+" / 해발:"+item.height);
		}//for end
		
	}

}
