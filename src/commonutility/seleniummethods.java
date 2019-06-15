package commonutility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class seleniummethods {
	
public void openUrl(WebDriver driver, String URL){
driver.get(URL);
}

public void click(WebDriver driver, String locator){
	WebElement element= driver.findElement(By.xpath(locator));
	element.click();
}
public void entertext(WebDriver driver, String locator, String InputData){
	WebElement element= driver.findElement(By.xpath(locator));
	element.sendKeys(InputData);
}
}