package uniform2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestCase49 {
	
WebDriver dr;
	
	
	
	By btn2=By.xpath("//*[@id=\"sale\"]/a");           //sales
	By btn3=By.xpath("//*[@id='sale']/ul/li[3]/a");       //return
	By btn4=By.xpath("//*[@id='content']/div[1]/div/div/a");       //add new
	
	By btn5=By.xpath("//*[@id='input-order-id']");                           //order id                             
	By btn6=By.xpath("//*[@id='input-customer']");                    //custmor cred
	By btn7=By.xpath("//*[@id='input-firstname']");                      // first name
	By btn8=By.xpath("//*[@id='input-lastname']");                //last name
	By btn9=By.xpath("//*[@id='input-email']");                                //mail
	By btn10=By.xpath("//*[@id='input-telephone']");                         // phone num
	By btn11=By.xpath("//*[@id='input-product']");                                 //product
	By btn12=By.xpath("//*[@id='input-model']");                                //model
	By btn13=By.xpath("//*[@id='content']/div[1]/div/div/button/i");             //save
	By btn14=By.xpath("//*[@id='form-return']/div/table/tbody/tr[1]/td[1]/input");  //chechk box
	By btn15=By.xpath("//*[@id='content']/div[1]/div/div/button/i");                               //delete
     //By btn16=By.xpath("//*[@id='input-date-modified']");                         //ok btn
	//By btn16=By.xpath("//*[@id=");     
	//By btn17=By.xpath("//*[@id='button-filter']");                                   //filter

	By veri=By.xpath("//*[@id='sale']/ul/li[3]/a");	                       //to verify
	
	
	                   
	
	public TestCase49(WebDriver dr){
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
	
	public void set_id1(String id)
	{
		
		dr.findElement(btn5).sendKeys(id);
	}
	public void set_id2(String id)
	{
		
		dr.findElement(btn6).sendKeys(id);
	}
	public void set_id3(String id)
	{
		
		dr.findElement(btn7).sendKeys(id);
	}
	public void set_id4(String id)
	{
		
		dr.findElement(btn8).sendKeys(id);
	}
	public void set_id5(String id)
	{
		
		dr.findElement(btn9).sendKeys(id);
	}
	public void set_id6(String id)
	{
		
		dr.findElement(btn10).sendKeys(id);
	}
	public void set_id7(String id)
	{
		
		dr.findElement(btn11).sendKeys(id);
	}
	public void set_id8(String id)
	{
		
		dr.findElement(btn12).sendKeys(id);
	}

	public void clk_btn13()       
	{
		dr.findElement(btn13).click();
	
	} 
	
	
	public void clk_btn14()      
{
	
		dr.findElement(btn14).click();
	} 
	
	public void clk_btn15()      
	{
		
		dr.findElement(btn15).click();
	} 
	
	
	public String do_login(String i,String j,String k,String l,String m,String n,String o,String p)
	{
	
		this.clk_btn2();
		String verif = dr.findElement(veri).getText();
		System.out.println("msg:" + verif);
	    this.clk_btn3();
	    this.clk_btn4();
	   	this.set_id1(i);
		this.set_id2(j);
		this.set_id3(k);
		this.set_id4(l);
		this.set_id5(m);
		this.set_id6(n);
		this.set_id7(o);
		this.set_id8(p);
		this.clk_btn13();
		this.clk_btn14();
		this.clk_btn15();
		Alert a=dr.switchTo().alert();
		a.accept();
		return verif;
	
		
		
	}


}
