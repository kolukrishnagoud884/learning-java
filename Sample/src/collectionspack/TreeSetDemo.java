package collectionspack;


import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1= new String("Sam");
		String str2= new String("Ram");
		String str3= new String("John");
		String str4= new String("Ram");
		
		
		
		TreeSet<String> strSet= new TreeSet<String>();
		
		strSet.add(str1);
		strSet.add(str2);
		strSet.add(str3);
		strSet.add(str4);
		
		
		for(String s:strSet)
		{
			System.out.println(s);
		}



	}

}
