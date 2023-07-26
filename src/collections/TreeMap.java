package collections;

public class TreeMap {

	public static void main(String[] args) {

		java.util.TreeMap<Integer, String> tr =new java.util.TreeMap<Integer,String>();
		tr.put(10, "haii");
		tr.put(20, null);
		tr.put(5, "bye");
		System.out.println(tr); // in sorting order it will come
	}

}
