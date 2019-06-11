package uniform2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.Select;

public class TestCase48 {
	WebDriver dr;
	
	By btn2=By.xpath("//*[@id='catalog']/a");                        //category
	By btn3=By.xpath("//*[@id='catalog']/ul/li[1]/a");                 //category
	By btn4=By.xpath("//*[@id='content']/div[1]/div/div/a[1]/i");      //add new
	
	By btn5=By.xpath("//*[@id='input-name1']");                   //enter name                                                 
	By btn6=By.xpath("//*[@id='language1']/div[2]/div/div/div[3]/div[2]");              //description           
	By btn7=By.xpath("//*[@id='input-meta-title1']");                   //meta title      
	By btn8=By.xpath("//*[@id='input-meta-description1']");              //meta descr
	By btn9=By.xpath("//*[@id='content']/div[1]/div/div/button");                    //save 
	By btn10=By.xpath("//*[@id='catalog']/a");                                    //category
	By btn11=By.xpath("//*[@id='catalog']/ul/li[2]/a");                                 //products
	By btn12=By.xpath("//*[@id='content']/div[1]/div/div/a/i");                       //add new
	By btn13=By.xpath("//*[@id='input-name1']");                              //prod name   
	By btn14=By.xpath("//*[@id='input-meta-title1']");                              //meta title
	By btn15=By.xpath("//*[@id='form-product']/ul/li[2]/a");                                 //data tab
	By btn16=By.xpath("//*[@id='input-model']");                              //model
	By btn17=By.xpath("//*[@id='form-product']/ul/li[3]/a");                         //link tab
	By btn18=By.xpath("//*[@id='input-category']");                            //categry   
	By btn19=By.xpath("//*[@id=\"tab-links\"]/div[2]/div/ul");                                //select catg
	By btn20=By.xpath("//*[@id='content']/div[1]/div/div/button");                                  //save
	

	
	By veri=By.xpath("//*[@id='catalog']/ul/li[1]/a");	                     
	
	
	                   
	
	public TestCase48(WebDriver dr)
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
	
	public void clk_btn4()       
	{
		dr.findElement(btn4).click();
		
	} 
	public void set_id1(String name)
	{
		
		dr.findElement(btn5).sendKeys(name);
	}
	
	
	public void set_id2(String desc)
	{
		
		dr.findElement(btn6).sendKeys(desc);
	}
	
	public void set_id3(String metat)
	{
		
		dr.findElement(btn7).sendKeys(metat);
	}
	public void set_id4(String metad)
	{
		
		dr.findElement(btn8).sendKeys(metad);
	}
	public void clk_btn9()      
	{
		dr.findElement(btn9).click();
		
	} 

	
	public void clk_btn10()      
	{
		dr.findElement(btn10).click();
		
	} 
	public void clk_btn11()      
	{
		dr.findElement(btn11).click();
		
	} 	public void clk_btn12()      
	{
		dr.findElement(btn12).click();
		
	} 
	
	public void set_id5(String pname)
	{
		
	   dr.findElement(btn13).sendKeys(pname);
	}
	public void set_id6(String metatl)
	{
		
	   dr.findElement(btn14).sendKeys(metatl);
	}	
	public void clk_btn15()      
	{
		dr.findElement(btn15).click();
		
	} 
	
	
	public void set_id7(String model)
	{
		
	   dr.findElement(btn16).sendKeys(model);
	} 
	public void clk_btn17()      
	{
		dr.findElement(btn17).click();
		
	} 
	public void clk_btn18()      
	{
		dr.findElement(btn18).click();
		
	} 
	public void clk_btn19()      
	{
		
		WebDriverWait wait1 =new WebDriverWait(dr,50);
		wait1.until(ExpectedConditions.elementToBeClickable(btn19));
		dr.findElement(btn19).click();
		
	} 
	public void clk_btn20()      
	{
		dr.findElement(btn20).click();
		
	} 
	
	

	
	public String do_login(String i,String j,String k,String l,String s,String p,String m)
	{
	
		this.clk_btn2();
		String verif = dr.findElement(veri).getText();
		System.out.println("msg:" + verif);
	    this.clk_btn3();
	   
		this.clk_btn4();
		this.set_id1(i);  //btn5
		this.set_id2(j);
		this.set_id3(k);
		this.set_id4(l);
		this.clk_btn9();
		this.clk_btn10();
		this.clk_btn11();
		this.clk_btn12();
		this.set_id5(s);
		this.set_id6(p);
		this.clk_btn15();
		this.set_id7(m);
		this.clk_btn17();
		this.clk_btn18();
		this.clk_btn19();
		this.clk_btn20();
		return verif;
		
	
		
		/*Alert a=dr.switchTo().alert();
		//String text =a.getText();
		a.accept();*/
		//return verif;
		
		
	}


}
