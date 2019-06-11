package uniform;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class returnDelTestng {
	
	
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
		  public void test_return_delete()
		  {
			  delete_return returnDelete=new delete_return(dr);
			// returnDelete.do_login();
			 verify= returnDelete.do_login();
			 Assert.assertEquals(verify, "Success: You have modified returns!");
			 

		 
			  
		  }
}
