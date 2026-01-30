package lamdaoperation;


  class ClaculatorUsingLamda implements Integermath
{
	public int meth1(int a,int b,Integermath c) 
	{
		return  c.operation(a, b);
	}
	public static void main(String[] args)
	{
		ClaculatorUsingLamda cl=new ClaculatorUsingLamda();
		Integermath add=(a,b)-> a+b;
		Integermath sub=(a,b)-> a-b;
		System.out.println(cl.meth1(5, 10,add));
		System.out.println(cl.meth1(5, 10,sub));

		
		
	}
	
	
}
