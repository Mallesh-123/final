package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class helloWorld {
	static
	{
		System.setProperty("webdriver.chrome.driver","G:\\mallesh\\BDD\\chromedriver.exe");
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		{
			
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("http://www.google.com");
		}

	}

}
