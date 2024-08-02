package learning_one;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
//WebDriver driver = new ChromeDriver(chromeOptions);
		System.out.println("test1");
		System.out.print("test2");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.9.1");
		System.out.println(driver.getTitle());
		driver.get("https://www.hotstar.com/");
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().to("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.9.1");
		System.out.println("Visited maven url");
		driver.manage().window().minimize();
		System.out.println("Minimized Window");
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		driver.manage().window().fullscreen();
		System.out.println("Fullscreen Window");
		driver.navigate().back();
		System.out.println("Back");
		driver.navigate().forward();
		System.out.println("Forward");
		//driver.close();
	
	}

}
