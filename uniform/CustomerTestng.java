package uniform;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CustomerTestng {
	WebDriver dr;
	String verify;
	 
	  
	  @BeforeClass
	  public void launchBrowser() {
		  
		  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			 dr= new ChromeDriver();
			 dr.get("http://uniformm1.upskills.in/admin");
			 dr.manage().window().maximize();
			 dr.findElement(By.xpath("//*[@id='input-username']")).sendKeys("admin");
				dr.findElement(By.xpath("//*[@id='input-password']")).sendKeys("admin@123");
				dr.findElement(By.xpath("//*[@id='content']/div/div/div/div/div[2]/form/div[3]/button")).click();
	  }
	  
		  @Test
		  public void test_Customer_filter()
		  {
			  Customer_filter customer =new Customer_filter(dr);
			 // customer.do_login("Neha G","Neha@gmail.com");
			  verify= customer.do_login("Neha G","Neha@gmail.com");
				 Assert.assertEquals(verify, "Customers");
				 

			  
		  }
}
