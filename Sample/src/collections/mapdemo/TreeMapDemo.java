package collections.mapdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,String> strMap= new TreeMap<Integer,String>();
		
		
		
		strMap.put(1, new String("sam"));
		strMap.put(2, new String("ram"));
		
		
		
		for(Map.Entry<Integer,String> map:strMap.entrySet())
		{
			System.out.println(map.getKey()+" "+map.getValue());
		}
	}

}
	