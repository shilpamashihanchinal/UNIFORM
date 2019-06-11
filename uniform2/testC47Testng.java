package uniform2;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class testC47Testng {
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
		  public void test_Test_Case47()
		  {
			  TestCase47 testcase=new TestCase47(dr);
				
			  verify=testcase.do_login("164","Pavani Alamuri","567","2019-04-01","2019-04-01");
				  
					 Assert.assertEquals(verify, "Orders");
			 
			  
		  }

	}
