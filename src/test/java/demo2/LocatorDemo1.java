package demo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorDemo1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		driver.findElement(By.id("input")).sendKeys("Rohit Sharma");
		Thread.sleep(5000);
		driver.findElement(By.id("icon")).click();
		Thread.sleep(2000);
		String result=driver.findElement(By.xpath("/html/body/div[4]/div/div[13]/div[2]/div/div/div[3]/div/div[1]/div/div/div/div[1]/div/div")).getText();
		System.out.println(result);
	   // driver.findElement(By.xpath("//*[@id=\"headerMenu\"]/div[2]/div/div/button/svg")).click();
	   
	}

}
