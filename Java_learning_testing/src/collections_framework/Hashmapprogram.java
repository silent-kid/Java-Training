package collections_framework;

//import java.security.KeyStore.Entry;
//import java.sql.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;


public class Hashmapprogram
{
 public static void main(String[] args)
 {
	 Scanner sc=new Scanner(System.in);
	  int arr[]=new int[5];
	HashMap<Integer, String> hp= new HashMap<Integer, String>();
	for(int i=0;i<arr.length;i++) 
	{
		arr[i]=i;
		System.out.println("key is taken care plz fill the value");
		hp.put(arr[i],sc.next());
	}
	System.out.println(hp);
	
	   Set sn= hp.entrySet();
	   Iterator it=sn.iterator();
	   
	   while(it.hasNext())
	   {
		   
		   System.out.println(it.next());
	   }
	   for(Entry<Integer, String> d:hp.entrySet()) {
	   System.out.println(d.getKey());
	   System.out.println(d.getValue());
 }
}
}
