package collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Map <String,String> mapList=new TreeMap<String,String>();
		
		
		mapList.put(new String("123"),new String("Sam"));
		mapList.put(new String("124"),new String("Ram"));
		
		for(Map.Entry entry:mapList.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}

	}
	
	//List->ArrayList,LinkedList,Vector,Stack,
	//Set->HashSet,LinkedHAshSet, TreeSet,
	//Map->HashMap,LinkedHashMap,TreeMap

}
