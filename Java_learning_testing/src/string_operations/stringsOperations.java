package string_operations;

public class stringsOperations 
{
	String abc="prabhas";
	String bca="raju";
	public void meth1()
	{
		String p=new String(abc);
		String s2=new String(bca);
	int length=p.length();
	String Fullname=p.concat(s2);
	char b=	p.charAt(5);
	boolean c=p.equals(s2);
		String ulatter=p.toUpperCase();
		String llatter=p.toLowerCase();
		
		System.out.println(length);
		System.out.println(Fullname);
		System.out.println(b);
		System.out.println(c);
		System.out.println(ulatter);
		System.out.println(llatter);
	}
	
	public static void main(String[] args) 
	{
		stringsOperations so= new stringsOperations();
		so.meth1();
	}

}
