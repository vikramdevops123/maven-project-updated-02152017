package Demo1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Mananproject {
	
	String URL="http://mycutebaby.in/contest/participant/?n=5a54a5653b746&utm_source=wsapp_share&utm_campaign=January_2018&utm_medium=shared&utm_term=wsapp_shared_5a54a5653b746&utm_content=participant";
	
	@Test
	public void mananpage() throws Exception
	{
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(URL);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,2350)", "");
		
		WebDriverWait wait=new WebDriverWait(driver,100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[9]/div[1]/form/a/span[2]")));
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[9]/div[1]/form/a/span[2]")).click();
		
		File src= ((TakesScreenshot)driver). getScreenshotAs(OutputType. FILE);
		
		FileUtils. copyFile(src, new File("D:/Printscreens/"+System. currentTimeMillis()+".png"));
		
		driver.close();
	}

}
