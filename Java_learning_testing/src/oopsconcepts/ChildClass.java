package oopsconcepts;

public class ChildClass extends Inharitance1stprp
{
	static String b;
	
	void meth3(int a,int b)
	{
		int c = a*b;
		System.out.println("multiplication 0f 2 numbers"+c);
	}
	void meth4(int a,int b) 
	{
		int c = a%b;
		System.out.println("reminder 0f 2 numbers"+c);
	}
	ChildClass()
	{
		System.out.println("non-pra constroctor called");
	}
	ChildClass(String s)
	{
		b=s;
		System.out.println(s);
		System.out.println(b);
	}
	public static void main(String []args) 
	{
		//ChildClass bc=new ChildClass();
		b="dillu";
		ChildClass cc= new ChildClass(b);
		/* cc.add(4,6);
		 cc.sub(5,8);
		 cc.meth3(10,7);
		 cc.meth4(3, 8);*/
	}
}
