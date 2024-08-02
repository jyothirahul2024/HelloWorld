package handsOn;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	@BeforeSuite
	public void f1() {
		System.out.println("Calling Before-Suite");
	}
	
	@BeforeTest
	public void f4() {
		System.out.println("Calling Before-Test");
	}
	
	
	@BeforeClass
	public void f3() {
		System.out.println("Calling Before-Class");
	}
	
	@BeforeMethod
	public void f2() {
		System.out.println("Calling Before-Method");
	}
	
	
	

}
