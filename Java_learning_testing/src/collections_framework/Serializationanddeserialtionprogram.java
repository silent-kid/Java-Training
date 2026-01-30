package collections_framework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class test implements Serializable
{
	public int a;
	public String b;
	
	public test(int a,String b)
	{
		this.a=a;
		this.b=b;
	}
}
public class Serializationanddeserialtionprogram 
{
	 public static void main(String []a) 
	 {
		 test obj=new test(1,"sharuk");
		 String filename="file.ser";
		 try {
			 FileOutputStream file= new FileOutputStream(filename);
			 ObjectOutputStream out=new ObjectOutputStream(file);
			 out.writeObject(obj);
			 out.close();
			 file.close();
			 System.out.println("object has been serialized");
			 
		 }
		 catch (Exception e)
		 {
			System.out.println(e);
		}
		 test obj1=null;
		 try {
			 FileInputStream file=new FileInputStream(filename);
			 ObjectInputStream in =new ObjectInputStream(file);
			 obj1=(test)in.readObject();
			 in.close();
			 file.close();
			 System.out.println("object has been deserilized");
			 System.out.println("a ="+obj1.a);
			 System.out.println("a ="+obj1.b);

			 
					 
		 }
		 catch (Exception e) {
			System.out.println(e);
		}
	 }
}
