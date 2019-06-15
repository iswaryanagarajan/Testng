package testcase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import commonutility.keyword;
import dataread.read;

public class demotestcase {
	WebDriver driver;
	keyword obj = new keyword();
@BeforeClass
public void drivr(){
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SAIVARSHAN\\Desktop\\chromedriver.exe");
driver=new ChromeDriver();
driver.manage().window().maximize();
}
@DataProvider
public String[][] MethodData() throws IOException{
	String testData[][]=read.getDataFromExcel("testdata.xls","details");
	return testData;
}

@Test(dataProvider="MethodData")
public void TestExceution(String keyword,String locator,String inputData,String details)throws InterruptedException
{
	obj.execute(driver, keyword, locator, inputData);
}
@AfterClass
public void close()
{
driver.close();
}
}

