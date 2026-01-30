package Test_first;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Firstprp {
  @Test
  public void f() 
  {
	  System.out.println("this is a testcase   3 third");
	  
  }
  @BeforeTest
  public void beforeTest()
  {
	  System.out.println("this should execute before case and this 2nd exe/n");
	  System.out.println(" ");
  }
  @BeforeClass
  public void beforeclass() {
	   System.out.println("entrer you name");
  }

  @AfterTest
  public void afterTest() 
  {

	  System.out.println("this should execute after case and this 4nd exe/n");
	  System.out.println(" ");
  }
  
  @BeforeSuite
  public void beforeSuite() 
  {

	  System.out.println("this should execute before test and this first(1) exe/n");
	  System.out.println(" ");
  }

  @AfterSuite
  public void afterSuite() 
  {
	  System.out.println("this should execute after test and this 5 last exe/n");
	  System.out.println(" ");
  }

}
