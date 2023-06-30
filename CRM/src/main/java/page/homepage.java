package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class homepage {

	
	
	
		private WebDriver Driver;

	
			private By  username = By.xpath("//*[@id='username']");
			private By password = By.xpath("//*[@id='password']");	
			
			
			public  homepage(WebDriver Driver) {
				// TODO Auto-generated constructor stub
				
				Driver = this.Driver;
				
				
			} 
			Actions act = new  Actions(Driver);
			public void Uhome(String uname)
			{
				WebElement Uname = Driver.findElement(username);
			
				act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
				
			}
			public void Phome(String upass)
			{
				WebElement Upass = Driver.findElement(password);
				act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
			}

}
