package oop0215;

public class Test08_method {

	public static void test1(int a, int b) {
		System.out.println(a);
		System.out.println(b);
	}//test1() end
	
	public static void test2(int[] a) {
		for(int i=0 ; i<a.length ; i++) {
			System.out.println(a[i]);
		}
	}//test2() end
	
	public static void test3(String a, String b) {
		System.out.println(a);
		System.out.println(b);
	}//test3() end
	
	public static void test4(String[] a) {
		for(int i=0 ; i<a.length ; i++) {
			System.out.println(a[i]);
		}
	}//test4() end
	
	public static void test5(int a, int b) {
		System.out.println(a);
		System.out.println(b);
	}//test5() end
	
	public static void test6(int[][] a) {
		for(int i=0 ; i<a.length ; i++) {
			for(int j=0 ; j<a[i].length ; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}//for end
	}//test6() end
	
	public static void main(String[] args) {
		//전달값이 배열인 경우
		int[] su = {10,20,30};
		test1(su[0], su[2]); //10 ,30
		test2(su);

		System.out.println("---------------------------");
		
		String[] str = {"개나리","진달래","무궁화"};
		test3(str[0],str[2]);//"개나리","무궁화"
		test4(str);
		
		System.out.println("---------------------------");
		
		int[][] num = {
				       {1,2,3},
				       {6,5,4}
		              };
		test5(num[0][0], num[1][2]);
		test6(num);
		
		System.out.println("---------------------------");
		
		
	}//main() end

}//class
