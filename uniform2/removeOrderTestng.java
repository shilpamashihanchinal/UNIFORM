package uniform2;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class removeOrderTestng {
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
		  public void test_Order_remove()
		  {
			  Remove_order remove=new  Remove_order (dr);
			 remove.do_login("SPORTS T-SHIRTS","1");
//			  verify= reccur.do_login("141");
//				 Assert.assertEquals(verify, "Recurring Orders");

			 
			  
		  }

}
