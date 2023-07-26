package Assignments;

import java.util.ArrayList;

import collections.Arraylist;

public class KeyArray_Sanjay {

	public static void main(String[] args) {

		int []a= {1,2,3,4,5};
		int []b= new int[a.length];
		int key=2;
		int k=0;
		
		for(int i=key;i<a.length;i++)
		{
			b[k++]=a[i];
		}
		
		for (int i = 0; i <key; i++) {
			b[k++]=a[i];
			}
		
		for(int arr:b)
			System.out.print(arr+" ");
	}
		}

