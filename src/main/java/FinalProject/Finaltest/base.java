package FinalProject.Finaltest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

	public WebDriver driver;
	public  WebDriver initialiseDriver() throws IOException
	{
		
		Properties prop =new Properties();
		FileInputStream fileinput =new FileInputStream("C:\\Users\\ajakkula\\eclipse-workspace\\Finaltest\\src\\main\\data.properties");
		prop.load(fileinput);
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:/NEWLEARNINGS/chromedriver_win32/chromedriver.exe");
			driver=new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		return driver;
	}
}
