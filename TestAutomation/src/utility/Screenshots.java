package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots {

	public static void takeScreenshot(ChromeDriver driver, String name) throws IOException
	{
		File f = driver.getScreenshotAs(OutputType.FILE);
		File f1 = new File("./Images/"+name+".png");
		FileUtils.copyFile(f, f1);
	}
	
	
}
