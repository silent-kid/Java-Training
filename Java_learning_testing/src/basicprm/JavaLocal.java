package basicprm;

public class JavaLocal 
{
	public void meth1() 
	{
	 int score=100;
	 System.out.println("your total score is "+score);
	}
	public void meth2() 
	{
		int sub=6;
		System.out.println("your total subjects"+sub);
	}
	public static void main(String []a)
	{
		JavaLocal jl=new JavaLocal();
		jl.meth1();
		jl.meth2();
	}
}
