package facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumdoc {
public static void main(String[] args) 
{
	WebDriver driver = new ChromeDriver();
	System.setProperty("webdriver.chrome.driver", "http://seleniumhq.github.io/selenium/docs/api/java/index.html?org/openqa/selenium/remote/server/package-summary.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html?org/openqa/selenium/remote/server/package-summary.html");
	
	driver.switchTo().frame("classFrame");
	driver.findElement(By.linkText("DEPRECATED")).click();
	
}
}
