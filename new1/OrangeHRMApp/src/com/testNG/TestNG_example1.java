package com.testNG;

import org.testng.annotations.Test;

public class TestNG_example1 {
	
	@Test
	public void Gmailapplicationlaunch()
	{
		System.out.println("gmail application launch successful");
	}
	
	@Test
	public void Inbox()
	{
		System.out.println("gmail application Inbox functionality successfull");
		
	}
	
	@Test
	public void Composemail()
	{
		System.out.println("gmail application compose mail functionality test successfull");
	}
	@Test
	public void Sentmail()
	{
		System.out.println("gmail application sent mail functionality test successfull");
	}

}
