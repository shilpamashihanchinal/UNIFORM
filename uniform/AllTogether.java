package uniform;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AllTogether {
	
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

	
	@Test(priority=0)
	public void test_delete_order()
	  {
		  delete_order deleteorder=new delete_order(dr);
		//  deleteorder.do_login();
		 verify= deleteorder.do_login();
		 Assert.assertEquals(verify, "Orders");
		  
	  }
	
	
	@Test(priority=1)
	 public void test_reccuring_order()
	  {
		  Reccuring_order reccur=new Reccuring_order(dr);
		  //reccur.do_login("id123");
		  verify= reccur.do_login("141");
			 Assert.assertEquals(verify, "Recurring Orders");	 
	  }
	
	
	@Test(priority=2)
	  public void test_Return_filter()
	  {
		  Return_filter returnFilter =new Return_filter(dr);
		  returnFilter.do_login("141");
		 
		  
	  }
	  @Test(priority=3)
	  public void test_return_delete()
	  {
		  delete_return returnDelete=new delete_return(dr);
		// returnDelete.do_login();
		 verify= returnDelete.do_login();
		 Assert.assertEquals(verify, "Success: You have modified returns!");
	  } 

	  @Test(priority=4)
	
	  public void test_Customer_filter()
	  {
		  Customer_filter customer =new Customer_filter(dr);
		 // customer.do_login("Neha G","Neha@gmail.com");
		  verify= customer.do_login("Neha G","Neha@gmail.com");
			 Assert.assertEquals(verify, "Customers");
			 

		  
	  }

	 

}
