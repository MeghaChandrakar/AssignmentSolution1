package testcases;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Register {
	

	public static void main(String []args) 
	{

		// This will automatically download the chrome driver and set the path
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://new.koode.in/#/login/0");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Mahii");
		
		driver.findElement(By.xpath("//*[text()='Register']//following::input[@placeholder='Email']")).sendKeys("mahi1@gmail.com");
	
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("8123056789");
		
		driver.findElement(By.xpath("//*[text()='Register']//following::input[@placeholder='Password']")).sendKeys("Abcd123");
		
		driver.findElement(By.xpath("//*[text()='Register']//following::input[@placeholder='Confirm Password']")).sendKeys("Abcd123");
		
		driver.findElement(By.xpath("//*[contains(text(),'Create')]")).click();
		
		driver.close();
	}

}
