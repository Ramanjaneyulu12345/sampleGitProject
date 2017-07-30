package com.core.basic;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 extends Test1{
	
	//Test1 Sample=new Test1();
	
	public static Test1 sample;
	
	public static void A()
	{
		A();
		System.out.println("Print A");
	}
	
	public static void Anil(){
		
		sample.A();
		
		System.out.println("this is Anil");
	}
	
	@Test
	public void Seshu(){
		
		System.out.println("this is Seshu");
	}
	@BeforeMethod
	public void Hari(){
		
		System.out.println("this is Hari");
		
	}
	@Test
	public void Koti(){
		
		System.out.println("this is Koti");
	}
	@BeforeTest
	public void Subash(){
		
		System.out.println("this is Subash");
	}
	@AfterMethod
	public void Mahesh(){
		
		System.out.println("this is Mahesh");
	}
	
	public static void main(String[] args) {
		Anil();
		
	}
}
