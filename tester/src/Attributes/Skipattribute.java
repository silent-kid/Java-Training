package Attributes;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Skipattribute
{
	boolean flag=true;
	@Test
	public void meth1() {
		if(flag) 
			throw new SkipException("arey entra idi....!");
			System.out.println("hlo");
			
		}
	
}
