package FinalProject.Finaltest;
import java.io.IOException;
import org.testng.annotations.Test;

import pageObjects.loginPage;

public class testSite extends base {

	
	@Test
	public void testapplication() throws IOException {
		driver=initialiseDriver();
		driver.get("http://qaclickacademy.com");
		loginPage login=new loginPage(driver);
		login.getLogin().click();
	}
}
