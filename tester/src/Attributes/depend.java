package Attributes;

import java.util.Scanner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class depend 
{
	
	Scanner sc=new Scanner(System.in);
  @Test(timeOut = 200)
  public void f() throws InterruptedException 
  {
	  Thread.sleep(300);
	  System.out.println("this should works");
  }
  @Test(dependsOnMethods = "f")
  public void a()
  {
	  System.out.println("this will execute only when f method is executed ");
  }
  @Test(priority = 3)
  public void b()
  {
	 System.out.println("this method as priority of 3"); 
  }
  @Test(priority = 1)
  public void c() 
  {
	  System.out.println("this method as priority 1 ");
  }
}
