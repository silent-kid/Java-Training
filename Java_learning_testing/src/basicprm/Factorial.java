package basicprm;

public class Factorial 
{
  public int meth1(int n) 
  {
	  if(n<=1) {
		  return 1;
	  }
	  return n *meth1(n-1);
  }
  public static void main(String []args) 
  {
	  int n=10;
	  Factorial f=new Factorial();
	  System.out.println("factorial is "+ n +" =="+ f.meth1(n));
	  
  }
}
