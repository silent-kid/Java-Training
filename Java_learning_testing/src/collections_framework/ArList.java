package collections_framework;

import java.util.ArrayList;
import java.util.List;

public class ArList
{
	public static void main(String []a) 
	{
		 List l=new ArrayList();
		 l.add(100);
		 l.add("Triger");
		 l.add(10.00);
		 for(int i=0;i<l.size();i++)
		 {
			 System.out.println("index of"+i+l.get(i));
		 }
		 
		 List <Integer> l2=new ArrayList<Integer>();
		 for(int i=0;i<10;i++)
		 {
			 l2.add(i);
		 }
		 for(Integer n:l2)
		 {
			 System.out.println(n);
		 }
		 
	}
}
