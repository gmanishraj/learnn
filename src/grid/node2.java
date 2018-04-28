 package grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class node2 {
	WebDriver driver;
	String nodeurl;
  @Test(priority=2)
  public void f() throws MalformedURLException {
	  nodeurl= "http://192.168.2.6:6666/wd/hub";
		DesiredCapabilities cap=DesiredCapabilities.chrome();
    cap.setBrowserName("chrome");
    cap.setPlatform(Platform.WINDOWS);
    driver=new RemoteWebDriver(new URL(nodeurl), cap);
    driver.manage().deleteAllCookies();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
    driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
    driver.get("https://www.yatra.com/");
    driver.findElement(By.xpath(".//*[@id='booking_engine_holidays']/span[1]")).click();
  }
}
