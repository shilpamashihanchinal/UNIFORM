package uniform2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestC50Testng {
  
	WebDriver dr;
	String verify; 
	 
	  
	  @BeforeClass
	  public void launchBrowser() {
		  
		  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			 dr= new ChromeDriver();
			 dr.get("http://uniformm1.upskills.in/admin");
			 dr.findElement(By.xpath("//*[@id='input-username']")).sendKeys("admin");
				dr.findElement(By.xpath("//*[@id='input-password']")).sendKeys("admin@123");
				dr.findElement(By.xpath("//*[@id='content']/div/div/div/div/div[2]/form/div[3]/button")).click();
	  }
				
				@Test
				  public void test_Test_Case50()
				  {
					TestCase50 testcase=new TestCase50(dr);
						
					  verify=testcase.do_login("Chaitra","560097","bonus","20");
						System.out.println(verify);  
							 Assert.assertEquals(verify, "Customers");
					 
				
	  }
	

	
}
