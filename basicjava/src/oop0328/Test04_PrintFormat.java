package oop0328;

public class Test04_PrintFormat {
	public static void main(String[] args) {
		//출력서식
/*
 	-Frontend : View
 				HTML/CSS, JavaScript/JQuery, AJAX
 	
 	-Backend  : Server
 	 			JSP, ASP, PHP ,Python
 		
 */
		//단순 기호로 접근하려면 \와 같이 사용
		System.out.println("\""); // "
		System.out.println("\\"); // \
		//줄바꿈 \n
		System.out.println("서울\n부산\n\n제주");
		//탭 \t
		System.out.println("국어\t영어");
			
//-----------------------------------------------------------------
		/*
		   정수형    %d
		   실수형    %f
		   문자형    %c
		   문자열형 %s
		  
		 */
		//기본 형식
		//System.out.printf("출력서식", 값);
		System.out.printf("%d %d %d\n", 2,3,4);
		System.out.printf("나이:#%d#\n",25);	 //#25#
		System.out.printf("나이:#%5d#\n",25); //#   25# (오른쪽 정렬)
		System.out.printf("나이:#%-5d#\n",25);//#25   # (왼쪽 정렬)
		
		System.out.printf("%f %f \n", 1.2,3.4);  //1.200000 3.400000 
		System.out.printf("키:#%f#\n",173.9);	 //#173.900000#
		System.out.printf("키:#%9.2f#\n",173.9);  //#   173.90#
		System.out.printf("키:#%-9.2f#\n",173.9); //#173.90   #
		System.out.printf("키:#%.2f#\n",173.9);   //#173.90#
		
		System.out.printf("%c\n", 'A');		//A
		System.out.printf("#%-5c#\n", 'B'); //#B    #
		
		System.out.printf("%s\n", "APPLE");	//APPLE
		System.out.printf("#%-5s#\n", "HI");//#HI   #
	}//main() end
}//class end
