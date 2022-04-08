package collectiondemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1=new String("Sam");
		String str2=new String("Ram");
		String str3=new String("Ram");
		
	Set<String> strSet =new LinkedHashSet<>();
		strSet.add(str1);
		strSet.add(str2);
		strSet.add(str3);
		
		
		for(String str:strSet)
		{
			System.out.println(str);
		}

	}

}
