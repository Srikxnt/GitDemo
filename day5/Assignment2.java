package day5;

import java.net.http.WebSocket;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.youtube.com/");
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));

		int size = allLinks.size();
		System.out.println(size);

		for (WebElement links : allLinks) {
			String text = links.getText();
			System.out.println(text);
		}
	}

}

//div[@id='checkbox-example']/fieldset/label[1]).click
//		driver.switchTo().alert().accept();

//System.out.println(driver.switchTo().alert().getText());
//driver.switchTo().alert().dismiss();
