package collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map <String,String> mapList=new LinkedHashMap<String,String>();
		
		
		mapList.put(new String("123"),new String("Sam"));
		mapList.put(new String("124"),new String("Ram"));
		
		for(Map.Entry entry:mapList.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}

	}

}
