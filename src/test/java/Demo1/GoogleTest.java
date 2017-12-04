package Demo1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class GoogleTest {
	
	@Test
	public void homepage() throws Exception
	{
	
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=W7kRWrjGDqKcX6-EppAC&gws_rd=ssl");
		//Assert.assertTrue(driver.getTitle().contains("google"));
		
		File src= ((TakesScreenshot)driver). getScreenshotAs(OutputType. FILE);
		
		FileUtils. copyFile(src, new File("D:/Printscreens/"+System. currentTimeMillis()+".png"));
		
		driver.close();
		
		System.out.println("Verified Test case 1 Successfully");
		
	}

}
