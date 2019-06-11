package uniform;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class delete_order {
 
	  
		WebDriver dr;
		
		
				
		By btn2=By.xpath("//*[@id=\"sale\"]/a");           //shopping
		By btn3=By.xpath("//*[@id='sale']/ul/li[1]/a");       //order
		By btn4=By.xpath("//*[@id='form-order']/div/table/tbody/tr[8]/td[1]/input[1]");   //checkbox
		
		By btn5=By.xpath("//*[@id='button-delete172']/i");  //delete
		//By text=By.xpath("//*[@id='content']/div[2]/div[1]"); //message
		By veri=By.xpath("//*[@id='sale']/ul/li[1]/a"); //to verify 
		                   
		
		public delete_order(WebDriver dr){
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
			String verif = dr.findElement(veri).getText();
			System.out.println("msg:" + verif);
			this.clk_btn3();
			this.clk_btn4();
			this.clk_btn5();
			Alert a=dr.switchTo().alert();
			//String text =a.getText();
			a.accept();
			return verif;
			
			
		}
		
		
	}


