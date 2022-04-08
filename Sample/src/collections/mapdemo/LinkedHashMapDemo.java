package collections.mapdemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Map<Integer,String> strMap= new LinkedHashMap<Integer,String>();
		
		
		
		strMap.put(1, new String("sam"));
		strMap.put(2, new String("ram"));
		
		
		
		for(Map.Entry<Integer,String> map:strMap.entrySet())
		{
			System.out.println(map.getKey()+" "+map.getValue());
		}

	}

}
