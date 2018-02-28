package facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyerrormsg {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://www.facebook.com");
	driver.findElement(By.id("email")).sendKeys("batman@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("password");
	driver.findElement(By.id("loginbutton")).click();
	String expectedMessage = "The password you’ve entered is incorrect. Forgot Password?";
	WebElement actualMessage = driver.findElement(By.cssSelector("#globalContainer > div.uiContextualLayerPositioner._572t.uiLayer > div > div > div"));
	if(expectedMessage.equals(actualMessage)) {
		System.out.println("test case passed");
	}
		else
		{
			System.out.println("test case failed");
		}
	driver.close();
	}
	
}

