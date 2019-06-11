package uniform;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Customer_filter {
	
	
WebDriver dr;
	
	By btn2=By.xpath("//*[@id='customer']/a");           //customer
	By btn3=By.xpath("//*[@id='customer']/ul/li[1]/a");       //customer
	By id=By.xpath("//*[@id='input-name']");                 //customer name
	By btn5=By.xpath("//*[@id='button-filter']/i");          // filter
	By id1=By.xpath("//*[@id='input-email']");               //customer email
	By btn6=By.xpath("//*[@id='button-filter']/i");           // filter
	By veri=By.xpath("//*[@id='customer']/ul/li[1]/a");
	                 
	
	public Customer_filter(WebDriver dr)
	{
		this.dr=dr;
	}

		
	public void clk_btn2()
	{
		dr.findElement(btn2).click();
				/*String str= dr.findElement(By.xpath("//*[@id='customer']/ul/li[1]/a")).getText();
				assertEquals(str, "Customers");
				System.out.println(str);*/
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
	
	public void set_id1(String rid)
	{
		dr.findElement(id1).sendKeys(rid);
	}

	
	public void clk_btn6()      
	{
		dr.findElement(btn6).click();
		
	} 
	
	
	public  String do_login(String i,String j)
	{
	
		this.clk_btn2();
		String verif = dr.findElement(veri).getText();
		System.out.println("msg:" + verif);
		
		this.clk_btn3();
		this.set_id(i);
		this.clk_btn5();
		this.set_id1(j);
		this.clk_btn6();
		return verif;

		


	}
}
