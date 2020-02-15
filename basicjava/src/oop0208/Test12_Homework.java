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
		
		int a=10, c=a, b=3;
		int count2=1;
		while(c-b>0) {
			c = c-b;
			count2++;
		}
		System.out.println(a+"값에서 "+b+"값을 "+count2+"번 뺏을때 음수가 됩니다.");
		System.out.println();

		
		int x=3;
		int su=10;
		int counts=0;
		while(true) {
			counts = counts+1;
			su=su-x;
			if(su<0) {
				break;
			}//if end
		}//while end
		System.out.println(counts);
		
		
		
System.out.println("----------------------------------------------------------");
		
		
		//과제3)
		//어느 달팽이는 낮에는 3cm올라가고
		//밤에는 2.5cm 내려온다고 할때
		//달팽이가 13cm의 나무 꼭대기에 올라가려면
		//며칠이 걸리는지 구하시오.
		//->무한루프에 break걸기
		
		//int oneDay = 0.5;
		int top = 13;
		int dayCount = 0;

		for(float oneDay = 0 ; oneDay <= top ; oneDay += 0.5){
		dayCount++;
		}
		System.out.println("달팽이가 "+top+"cm 올라가는데 "+dayCount+"일 걸립니다.");

		
		int day = 0;
		double snail=0.0; //달팽이
		for(;;) {//무한loop
			day++;
			snail = snail + 3.0;
			if(snail >= 13.0) {
				break;
			}else {
				snail = snail-2.5;
			}
		}//for end
		
		System.out.println(day+"일");
		
		
		
	}//main() end
}//class
