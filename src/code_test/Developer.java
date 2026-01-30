package code_test;

import java.util.Scanner;

public class Developer extends Employees
{
    String name;
    float sal;
    static String designation;
    void bonus(int bou)
    {
    	System.out.println("your bonus for the last month is " + bou);
    }
    void bonus(float bou)
    {
    	System.out.println("your bonus for the current month "+bou);
    }
    void designation(String name)
	{
		this.name=name;
		System.out.println("hii "+name+" your currently working as a " +designation);
		
	}
	void salary()
	{
		int sal=3000;
		int days=30; 
		this.sal=sal*days;
		System.out.println("your have worked "+days+" and your sal is "+this.sal);
		
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("plz enter your designation");
		designation=sc.next();
		Developer dp=new Developer();
		System.out.println("plz enter your name");
		dp.designation(sc.next());
		dp.salary();
		dp.bonus(3000);
		dp.bonus(5000);
		
	}
	
	

}
