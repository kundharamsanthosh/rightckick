package com.testNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_example_3 {
	@BeforeTest
	public void Gmailapplicationlaunch()
	{
		System.out.println("Gmail application launch successfully");
		
	}
	
	
	@AfterTest
	public void Gmailapplicationclose()
	{
	System.out.println("Gmail application closed successfully ");
	}
	
	@Test(priority=1)
	public void Inbox()
	{
		
	System.out.println("Gmail application Inbox functionality Test successfully ");	
	}
	
	@Test(enabled=false)
	public void Composemail()
	{
		System.out.println("Gmail application composemail functionality Test successfully");
	}
	
	@Test(priority=2)
	public void Sentmail()
	{
		System.out.println("Gmail application sentmail functionality Test successfully ");
	}
	
	


		
	

}
