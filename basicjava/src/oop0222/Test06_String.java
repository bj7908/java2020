package oop0222;

import java.util.*;
import java.util.StringTokenizer;

public class Test06_String {

	public static void main(String[] args) {
		// String Ŭ����
		String name="Corona";
		String str = new String("Gone With The Wind");
		System.out.println(name);
		System.out.println(str);
		
		System.out.println(name.length());
		System.out.println(str.length());
		
		//0��° ����
		char c= str.charAt(0);
		System.out.println(c); //'G'
		//������ ����
		char d= str.charAt(str.length()-1);
		System.out.println(d); //'d'
		//"e" ���ڿ��� ������
		System.out.println(str.indexOf("e")); //3
		System.out.println(str.lastIndexOf("e")); //12
		//��ġ���� ���ڿ��� ���� ���
		System.out.println(str.indexOf("r"));//-1
		//'n' -> 'N'���� ġȯ
		System.out.println(str.replace('n', 'N'));
		//���� �ҹ��ڷ� ġȯ
		System.out.println(str.toLowerCase());
		//���� �빮�ڷ� ġȯ
		System.out.println(str.toUpperCase());
		
		if(str.isEmpty()){ //���ڿ������� 0����?
			System.out.println("�����̴�");
		}else {
			System.out.println("������ �ƴϴ�");
		}//if end
		
		//���ڿ� �ڸ���
		//5��° ~ ���ڿ� ����������
		System.out.println(str.substring(5));
		//5��° ~ (11-1)����
		System.out.println(str.substring(5,11));
		
		//���ڿ� �и��ؼ� ��������
		String[] word=str.split(" ");
		for(int i=0 ; i<word.length ; i++) {
			System.out.println(word[i]);
		}
		
		//���ڿ� �Ǿհ� ���� ��������
		System.out.println("#"+" s k y ".trim()+"#");
		
		String a = "HAPPY";
		String b = new String("HAPPY");
		if(a == b) { //���� �ٸ���
			System.out.println("���ΰ���");
		}else {
			System.out.println("���� �ٸ���");
		}//if end
		
		//���ڿ����� ���ڿ� ������ ���ϰ��� �ϴ� ���
		//equals()�Լ��� �̿��� ��
		if(a.equals(b)) { //���� ����
			System.out.println("���ΰ���");
		}else {
			System.out.println("���� �ٸ���");
		}//if end
		
//--------------------------------------------------------------------
		String id="";
		id += "ONE";
		System.out.println(id);
		id += "TWO";
		System.out.println(id);
		id += "THREE";
		System.out.println(id);
		
		StringBuffer sb1=new StringBuffer();
		sb1.append("JAVA");
		System.out.println(sb1);
		sb1.append("Python");
		System.out.println(sb1);
		sb1.append("R");
		System.out.println(sb1);
		
		StringBuilder sb2 = new StringBuilder();
		sb2.append("SEOUL");
		System.out.println(sb2);
		sb2.append("JEJU");
		System.out.println(sb2);
		sb2.append("BUSAN");
		System.out.println(sb2);
		
		//Chapter 11 ���� ����
		StringTokenizer st = new StringTokenizer("Hi,Hello",",");
		
		
	}//main() end

	private static char[] typeOf(String a) {
		// TODO Auto-generated method stub
		return null;
	}
}//class end
