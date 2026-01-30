package basicprm;

public class Constructorprp 
{
	int marks;
	public Constructorprp() 
	{
		System.out.println("default constructor invoked....!");
	}
	public Constructorprp(int marks)
	{
		marks = marks*6;
		System.out.println("your total marks for the 6 subjects are "+marks);
	}
	public Constructorprp(String s)
	{
		if(marks<=50) 
		{
			System.out.println(s+" you got passed in allthe exams");
		}
		else 
		{
			System.out.println(s+" Better luck next time");
		}
	}
	public static void main(String []args) 
	{
		new Constructorprp();
		new Constructorprp(100);
		new Constructorprp("dillu bhai");
		
	}
}
