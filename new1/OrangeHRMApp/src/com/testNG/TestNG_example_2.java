package com.testNG;

import org.testng.annotations.Test;

public class TestNG_example_2 {
	
	

	
		
		@Test(priority=1)
		public void Gmailapplicationlaunch()
		{
			System.out.println("gmail application launch successful");
			
		}
		
		
			@Test(priority=2)
			public void Inbox()
			{
				System.out.println("gmail application Inbox functionality successfull");
				
			}
			
			@Test(enabled=false)
			public void Composemail()
			{
				System.out.println("gmail application compose mail functionality test successfull");
			}
			
			@Test(priority=3)
			public void Sentmail()
			{
				System.out.println("gmail application sent mail functionality test successfull");
			}
			
		
		

}
