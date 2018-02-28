package demo;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyerrormessage {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.findElement(By.id("email")).sendKeys("batman@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("password");
		driver.findElement(By.id("loginbutton")).click();
		//add the button to the dfdjf
	}


}
