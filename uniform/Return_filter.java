package uniform;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Return_filter {
	
	
WebDriver dr;
	
	
	
	By btn2=By.xpath("//*[@id='sale']/a");           //shopping
	By btn3=By.xpath("//*[@id='sale']/ul/li[3]/a");       //return
	By id=By.xpath("//*[@id='input-return-id']");   //recc id
	By btn5=By.xpath("//*[@id='button-filter']/i");  // filter
	
	public Return_filter(WebDriver dr)
	{
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

	
	public void set_id(String rid)
	{
		dr.findElement(id).sendKeys(rid);
	}

	
	public void clk_btn5()      
	{
		dr.findElement(btn5).click();
		
	} 
	
	public  void do_login(String i)
	{
	
		this.clk_btn2();
		this.clk_btn3();
		this.set_id(i);
		this.clk_btn5();
	

}
	}
