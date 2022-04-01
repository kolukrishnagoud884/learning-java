package collectionspack;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1= new String("Sam");
		String str2= new String("Ram");
		String str3= new String("John");
		String str4= new String("Ravi");
		
		//List
		//ArrayList 1 //
		//LinkedList2 //faster insert / delete
		//Stack3
		//Vector4
		
		//Set
		//HashSet , LinkedHashSet, TreeSet
		
		
		List<String> lst=new ArrayList<>();
		
		lst.add(str1);
		lst.add(str2);
		lst.add(str3);
		lst.add(str4);
		
		for(String s:lst)
		{
			System.out.println(s);
		}
		
		lst.remove("Ravi");
		
		
		
		//Remove an item from arrayList
		System.out.println("Ater Removal");
		
		for(String s:lst)
		{
			System.out.println(s);
		}

	}

}
