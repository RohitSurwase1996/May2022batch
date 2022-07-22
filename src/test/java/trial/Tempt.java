package trial;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tempt 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// Smoke Test
		
		// Launch Browser
		   System.setProperty("webdriver.chrome.driver", "C:\\Automation Support\\chromedriver.exe");
		      ChromeDriver driver=new ChromeDriver();
		      driver.manage().window().maximize();
		
		// open application
		      driver.get("https://www.flipkart.com/");
		
		// cancel login window
		      driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
		      
		// Navigate on login      
			  Actions act=new Actions(driver);
		      WebElement abc=driver.findElement(By.xpath("//*[@class='_1_3w1N']"));
		      act.moveToElement(abc).build().perform();
		 
		// Click on My profile     
		      driver.findElement(By.xpath("//*[text()='My Profile']")).click();
			    
		      
		      Thread.sleep(3000);
		      
		      
	   // provided username 
		   	driver.findElement(By.xpath("//*[@class='_2IX_2- VJZDxU']")).sendKeys("9923843409");
	  
	  // provided password      
		    driver.findElement(By.xpath("//*[@type='password']")).sendKeys("Rohit@123");
		      
      // Click on login      
		      driver.findElement(By.xpath("(//*[@type='submit'])[2]")).click();
		
		      
	 
		   Thread.sleep(3000);   
		      
	/*	      
	  // click on manage addresses      
		      driver.findElement(By.xpath("(//*[@class='NS64GK'])[1]")).click();
		      
		      Thread.sleep(3000);
		      
      // click on add addresses      
		      driver.findElement(By.xpath("//*[@class='_1QhEVk']")).click();
		      
	  // enter name      
		      driver.findElement(By.xpath("(//*[@type='text'])[2]")).sendKeys("Rohit");
		      
	  // enter mobile number     
		      driver.findElement(By.xpath("(//*[@type='text'])[3]")).sendKeys("9923843409");
		      
	 // enter pincode  
		      driver.findElement(By.xpath("(//*[@type='text'])[4]")).sendKeys("411018");
		      
	 // enter locality 
		      driver.findElement(By.xpath("(//*[@type='text'])[5]")).sendKeys("Pimpri");
		      
	 // enter area and street	      
		      driver.findElement(By.xpath("//*[@name='addressLine1']")).sendKeys("Nehru Nagar");
		     
	 // enter landmark	      
		      driver.findElement(By.xpath("//*[@name='landmark']")).sendKeys("Udhaymnagar");
		      
	 // enter alternate phone	      
		      driver.findElement(By.xpath("//*[@name='alternatePhone']")).sendKeys("9096790106");
		    
	 // addresses type 	      
		      driver.findElement(By.xpath("//*[text()='Home']")).click();
		      
	 // click on save 
		      driver.findElement(By.xpath("(//*[@type='button'])[2]")).click();    */
		      
		      
	}
	
	
	
	
	
	
	
	
	

}
