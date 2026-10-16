package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDown {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://krninformatix.com/sample");
		WebElement drplist= driver.findElement(By.id("cities"));
		
			Select multiSelect = new Select(drplist);
			
			multiSelect.selectByIndex(0);
			multiSelect.selectByValue("2");
			Thread.sleep(2000);
			multiSelect.selectByContainsVisibleText("Mumbai");
			Thread.sleep(2000);
			
			List<WebElement> str1=multiSelect.getOptions();
			int sizwoflist=str1.size();
			for(WebElement WebelementList : str1) {
				String text=WebelementList.getText();
//				System.out.println(WebelementList);
				System.out.println(text);		
			}
			
			System.out.println("==========================================");
			
			List<WebElement> SelectedList = multiSelect.getAllSelectedOptions();
			for(WebElement selectedElement : SelectedList) {
				String SelectedLists = selectedElement.getText();
				System.out.println(SelectedLists);
				
			}

	}

}
