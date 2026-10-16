package day6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver  =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gsmarena.com/samsung-phones-9.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String tooltip =  driver.findElement(By.xpath("//img[contains(@src,'samsung-galaxy-a18')]")).getAttribute("title");
		System.out.println(tooltip);
		
		

	}

}
