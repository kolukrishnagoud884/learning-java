package collections.mapdemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		
		
		
		
		
		Map<Integer,String> strMap= new HashMap<Integer,String>();
		
		
		
		strMap.put(1, new String("sam"));
		strMap.put(2, new String("ram"));
		
		
		
		for(Map.Entry<Integer,String> map:strMap.entrySet())
		{
			System.out.println(map.getKey()+" "+map.getValue());
		}
		

	}

}
