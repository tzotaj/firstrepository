package com.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;



@Test

public class TC_Login {
	
	public void login_test()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
driver.findElement(By.id("email")).sendKeys("tedi_zotaj@hotmail.com");
driver.findElement(By.id("passwd")).sendKeys("12345");
		
driver.findElement(By.id("SubmitLogin")).click();

driver.close();
		
	}

}
