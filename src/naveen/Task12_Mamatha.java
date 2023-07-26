package naveen;

import java.util.LinkedList;

import collections.Linkedlist;

public class Task12_Mamatha {

	//sort the value in linked list without using collections.sort 
	public static void main(String[] args)
	{

	LinkedList<Integer> list = new LinkedList();
	list.add(5);
	list.add(4);
	list.add(3);
	list.add(1);
	list.add(2);
	
	for(int i=0;i<list.size();i++)
	{
		for(int j=i+1;j<list.size();j++)
		{
			if(list.get(i)>list.get(j))
			{
				int temp=list.get(i);
				list.set(i,list.get(j));
			    list.set(j,temp);
			    }
			}
		}
	
	System.out.println(list);		
	}
	//NOTE: when 

}
