package collectionspack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1= new String("Sam");
		String str2= new String("Ram");
		String str3= new String("John");
		String str4= new String("Ravi");
		
		
List<String> lst=new LinkedList<>();
		
		lst.add(str1);
		lst.add(str2);
		lst.add(str3);
		lst.add(str4);
		
		for(String s:lst)
		{
			System.out.println(s);
		}
	}

}
