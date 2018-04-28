package grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Testgrid {
	static WebDriver driver;
static	String nodeurl;
	
	

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		nodeurl= "http://192.168.2.8:9900/wd/hub";
		DesiredCapabilities cap=DesiredCapabilities.chrome();
        cap.setBrowserName("chrome");
        cap.setPlatform(Platform.WINDOWS);
        driver=new RemoteWebDriver(new URL(nodeurl), cap);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
        driver.get("https://www.amazon.in/");
        driver.findElement(By.xpath("//a[@class='a-link-normal']")).click();
        

	}

}
