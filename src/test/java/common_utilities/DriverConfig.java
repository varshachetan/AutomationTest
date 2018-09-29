package common_utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverConfig {
	public static WebDriver driver;
	public static void openBrowser(String browserName)
	{
		if(driver==null){
		switch(browserName)
		{
			case "chrome":
				System.setProperty("webdriver.chrome.driver", "D:\\varsha_java\\Selenium\\chromedriver_win32\\chromedriver.exe");
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--disable-infobars");
				driver = new ChromeDriver(options);
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				break;
		}
		ReportConfig.intialiseconfig();
	}	
	}
}
