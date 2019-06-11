package uniform2;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class TestCase47 {

	
WebDriver dr;
	
	
	
	By btn2=By.xpath("//*[@id=\"sale\"]/a");           //sales
	By btn3=By.xpath("//*[@id='sale']/ul/li[1]/a");       //order
	By btn4=By.xpath("//*[@id='input-order-id']");       //enter id
	
	By btn5=By.xpath("//*[@id='button-filter']");                           //filter                             
	By btn6=By.xpath("//*[@id='input-order-status']");                    //status
	By btn7=By.xpath("//*[@id='button-filter']");                      // filter
	By btn18=By.xpath("//*[@id='input-order-status']"); 
	By btn8=By.xpath("//*[@id='input-date-added']");                                //date
	//By btn9=By.xpath("//*[@id='content']/div[2]/div/div[2]/div[1]/div/div[3]/div[1]/div/span/button/i");     //add the date
	By btn10=By.xpath("//*[@id='button-filter']");                                 //filter
	By btn11=By.xpath("//*[@id='input-customer']");                                //enter name
	By btn12=By.xpath("//*[@id='button-filter']");                                //filter
	By btn13=By.xpath("//*[@id='input-total']");                                 //Total
	By btn14=By.xpath("//*[@id='button-filter']");                               //filter
	By btn15=By.xpath("//*[@id='input-date-modified']");                         //modified date
	//By btn16=By.xpath("//*[@id='content']/div[2]/div/div[2]/div[1]/div/div[3]/div[2]/div/span/button/i");       //add modi date
	By btn17=By.xpath("//*[@id='button-filter']");                                   //filter

	By veri=By.xpath("//*[@id='sale']/ul/li[1]/a");	                       //to verify
	
	
	                   
	
	public TestCase47(WebDriver dr){
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
	public void set_id1(String id)
	{
		
		dr.findElement(btn4).sendKeys(id);
	}

	public void clk_btn5()       
	{
		dr.findElement(btn5).click();
		//dr.findElement(btn4).clear();
	} 
	
	
	public void clk_btn6()      
{
	
		dr.findElement(btn6).click();
	} 
	
	public void clk_btn7()      
	{
		
		dr.findElement(btn7).click();
	} 
	public void set_id5(String id)
	{
		
		dr.findElement(btn8).sendKeys(id);
	}
//	public void clk_btn9()      
//	{
//		dr.findElement(btn9).click();
//		
//	} 

	
	public void clk_btn10()      
	{
		dr.findElement(btn10).click();
		
	} 
	public void set_id2(String name)
	{
		
		dr.findElement(btn11).sendKeys(name);
	}
	public void clk_btn12()      
	{
		dr.findElement(btn12).click();
		
	} 
	
	public void set_id3(String total)
	{
		
	   dr.findElement(btn13).sendKeys(total);
	}
	public void clk_btn14()      
	{
		dr.findElement(btn14).click();
		
	} 
	public void set_id6(String id)
	{
		
		dr.findElement(btn15).sendKeys(id);
	}
//	public void clk_btn16()      
//	{
//		dr.findElement(btn16).click();
//		
//	} 
	public void clk_btn17()      
	{
		dr.findElement(btn17).click();
		
	} 
	
	

	
	public String do_login(String i,String j,String k,String s,String v)
	{
	
		this.clk_btn2();
		String verif = dr.findElement(veri).getText();
		System.out.println("msg:" + verif);
	    this.clk_btn3();
	   		this.set_id1(i);
		this.clk_btn5();
		WebElement we=dr.findElement(btn6);
	    Select sel = new Select(we);
		sel.selectByIndex(9);
		this.clk_btn7();
		//dr.findElement(btn4).clear();
		WebElement we1=dr.findElement(btn6);
	    Select sel1 = new Select(we1);
		sel1.selectByIndex(0);

		this.set_id5(s);
		//this.clk_btn9();
		this.clk_btn10();
		this.set_id2(j);
		this.clk_btn12();
		
	
		this.set_id3(k);
		this.clk_btn14();
		this.set_id6(v);
		//this.clk_btn16();
		this.clk_btn17();
		return verif;
	
		
		/*Alert a=dr.switchTo().alert();
		//String text =a.getText();
		a.accept();*/
		//return verif;
		
		
	}

	
}
