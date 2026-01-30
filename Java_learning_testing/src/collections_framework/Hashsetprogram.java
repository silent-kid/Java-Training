package collections_framework;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Hashsetprogram 
{
	public static void main(String[] args) 
	{
		String a = "iam lucky guyyy";
		HashSet<Character> hs =new HashSet<Character>();
		for(int i=0;i<a.length();i++) 
		{
			hs.add(a.charAt(i));
		}
		System.out.println(hs);
		
		
		for(char s:hs) 
		{
			System.out.println(s);
		}
		Iterator<Character> it= hs.iterator();	
		while(it.hasNext()) 
		{
			System.out.println(it.next());
		}
		hs.forEach(i -> System.out.println(i));
	}
}
