package Basepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Bclass {
	
	
	public static WebDriver driver;
	
public static void launchApplication() {
		
		WebDriverManager.chromedriver().setup();
		
			 driver = new ChromeDriver();
		 driver.get("https://studio.cucumber.io/users/sign_in");
		 driver.manage().window().maximize();
		 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		 
		 
	}

	public static void driverclose()
	{
		driver.close();
		
	}

}
