package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login 
{

	@Test
	public void login() throws InterruptedException  
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://new.koode.in/#/login/0");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
		//Enter Email id
		driver.findElement(By.xpath("//div[@class='form-login uk-width-2-5@m uk-first-column']//input[@placeholder='Email']")).sendKeys("mahi@gmail.com");
			
		//Enter the Password
		driver.findElement(By.xpath("//div[@class='form-login uk-width-2-5@m uk-first-column']//input[@placeholder='Password']")).sendKeys("Abcd123");
			
		//Click the Checkbox
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
			
		//Click on Sing in button
		driver.findElement(By.xpath("//div[@class='uk-margin']//button[@type='submit'][contains(normalize-space(),'Sign In')]")).click();
	    Thread.sleep(2000);
		
		Assert.assertTrue(driver.getCurrentUrl().contains("home"));
		
		//Close the browser
		driver.close();
				
	}

}
