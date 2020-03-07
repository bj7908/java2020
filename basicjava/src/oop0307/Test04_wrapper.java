package oop0307;

public class Test04_wrapper {

	public static void main(String[] args) {
		//Wrapper 클래스
		//->대부분 java.lang 기본 팩키지내에 있음
		//->기본자료형을 참조형화 해 놓은 클래스들을 지칭
		//기본형(boolean byte short int long float double char)
		//참조형(Boolean Byte Short Integer Long Float Double Character)
		
		boolean bool = true;
		
		Boolean bool2 = new Boolean(false);
		Boolean bool3 = new Boolean("true");
		System.out.println(bool2.toString());//"false"
		
		byte by1 = 3;
		Byte by2 = new Byte("5");
		System.out.println(by2.doubleValue());//5.0
		
		int inte1 = 7;
		Integer inte2 = new Integer(9);
		Integer inte3 = new Integer("9");
		System.out.println(inte2.longValue());//9L
		System.out.println(Integer.toBinaryString(10));//2진수변환
		System.out.println(Integer.toOctalString(10)); //8진수변환
		System.out.println(Integer.toHexString(10));   //16진수변환
		System.out.println(Integer.parseInt("10"));	   //String -> int 변환
		
		Long l1 = new Long(3);
		Double do1 = new Double(1.2);
		Character ch1 = new Character('R');
		
		//is~~~ : 맞아? 틀려? (true/false로 값을 많이 돌려받음)
		//to~~~ 
		//get~~~ : 얻어옴 (대부분 리턴값이 존재)
		//set~~~ : 
		
		System.out.println(Character.isAlphabetic(65));
		System.out.println(Character.toLowerCase('R'));
		
		//'3'->3
		System.out.println(Character.getNumericValue('3'));
		
		
		
	}//main() end
}//class end
