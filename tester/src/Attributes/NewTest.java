package Attributes;

import org.testng.annotations.Test;

public class NewTest
{
  @Test(enabled=false)
  public void test1() 
  {
	  System.out.println("iam not gonna execute");
  }
  @Test
  public void test2() 
  {
	  System.out.println("iam gonna execute");
  }
}
