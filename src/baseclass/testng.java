package baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testng {
	WebDriver driver;
	
	
	@BeforeClass

	public void Browserlunch() throws Exception{
		
		System.setProperty("webdriver.chrome.driver","E:\\softwares\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		
		System.out.println("browser launched");
	}
		
		@Test
		public void Weblaunch() {
	
		driver.get("https://www.greatandhra.com/");
	
		System.out.println("Applaunched");
		

		
	}
	

}
