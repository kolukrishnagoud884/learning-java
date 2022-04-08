package collectiondemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1=new String("Sam");
		String str2=new String("Ram");
		
		
		List<String> strList= new LinkedList<String>();//will be fast when we have multiple  add and delete
		
		strList.add(str1);
		strList.add(str2);
		
	    	
		for(String str:strList) //Enhanced for loop
		{
			System.out.println(str);
		}
		

	}

}
