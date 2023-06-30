package Testhiom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import page.homepage;

public class homee extends baseClass {




	
		@Test
		public void two() {
			Driver= new ChromeDriver();
		Driver.get("https://devportal.uncode.io/apption/login");
		hemo.Uhome("username");
		
	hemo.Phome("password");
		
	}
}
