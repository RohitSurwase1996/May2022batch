package utility;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumOperations
{
    public static ChromeDriver driver=null;
    public static Hashtable<String,Object> outputparameters=new  Hashtable<String,Object>();
    
	public static Hashtable<String,Object> browserLaunch(Object[]inputParameters)
	{
		try
		{
		  String strBrowserName=(String)inputParameters[0];
		  String strExe=(String)inputParameters[1];
				
		  System.setProperty(strBrowserName,strExe);
	      driver=new ChromeDriver();
	      driver.manage().window().maximize();
	
	      driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	      
	      outputparameters.put("STATUS", "PASS");
	      outputparameters.put("MESSAGE", "methodUsed: browserLaunch, Input Given: "+ inputParameters[0].toString());
		}
		
		catch(Exception e)
		{
			 outputparameters.put("STATUS", "FAIL");
		     outputparameters.put("MESSAGE", "methodUsed: browserLaunch, Input Given: "+ inputParameters[0].toString());
		}
	      
	      return outputparameters;
	}
		
	public static Hashtable<String,Object> openApplication(Object[]inputParameters)
	{
		try
		{
		 String path=(String)inputParameters[0];
		 driver.get(path);
			
		  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		  
		  outputparameters.put("STATUS", "PASS");
	      outputparameters.put("MESSAGE", "methodUsed: openApplication, Input Given: "+ inputParameters[0].toString());
		  
		}
		catch(Exception e)
		{
			 outputparameters.put("STATUS", "FAIL");
		      outputparameters.put("MESSAGE", "methodUsed: openApplication, Input Given: "+ inputParameters[0].toString());
			  
		}
		 return outputparameters;
	}
	
	public static Hashtable<String,Object> clickOnElement(Object[]inputParameters)
	{
		try
		{
		String path=(String)inputParameters[0];
		driver.findElement(By.xpath(path)).click();
		
		  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		  
		  outputparameters.put("STATUS", "PASS");
	      outputparameters.put("MESSAGE", "methodUsed: clickOnElement, Input Given: "+ inputParameters[0].toString());
		  
		}
		catch(Exception e)
		{
			 outputparameters.put("STATUS", "FAIL");
		      outputparameters.put("MESSAGE", "methodUsed: clickOnElement, Input Given: "+ inputParameters[0].toString());
			  
		}
		
		 return outputparameters;
	}
	public static Hashtable<String,Object> moveToElement(Object[]inputParameters)
	{
		try
		{
		  String xpath=(String)inputParameters[0];
		  Actions act=new Actions(driver);
	      WebElement abc=driver.findElement(By.xpath(xpath));
	      act.moveToElement(abc).build().perform();
	 		
	      driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	      
	      outputparameters.put("STATUS", "PASS");
	      outputparameters.put("MESSAGE", "methodUsed: moveTOElement, Input Given: "+ inputParameters[0].toString());
		  
	      
		}
		catch(Exception e)
		{
			outputparameters.put("STATUS", "FAIL");
		      outputparameters.put("MESSAGE", "methodUsed: moveTOElement, Input Given: "+ inputParameters[0].toString());
			  
		}
		
		 return outputparameters;
	}
	// click on my profile click method is already created so only call with xpath
	
	public static Hashtable<String,Object> sendTextOnUi(Object[]inputParameters)
	{    
		try
		{
		  String path=(String)inputParameters[0];
		  String text=(String)inputParameters[1];
					  
		  driver.findElement(By.xpath(path)).sendKeys(text);
		  
		  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		  
		  outputparameters.put("STATUS", "PASS");
	      outputparameters.put("MESSAGE", "methodUsed: sendTextOnUi, Input Given: "+ inputParameters[1].toString());
		  
		  
		}
		catch(Exception e)
		{
			 outputparameters.put("STATUS", "FAIL");
		      outputparameters.put("MESSAGE", "methodUsed: sendTextOnUi, Input Given: "+ inputParameters[1].toString());
			  
		}
		
		 return outputparameters;
	}
	
	// For sendkeys we create method so for password only call
    // click on login use click method
	
	public static Hashtable<String,Object> ValidationbyGetText(Object[] InputParameters)
	{	
		try
		{
			String giventext = (String)InputParameters[0];
			String path = (String)InputParameters[1];
			
			String capturedtText = driver.findElement(By.xpath(path)).getText();
			
			if(giventext.equalsIgnoreCase(capturedtText))
			{
				System.out.println("Test case pass");
			}
			else
			{
				System.out.println("test case fail");
			}
			
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			outputparameters.put("STATUS", "PASS");
			outputparameters.put("MESSAGE", "methodUsed:ValidationbyGetText,Input Given: "+InputParameters[0].toString());
		}
		catch(Exception e)
		{
			outputparameters.put("STATUS", "PASS");
			outputparameters.put("MESSAGE", "methodUsed:ValidationbyGetText,Input Given: "+InputParameters[0].toString());
			
		}
		return outputparameters;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		//browserLaunch("webdriver.chrome.driver", "C:\\Automation Support\\chromedriver.exe");
				  Object[] input1=new Object[2];
		          input1[0]="webdriver.chrome.driver";
		          input1[1]="C:\\Automation Support\\chromedriver.exe";	  
				  SeleniumOperations.browserLaunch(input1);
		          
		
		//openApplication("https://www.flipkart.com/");
			      Object[] input2=new Object[1];
		          input2[0]="https://www.flipkart.com/";
				  SeleniumOperations.openApplication(input2);
		
		
		//clickOnElement("//*[@class='_2KpZ6l _2doB4z']");
		           Object[] input3=new Object[1];
		           input3[0]="//*[@class='_2KpZ6l _2doB4z']";
		           SeleniumOperations.clickOnElement(input3);
		
		
		// moveToElement("//*[@class='_1_3w1N']");
		           Object[] input4=new Object[1];
		           input4[0]="//*[@class='_1_3w1N']";
		           SeleniumOperations.moveToElement(input4);
			
	
		           
		//clickOnElement("//*[text()='My Profile']");
	               Object[] input5=new Object[1];
		           input5[0]="//*[text()='My Profile']";
		           SeleniumOperations.clickOnElement(input5);
		
							
		 Thread.sleep(9000);
		
		 
		//sendTextOnUi("//*[@class='_2IX_2- VJZDxU']","9923843409");
		           Object[] input6=new Object[2];
                   input6[0]="//*[@class='_2IX_2- VJZDxU']";
                   input6[1]="9923843409";	  
                   SeleniumOperations.sendTextOnUi(input6);
          
		 		 	 
	   //sendTextOnUi("//*[@type='password']","Rohit@123");
		           Object[] input7=new Object[2];
                   input7[0]="//*[@type='password']";
                   input7[1]="Rohit@123";	  
		           SeleniumOperations.sendTextOnUi(input7);
          
		 							
		//clickOnElement("(//*[@type='submit'])[2]");
		            Object[] input8=new Object[1];
                    input8[0]="(//*[@type='submit'])[2]";
                    SeleniumOperations.clickOnElement(input8);


		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
