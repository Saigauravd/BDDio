package Testhiom;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import page.homepage;

public class baseClass {
 public static WebDriver Driver;
	homepage hemo ;
	
	@BeforeClass
	public void Q()
	{
		hemo = new homepage(Driver);
	}
}
