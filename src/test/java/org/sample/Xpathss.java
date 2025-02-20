package org.sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpathss {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		driver.findElement(By.xpath("(//a[@class='nav-a  '])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Get It by Tomorrow']//preceding-sibling::div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Apple']//preceding-sibling::div//child::i")).click();
		
		
		
	}

}
