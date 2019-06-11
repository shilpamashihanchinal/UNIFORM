package uniform2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Remove_order {
	
	
	
WebDriver dr;
	
	
	
	By btn2=By.xpath("//*[@id='sale']/a");           //shopping
	By btn3=By.xpath("//*[@id='sale']/ul/li[1]/a");       //order
	By btn4=By.xpath("//*[@id='form-order']/div/table/tbody/tr[1]/td[1]/input[1]");   //checkbox
	
	By btn5=By.xpath("//*[@id='form-order']/div/table/tbody/tr[1]/td[8]/a[2]/i");  //edit
	By btn6=By.xpath("//*[@id='button-customer']");  //continue
	//By btn7=By.xpath("//*[@id='cart']/tr[2]/td[6]/button/i");  //remove
	By btn8=By.xpath("//*[@id='input-product']");  // choose product
	By btn9=By.xpath("//*[@id='input-quantity']");  //quantity
	By btn10=By.xpath("//*[@id='button-product-add']");  //add product
	By btn11=By.xpath("//*[@id='button-cart']");  //continue
	By btn12=By.xpath("//*[@id='button-payment-address']");  //continue
	By btn13=By.xpath("//*[@id='button-save']");  //save
	
	
	By veri=By.xpath("//*[@id='sale']/ul/li[1]/a"); 
	
	                   
	
	public Remove_order(WebDriver dr){
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
	public void clk_btn6()      
	{
		
		dr.findElement(btn6).click();
				WebDriverWait wait1 =new WebDriverWait(dr,50);
		wait1.until(ExpectedConditions.elementToBeClickable(btn8));	
		
		
	} 
	/*public void clk_btn7()      
	{
		dr.findElement(btn7).click();
		
	} */
	public void set_id1(String pro)
	{
		
//				dr.findElement(btn8).sendKeys(pro);
	}

	public void set_id2(String  qnt)
	{
		dr.findElement(btn9).clear();
		dr.findElement(btn9).sendKeys(qnt);
	}
	public void clk_btn10()      
	{
		dr.findElement(btn10).click();
		
	} 
	public void clk_btn11()      
	{
		dr.findElement(btn11).click();
		
	} 
	public void clk_btn12()      
	{
		dr.findElement(btn12).click();
		
	} 
	public void clk_btn13()      
	{
		dr.findElement(btn13).click();
		
	} 


	
	
	
	public void do_login(String i,String j)
	{
	
		this.clk_btn2();
	
		this.clk_btn3();
		this.clk_btn4();
		this.clk_btn5();
		this.clk_btn6();
		WebDriverWait wait1 =new WebDriverWait(dr,50);
		wait1.until(ExpectedConditions.elementToBeClickable(btn8));
		//this.clk_btn7();
		
		this.set_id1(i);
		this.set_id2(j);
		this.clk_btn10();
		this.clk_btn11();
		this.clk_btn12();
		this.clk_btn13();
		
		
		/*Alert a=dr.switchTo().alert();
		//String text =a.getText();
		a.accept();*/
		//return verif;
		
		
	}
	
	
	

	

}
