package collections;

import java.util.Hashtable;

public class Map_HashTable {

	public static void main(String[] args) {
		Hashtable<Integer, String> map = new Hashtable<Integer, String>();

		map.put(10, "Ten");
		map.put(80, "Ten");
		map.put(20, "Twenty");
		map.put(30, "Thirty");
		map.put(40, "Fourty");
		map.put(50, "Fifty");
		System.out.println(map);

	}

}
