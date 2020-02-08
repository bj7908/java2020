package oop0208;

public class Test08_quiz {

	public static void main(String[] args) {
		// for관련 문제
		//문)구구단 9단
		for(int i = 2 ; i<=9 ; i++) {
			for(int j = 1 ; j<=9 ; j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}//for end
		}//for end
		System.out.println();
		
		//------------------------------------------------
		//갯수, 누적
		//문)1~5 사이의 값을 전부 더하시오.
		int hap = 0;
		for(int num = 1 ; num <= 5 ; num++) {
			hap += num;
		}//for end
		System.out.println(hap);
		System.out.println();
		//-------------------------------------------------
		//문)4팩토리얼값을 구하시오
		//-> 4*3*2*1
		long gop = 1;
		for(int f=4 ; f>=1 ;f=f-1) {
			gop = gop * f;
		}//for end
		System.out.println(gop);
		System.out.println();
		//-------------------------------------------------
		//문)1~5중에서 짝수의 갯수을 구하여라
		int num1 = 0;
		for(int i = 1 ; i<=5 ; i++) {
			if(i%2 == 0) {
				num1++;
			}
		}
		System.out.println(num1);
		System.out.println();
		
		//---------------------------------------------------
		//문)두수사이의 합을 구하시오
		//int start=2, end=5;
		int start=5, end=2;
		
		//start값이 end값보다 크면, 두변수의 값을 서로 교환(swap)
		int tmp;
		tmp = start;
		start = end;
		end = tmp;
		
		int sum=0;
		for (int a=start ; a <=end ; a++) {
			sum = sum+a;
		}//for end
		System.out.println(sum);
		System.out.println();
		
	}// main() end

}// class end
