package collections.mapdemo;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Hashtable<Integer,String> strMap= new Hashtable<Integer,String>();
		
		
		
		strMap.put(1, new String("sam"));
		strMap.put(2, new String("ram"));
		
		
		
		for(Map.Entry<Integer,String> map:strMap.entrySet())
		{
			System.out.println(map.getKey()+" "+map.getValue());
		}

	}

}
