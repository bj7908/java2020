package oop0208;

public class Test03_conversion {

	public static void main(String[] args) {
		// 자료형 변환 DataType Conversion
				
		//1)강제형 변환(cast연산자)
		//->필요한 곳에서 일시적을 변환
		//->(자료형)값
		System.out.println((int)1.3);
		System.out.println((int)2.4+(int)3.7);
		
		System.out.println((int)(2.4+3.7));
		System.out.println();
		
		System.out.println(5);
		System.out.println((double)5);
		System.out.println(5.0);
		System.out.println(5.);
		System.out.println();
		//이렇게 나누기 쓸때 주의!
		System.out.println(3/5); 		 //정수값으로 나누면 정수값이 나온다.
		System.out.println(3/5.0);		 //둘중 하나는 실수형으로 해서 자동 형변환이 되게 한다.
		System.out.println(3.0/5);
		System.out.println((double)3/5); //강제형 변환 사용
		System.out.println();
		//------------------------------------------------
		//2)자동 형변환
		//정수형 : byte < short < int < long
		//실수형 : float < double
		
		byte a = 2;
		int b = a;  //a변수(byte형)는 자동으로 int형으로 형변환
		long c = b; //b변수는(int형) 자동으로 long형으로 형변환
		//a = c; 에러 -> long타입을 byte에 넣으려고 해서 에러가 남
		
		float d = 3.4f;
		double e = d;
		//--------------------------------------------------
		
		System.out.println(65);
		System.out.println((char)65); //'A'
		System.out.println((char)66); //'B'
		System.out.println((char)67); //'C'
		System.out.println();
		
		System.out.println('a');
		System.out.println((int)'a'); //아스키코드(ASCII)로 변환
		System.out.println((int)'b');
		System.out.println((int)'c');
		System.out.println();
		
		System.out.println('A'<'a');
		System.out.println();
		//ASCII코드값이 존재하므로
		//int형과 char형의 강제형 변환이 가능하다.
		System.out.println((int)'+');	//43
		System.out.println((int)' ');	//32
		System.out.println((int)'\r');	//13
		
	}//main() end

}//class end
