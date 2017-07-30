package com.core.basic;

import org.testng.annotations.*;

public class Test4 {
	@Test
	public void a1(){
		System.out.println("a1");
	}
	@BeforeTest
	public void b1(){
		System.out.println("b1");
	}
	@BeforeSuite
	public void c1(){
		System.out.println("c1");
	}
	@AfterTest
	public void d1(){
		System.out.println("d1");
	}

}
