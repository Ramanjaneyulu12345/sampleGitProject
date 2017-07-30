package com.core.basic;
import org.testng.annotations.*;
public class Test3 {
	
  @Test (groups="Group1")
	public void A()
   {
	   System.out.println("A");
   }
  @Test (groups="Group1")
   public void B()
  	{
  		System.out.println("B");
  	}
  @Test (groups="Group2")
  	public void D()
  	{
  		System.out.println("D");
  	}
  @Test (groups="Group2")
  	public void C()
  	{
  		System.out.println("C");
  	}
}
