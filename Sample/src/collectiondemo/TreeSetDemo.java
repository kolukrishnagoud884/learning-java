package collectiondemo;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1=new String("Sam");
		String str2=new String("Ram");
		String str3=new String("Ram");
		
	Set<String> strSet =new TreeSet<>();
		strSet.add(str1);
		strSet.add(str2);
		strSet.add(str3);
		
		
		for(String str:strSet)
		{
			System.out.println(str);
		}
	}

}
