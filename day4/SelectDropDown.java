package day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://krninformatix.com/sample");

		WebElement drpSelect = driver.findElement(By.id("city"));
		Select selectCity = new Select(drpSelect);

		selectCity.selectByIndex(2);
		Thread.sleep(2000);
		selectCity.selectByValue("2");
		Thread.sleep(2000);
		selectCity.selectByVisibleText("Delhi");
		Thread.sleep(2000);

		List<WebElement> listOption = selectCity.getOptions();
		int sizeoflist = listOption.size();
		System.out.println(sizeoflist);
		for (WebElement WebelementList : listOption) {
			String option = WebelementList.getText();
			System.out.println(option);
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(null));
		
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		alert.sendKeys("Srikant");
		
		

	}
}
