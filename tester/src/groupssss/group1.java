package groupssss;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class group1 {
  @Test(groups="s")
  public void f()
  {
	  System.out.println("test case 1");
  }
  @Test(groups="s")
  public void f1()
  {
	  System.out.println("test case 2");
  }
  @Test(groups="s")
  public void f3()
  {
	  System.out.println("test case 3");
  }
  @Test
  public void f4()
  {
	  System.out.println("test case 4");
  }
  @BeforeGroups(groups = "s")
  public void meth() {
	  System.out.println("this will execute before the groups");
  }
  @AfterGroups(groups = "s")
  public void meth2() 
  {
	  System.out.println("this will execute after the groups");
  }
}
