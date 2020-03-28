package oop0328;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Properties;

public class Test10_properties {
	public static void main(String[] args) {
		//propertiesŬ����
		//���б�ȣ = �Ǵ� : �������� �и������ϴ�.
		try {
			String fileName="D:/java0201/javaGit/java2020/basicjava/src/oop0328/command.properties";
			FileInputStream fis = new FileInputStream(fileName);
			Properties prop= new Properties();
			//.properties���� ���
			prop.load(fis);
			//Ŀ���̸� : iter
			Iterator iter = prop.keySet().iterator();
			while(iter.hasNext()) {
				// = ���� ���ڿ�
				String key =(String) iter.next();
				// = ���� ���ڿ�
				String value = prop.getProperty(key);
				System.out.println(key);
				System.out.println(value);
			}
			prop.clear();
			fis.close();
			
		}catch (Exception e) {
			System.out.println("����:"+e);
		}//try end
		
	}//main() end
}//class end
