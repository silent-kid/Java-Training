package basicprm;

public class InstanceVariable 
{
	String sub1="eng";
	String sub2="math";
	int marks;
	char grade;
	
	public void std1()
	{
		String name="Rohit";
		marks=30;
		grade='c';
		System.out.println("Hii "+name+" your total "+marks+" your grade is"+ " "+grade);
	}
	
	public void std2()
	{
		String name="Mahesh";
		marks=75;
		grade='A';
		System.out.println("Hii "+name+" your total "+marks+" your grade is"+ " "+grade);
	}
	public static void main(String[]a)
	{
		InstanceVariable iv=new InstanceVariable();
		iv.std1();
		iv.std2();
	}
}
