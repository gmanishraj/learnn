import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetScreenOrientation;

import com.sun.jna.platform.FileUtils;

public class Login {

	static
	{
	 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	 		
	}
	public static void main(String[] args) throws InterruptedException, IOException
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	//	Runtime.getRuntime().exec("C:/Windows/system32/calc.exe");
		driver.get("file:///C:/Users/raghu/Desktop/table.html");
		Thread.sleep(2000);
//		WebDriver driver1= new ChromeDriver();
		
		
		//driver1.navigate().to("http://raghu-pc/login.do");
		//By b=By.tagName("/a");
		//WebElement a = driver.findElement(By.name("username"));
//        srcshot=(TakesScreenshot(driver));
//		File srcfile = a.getScreenshotAs(OutputType.FILE);
//		File destfile = new File("C://a.png");
		
//		if
//		{
//			
//		}
		List<WebElement> xp = driver.findElements(By.xpath("//input"));
		for(int i=0;i<xp.size(); i++)		
		{
			xp.get(i).click();
		}
		for(int i=xp.size()-1;i>=0;i--)
		{
			xp.get(i).click();
		}
		List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		for(WebElement link:alllinks)
		{
			String url = link.getAttribute("href");
			System.out.println(url);
			
		}
		List<WebElement> x = driver.findElements(By.xpath("//td"));
		for(int i=0;i<x.size();i++)
		{
			WebElement cell = x.get(i);
			String text = cell.getText();
			System.out.println(text);
			
			
			
		}
		List<WebElement> o = driver.findElements(By.xpath("//td"));
		for(int i=0;i<o.size();i++)
		{
			WebElement cell1 = o.get(i);
			String text1 = cell1.getText();
			try
			{
		int p = Integer.parseInt(text1);
		System.out.println(p);
		
		}
		
			catch(NumberFormatException e)
			{
			}
			}
	}
	
	
	
}
