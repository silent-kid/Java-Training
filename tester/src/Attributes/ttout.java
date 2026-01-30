package Attributes;

import org.testng.annotations.Test;

public class ttout 
{
  @Test(timeOut = 300)
  public void f() throws InterruptedException
  {
	  
		  System.out.println("this will execute");
		  Thread.sleep(400);
		 
	
  }
  @Test
  public void meth1() 
  {
	  System.out.println("iam gonna execute");
  }
  
}
