package oop0328;

public class Test04_PrintFormat {
	public static void main(String[] args) {
		//��¼���
/*
 	-Frontend : View
 				HTML/CSS, JavaScript/JQuery, AJAX
 	
 	-Backend  : Server
 	 			JSP, ASP, PHP ,Python
 		
 */
		//�ܼ� ��ȣ�� �����Ϸ��� \�� ���� ���
		System.out.println("\""); // "
		System.out.println("\\"); // \
		//�ٹٲ� \n
		System.out.println("����\n�λ�\n\n����");
		//�� \t
		System.out.println("����\t����");
			
//-----------------------------------------------------------------
		/*
		   ������    %d
		   �Ǽ���    %f
		   ������    %c
		   ���ڿ��� %s
		  
		 */
		//�⺻ ����
		//System.out.printf("��¼���", ��);
		System.out.printf("%d %d %d\n", 2,3,4);
		System.out.printf("����:#%d#\n",25);	 //#25#
		System.out.printf("����:#%5d#\n",25); //#   25# (������ ����)
		System.out.printf("����:#%-5d#\n",25);//#25   # (���� ����)
		
		System.out.printf("%f %f \n", 1.2,3.4);  //1.200000 3.400000 
		System.out.printf("Ű:#%f#\n",173.9);	 //#173.900000#
		System.out.printf("Ű:#%9.2f#\n",173.9);  //#   173.90#
		System.out.printf("Ű:#%-9.2f#\n",173.9); //#173.90   #
		System.out.printf("Ű:#%.2f#\n",173.9);   //#173.90#
		
		System.out.printf("%c\n", 'A');		//A
		System.out.printf("#%-5c#\n", 'B'); //#B    #
		
		System.out.printf("%s\n", "APPLE");	//APPLE
		System.out.printf("#%-5s#\n", "HI");//#HI   #
	}//main() end
}//class end
