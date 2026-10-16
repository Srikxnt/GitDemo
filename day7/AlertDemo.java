package day7;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.krninformatix.com/selenium/testing");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Srikant");
		alert.accept();

	}

}
