package uniform;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AdminTestng {
  @BeforeTest
  public void f() {
	  
	  WebDriver dr;
	  AdminLogin  log = new AdminLogin();
	  log.Login();
	  
	 
  }
}
