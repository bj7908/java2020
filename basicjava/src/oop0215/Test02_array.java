package oop0215;

public class Test02_array {

	public static void main(String[] args) {
		//1차원 배열 연습문제

		char[] ch = {'E','z','e','n'};
		
		//문)모음의 갯수를 구하시오.(A,E,I,O,U | a,e,i,o,u)
		int moNum=0;
		for(int i=0 ; i<ch.length; i++) {
			//한글자를 가져와서
			char c = ch[i];
			//대문자이면 소문자로 치환
			if(c>='A' && c<='Z') { //'A' = 65 , 'a' = 97
				c = (char)(c+32);
			}//if end
			
			//모음인지?
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				moNum++;
			}//if end
			
		}//for end
		System.out.println(moNum);
		
		
		//내가 생각한 방식
		char[] mo = {'A','E','I','O','U','a','e','i','o','u'};
		int count = 0;
		
		for(int i=0 ; i<mo.length ; i++) {
			for(int j=0 ; j<ch.length ; j++) {
				if(mo[i]==ch[j]) {
					count++;
				}
			}
		}
		System.out.println(count);
		System.out.println();
	//------------------------------------------------------------
		int[] num = {8,-9,5,7,3};
		
		//문)음수의 갯수를 구하시오.
		int numCount = 0;
		for(int i=0 ; i<num.length ; i++) {
			if(num[i]<0) {
				numCount++;
			}//if end
		}//for end
		System.out.println("음수의 갯수는 "+numCount);
		
		//문)양수인 홀수의 합을 구하시오
		int num2 = 0;
		for(int i=0 ; i<num.length ; i++) {
			if(num[i]%2 == 1) {
				num2 += num[i];
			}//if end
		}//for end
		System.out.println("양수인 홀수의 합은 "+num2);
		//System.out.println(-9%2);
		System.out.println();
		
		//문)num[2]의 등수를 구하시오.
		int num3 = 0;
		for(int i=0 ; i<num.length ; i++) {
			if(num[2]<=num[i]) {
				num3++;
			}//if end
		}//for end
		System.out.println(num[2]+"의 등수는 "+num3);
		System.out.println();
		
		//문)num배열 요소의 각각의 등수를 구하시오.
		int[] rank = {0,0,0,0,0};
		for(int i=0 ; i<num.length ; i++) {
			for(int j=0 ; j<rank.length ; j++) {
				if(num[i]<=num[j]) {
					rank[i]++;
				}
			}//for end
			System.out.println(num[i]+"의 등수는 "+rank[i]);
		}//for end
		
		
		
		
		
	}//main() end
}//class end
