package collectiondemo;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		String str1=new String("Sam");
		String str2=new String("Ram");
		
		
		Vector vector= new Vector();//will be fast when we have multiple  add and delete
		
		vector.add(str1);
		vector.add(str2);
		
		
	    	
		for(Object str:vector) //Enhanced for loop
		{
			System.out.println((String)str);
		}

	}

}
