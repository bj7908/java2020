package oop0328;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Properties;

public class Test10_properties {
	public static void main(String[] args) {
		//properties클래스
		//구분기호 = 또는 : 기준으로 분리가능하다.
		try {
			String fileName="D:/java0201/javaGit/java2020/basicjava/src/oop0328/command.properties";
			FileInputStream fis = new FileInputStream(fileName);
			Properties prop= new Properties();
			//.properties파일 담기
			prop.load(fis);
			//커서이름 : iter
			Iterator iter = prop.keySet().iterator();
			while(iter.hasNext()) {
				// = 앞의 문자열
				String key =(String) iter.next();
				// = 뒤의 문자열
				String value = prop.getProperty(key);
				System.out.println(key);
				System.out.println(value);
			}
			prop.clear();
			fis.close();
			
		}catch (Exception e) {
			System.out.println("실패:"+e);
		}//try end
		
	}//main() end
}//class end
