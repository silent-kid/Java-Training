package collections_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arlist2 
{
	public static void main(String[] args) 
	{
		List<Integer> l1=new ArrayList<Integer>();
		for(int i=0;i<10;i++)
		{
			l1.add(i);
		}
		for(Integer n : l1) 
		{
			
			System.out.print(n);
		}
		
		System.out.println();
		Collections.sort(l1,Collections.reverseOrder());
		System.out.println(l1);
		Collections.sort(l1);
		System.out.println(l1);
		
		
	}
}
