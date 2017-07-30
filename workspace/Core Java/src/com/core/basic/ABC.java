package com.core.basic;
import org.testng.annotations.*;
public class ABC {
	
   @BeforeTest
	public void A()
	{
	System.out.println("A");	
	}
   
   @BeforeMethod
	public void B()
	{
	System.out.println("B");	
	}
   
   @Test
	public void C()
	{
	System.out.println("C");	
	}
   
   @Test
	public void D()
	{
	System.out.println("D");	
	}
   @AfterMethod
	public void E()
	{
	System.out.println("E");	
	}
   @AfterTest
	public void F()
	{
	System.out.println("F");	
	}
}
