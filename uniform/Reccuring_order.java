package uniform;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;


public class Reccuring_order {
	
	WebDriver dr;
	
	
	
	By btn2=By.xpath("//*[@id='sale']/a");           //shopping
	By btn3=By.xpath("//*[@id='sale']/ul/li[2]/a");       //
	//By btn4=By.xpath("//*[@id="input-order-recurring-id']");   //checkbox
	By id=By.xpath("//*[@id='input-order-recurring-id']");   //recc id
	By btn5=By.xpath("//*[@id='button-filter']");  // filter
	By veri=By.xpath("//*[@id='sale']/ul/li[2]/a");
	public Reccuring_order(WebDriver dr){
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

	/*public void clk_btn4()       
	{
		dr.findElement(btn4).click();
	} */
	public void set_id(String rid)
	{
		dr.findElement(id).sendKeys(rid);
	}

	
	public void clk_btn5()      
	{
		dr.findElement(btn5).click();
		
	} 
	
	public  String do_login(String i)
	{
	
		this.clk_btn2();
		String verif = dr.findElement(veri).getText();
		System.out.println("msg:" + verif);
		this.clk_btn3();
		//this.clk_btn4();
		this.set_id(i);
		this.clk_btn5();
		return verif;
		
	}
	
	
}