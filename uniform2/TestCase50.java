package uniform2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCase50 {

WebDriver dr;
	
	
	
	By btn2=By.xpath("//*[@id='customer']/a");                                  //customer
	By btn3=By.xpath("//*[@id='customer']/ul/li[1]/a");                          //customer
    By btn14=By.xpath("//*[@id='form-customer']/div/table/tbody/tr[4]/td[1]/input");   //chechbox
	By btn4=By.xpath("//*[@id='form-customer']/div/table/tbody/tr[4]/td[8]/a/i");       //edit          
	By btn5=By.xpath("//*[@id='input-firstname']");                           //first name clear                            
	By btn6=By.xpath("//*[@id='input-firstname']");                           //enter first name
	By btn7=By.xpath("//*[@id='address']/li[2]/a");                           // address
	By btn8=By.xpath("//*[@id='input-postcode1']");                           //postcode
	By btn9=By.xpath("//*[@id='form-customer']/ul/li[4]/a");                                //reward
	By btn10=By.xpath("//*[@id='input-reward-description']");                          // description
	By btn11=By.xpath("//*[@id='input-points']");                              //points
	By btn12=By.xpath("//*[@id='button-reward']");                                //add reward
	By btn13=By.xpath("//*[@id='content']/div[1]/div/div/button/i");                                 //save 
	By veri=By.xpath("//*[@id='customer']/ul/li[1]/a");	                           //to verify
	
	
	                   
	
	public TestCase50(WebDriver dr){
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
	public void clk_btn14()
	{
		dr.findElement(btn14).click();
	}
	public void clk_btn4()
	{
		dr.findElement(btn4).click();
	}
	
	public void clk_btn5()
	{
		dr.findElement(btn5).click();
	}
	public void set_id2(String id)
	{
		
		dr.findElement(btn6).sendKeys(id);
	}
	public void clk_btn7()
	{
		dr.findElement(btn7).click();
	}
	

		public void set_id4(String id)
	{
		
		dr.findElement(btn8).sendKeys(id);
	}
	public void clk_btn9()
	{
		dr.findElement(btn9).click();
	}
	public void set_id6(String id)
	{
		
		dr.findElement(btn10).sendKeys(id);
	}
	public void set_id3(String id)
	{
		
		dr.findElement(btn11).sendKeys(id);
	}

	

	public void clk_btn12()
	{
		dr.findElement(btn12).click();
	}
	public void clk_btn13()
	{
		dr.findElement(btn13).click();
	}


	
	
	
	public String do_login(String s,String v,String z,String p)
	{
	
		this.clk_btn2();
		String verif = dr.findElement(veri).getText();
		System.out.println("msg:" + verif);
	    this.clk_btn3();
	    this.clk_btn14();
	    this.clk_btn4();
	    this.clk_btn5();
	    dr.findElement(btn5).clear();
	    this.set_id2(s);
	    this.clk_btn7();
	    //this.clk_btn8();
	    dr.findElement(btn8).clear();
	    this.set_id4(v);    
	    this.clk_btn9();
	    this.set_id6(z);
	    this.set_id3(p);
	    
	    this.clk_btn12();
	    this.clk_btn13();
		return verif;
	
		
	}
	
}
