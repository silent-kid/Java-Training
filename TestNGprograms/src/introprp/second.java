package introprp;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class second {
  @Test
  public void f1() {
	  System.out.println("test is being processed");
  }
  @Test
  public void f2() {
	  System.out.println("test is being processed");
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  System.out.println("it will execute before the test method");
  }
  

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("it will execute after the test method");
  }
  
  @AfterTest
  public void aftertest() {
	  System.out.println("it will execute after completing the all test cases ");
  }
  @BeforeTest
  public void beforetest() 
  {
	  System.out.println("it will execute before all the test cases");
  }

}
