package commonutility;

import org.openqa.selenium.WebDriver;

public class keyword {
	seleniummethods obj= new seleniummethods();
	public void execute(WebDriver driver,String Keyword, String Locator, String Inputdata){
		switch (Keyword)
		{
			case "OpenWebsite":
			obj.openUrl(driver,Inputdata);
			break;
			case "click":
			obj.click( driver,Locator);
			break;
			case "EnterText":
			obj.entertext( driver,Locator,Inputdata);
			break;
			default:
				System.out.println("Not Matched");
			break;
		}
	}

}
