package uniform;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminLogin {
	
	
	
	WebDriver dr;
	DeleteTestng dt;
	/*public delete_order()
	{
		this.dr=dr;// TODO Auto-generated constructor stub
	} */
	
	
	public void Login()
	{

	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	 dr= new ChromeDriver();
	 
	dr.get("http://uniformm1.upskills.in/admin/");
	/*By uname=By.xpath("//*[@id='input-username']");
    By pwd=By.xpath("//*[@id='input-password']");
	By btn1=By.xpath("//*[@id='content']/div/div/div/div/div[2]/form/div[3]/button");    //login*/               //login
	
	
	dr.findElement(By.xpath("//*[@id='input-username']")).sendKeys("admin");
	dr.findElement(By.xpath("//*[@id='input-password']")).sendKeys("admin@123");
	dr.findElement(By.xpath("//*[@id='content']/div/div/div/div/div[2]/form/div[3]/button")).click();
	  
	}

}
