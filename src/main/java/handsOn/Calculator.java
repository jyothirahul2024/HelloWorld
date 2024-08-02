package handsOn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calculator {

	public void add() {
		System.out.println("Adding numbers");
	}
	public void sub() {
		System.out.println("Subtracting numbers");
	}
	public Calculator() {
		System.out.println("Calling constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		calc.add();
		calc.sub();
		/*
		 * WebDriverManager.chromedriver().setup(); WebDriver driver = new
		 * ChromeDriver();
		 */
		
		
		  ChromeOptions chromeOptions = new ChromeOptions();
		  chromeOptions.addArguments("--remote-allow-origins=*");
		  WebDriverManager.chromedriver().setup(); WebDriver driver = new
		  ChromeDriver(chromeOptions); driver.manage().window().maximize();
		  driver.get("https://www.hotstar.com");
		  
	}

}
