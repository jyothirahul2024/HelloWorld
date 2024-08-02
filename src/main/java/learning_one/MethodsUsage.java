package learning_one;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MethodsUsage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodsUsage obj1_MethodsUsage =new MethodsUsage();
		obj1_MethodsUsage.launchBrowser();

	}
	
public void launchBrowser() {
	WebDriver driver = null;
	ChromeOptions chromeOptions = new ChromeOptions();
	chromeOptions.addArguments("--remote-allow-origins=*");
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver(chromeOptions);
	driver.manage().window().maximize();

}
}
