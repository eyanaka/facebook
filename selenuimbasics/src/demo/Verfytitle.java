package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verfytitle {
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		String expectedTitle = "Facebook - Log In or Sign Up";
		String acutualtitle = driver.getTitle();//getTile is a predefined fun which we get the title of the page which we are working on
		if(expectedTitle.equals(acutualtitle)){
			System.out.println("Test Case Passed");
		}
		else {
			System.out.println("Test Case Failed");
			
		}
		/// hi hello everyboby
	
	}
}
