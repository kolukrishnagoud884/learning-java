package collectiondemo;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//List Set Map
		
		
		String str1=new String("Sam");
		String str2=new String("Ram");
		
		
		List<String> strList= new ArrayList<String>();//syntax
		
		strList.add(str1);
		strList.add(str2);
		
	    	
		for(String str:strList) //Enhanced for loop
		{
			System.out.println(str);
		}
		
		
		
		
	
		
		
	}

}
