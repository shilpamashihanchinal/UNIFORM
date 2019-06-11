package uniform;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class delete_return {
	
	
	WebDriver dr;
	
	
	
	By btn2=By.xpath("//*[@id=\"sale\"]/a");           //shopping
	By btn3=By.xpath("//*[@id='sale']/ul/li[3]/a");       //return
	By btn4=By.xpath("//*[@id='form-return']/div/table/tbody/tr[1]/td[1]/input");   //checkbox
	
	By btn5=By.xpath("//*[@id='content']/div[1]/div/div/button/i");  //delete
	By text=By.xpath(""); //message
	
	
	public delete_return(WebDriver dr){
		this.dr=dr;
	}

		
	public void clk_btn2()
	{
		dr.findElement(btn2).click();
	}

	public void clk_btn3()
	{
		dr.findElement(btn3).click();
	}

	public void clk_btn4()       
	{
		dr.findElement(btn4).click();
	} 
	
	public void clk_btn5()      
	{
		dr.findElement(btn5).click();
		
	} 
	
	public String do_login()
	{
	
		this.clk_btn2();
		this.clk_btn3();
		this.clk_btn4();
		this.clk_btn5();
		Alert a=dr.switchTo().alert();
		a.accept();
		String verify = dr.findElement(text).getText();
		return verify;
		
	}

}
