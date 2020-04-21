package Base;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static String URL="https://ezcontent.srijan.net/user/login";
	public static String User="editor@srijan.net";
	public static String Pass="editor@123";

public static WebDriver driver;

public static WebDriver beforeSuite() {
	System.setProperty("webdriver.gecko.driver", "/Users/ghanesh.jain/Downloads/geckodriver");
	//WebDriverManager.firefoxdriver().setup();
	driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	return driver;
	}
	



//public WebDriver getDriver() {
//	return driver;
}


