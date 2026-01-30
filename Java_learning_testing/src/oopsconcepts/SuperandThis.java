package oopsconcepts;

public class SuperandThis
{
	int marks;
	String name;
	SuperandThis(int marks,String name)
	{
		this.marks=marks;
		this.name=name;
		
	}
   void meth1()
   {
		System.out.println("hii mr :-"+name+" "+"your marks is "+marks);
	}
	
 public static void main(String []a) 
 {
SuperandThis st=new SuperandThis(100,"Srinu");
st.meth1();
	 
	 
 }
}
