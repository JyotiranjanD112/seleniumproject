package Sample;

import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class SampleTest1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
	
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		/*	driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(50);
		driver.manage().window().maximize();

		driver.findElement(By.id("name")).sendKeys("Jyoti");
		driver.findElement(By.id("email")).sendKeys("jyoti384@gmail.com");
		driver.findElement(By.name("gender")).click();
		driver.findElement(By.id("sunday")).click();
		Thread.sleep(100);
		Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='country']")));
		dropdown.selectByValue("india"); */
		
		//sendkeys
        WebElement searchbox = driver.findElement(By.xpath("//input[@class='inputs ui-autocomplete-input']"));
		searchbox.sendKeys("India");
		Thread.sleep(1000);
		
		//Action class(suggestion box)
		Actions act= new Actions(driver);
		act.moveToElement(searchbox)
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ENTER)
		.build()
		.perform();		
		
		//dropdown
		Select dropdown = new Select(driver.findElement(By.xpath("//select[@name=\"dropdown-class-example\"]")));
        dropdown.selectByValue("option2");
		
        //Frame Handling(Switch Tab)
       /* String parentWindow = driver.getWindowHandle();
 
        driver.findElement(By.xpath("//a[@id='opentab']")).click();
        
        Set<String> windowHandle = driver.getWindowHandles();        
       
        for(String handle : windowHandle) 
        {
        	if(! handle.equals(parentWindow))
        	{
        		driver.switchTo().window(handle);
        		
        }
       	System.out.println("Title Of Tab :" + driver.getTitle());
       	
       	driver.switchTo().window(parentWindow);
       	
       	System.out.println("Title Of Parent Window :" + driver.getTitle()); */
        
        driver.findElement(By.xpath("//input[@name='enter-name']")).sendKeys("Jyoti");
        driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
        Thread.sleep(1000);
        Alert alert = driver.switchTo().alert();
       String alertmsg = driver.switchTo().alert().getText();
       System.out.println("Alert message :" + alertmsg);
		alert.accept();	
		
	
		
		
		driver.close();
	}
	
}

	

