package testing;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;

import listener.ExtendFunctionality;
import utility.Screenshots;

public class TC_001 {
	
	// Waits
	
	@Test
	public void tcase1() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		EventFiringWebDriver wd = new EventFiringWebDriver(driver);
		ExtendFunctionality f = new ExtendFunctionality();
		wd.register(f);
		//driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.SECONDS);
		wd.get("https://www.facebook.com");
		
		
		wd.manage().window().maximize();
		wd.findElement(By.xpath("//input[@type='submit']")).click();
		
		
	}

}
