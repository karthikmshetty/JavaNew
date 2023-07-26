package collections;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class Map_HashMap {

	public static void main(String[] args) {

		HashMap<String,Integer>  map = new HashMap<String,Integer>();
	map.put("Ten",10);
	map.put("Twenty",20);

	map.put("Thirty",30);
	map.put("Fifty",50);


	map.put("Fourty",40);
	
	for(Map.Entry<String,Integer> set:map.entrySet() )
	{
		System.out.println(set.getKey()+"  "+set.getValue());
	}

}

}
