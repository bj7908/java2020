package oop0208;

public class Test12_Homework {
	public static void main(String[] args) {
		//과제1)
		//한줄에 알파벳을 5개씩 출력하기
		char A = 'A';		
		char Z = 'Z';
		int count = 0;
		for(char a = A ; a<=Z ; a++) {
			if(count%5==0) {
				System.out.println();
			}
			System.out.print(a);
			count++;
		}
		System.out.println();
		System.out.println();
		
		//과제2)
		//x값이 10으로부터 x를 여러 번 뺀후
		//결과가 음수가 되면 x를 몇번 뺐는가를 구하시오
		// 10-3 = 7 ,  7-3 = 4 , 4-3 = 1 , 1-3 = -2  =>4번만에 나옴
		//무한루프에 break 걸기
		
		int a=10, b=3;
		int count2=1;
		while(a-b>=0) {
			a = a-b;
			count2++;
		}
		System.out.println(count2);
		
		
		//과제3)
		//어느 달팽이는 낮에는 3cm올라가고
		//밤에는 2.5cm 내려온다고 할때
		//달팽이가 13cm의 나무 꼭대기에 올라가려면
		//며칠이 걸리는지 구하시오.
		//->무한루프에 break걸기
		
		
		
	}//main() end
}//class
