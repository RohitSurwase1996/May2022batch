package cucumbermap;

import java.util.Hashtable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class Login 
{@Given("user open browser with {string} and {string}")
public void user_open_browser_with_and(String string, String string2) 
{
	  Object[] input1=new Object[2];
      input1[0]=string;
      input1[1]=string2;	  
	  SeleniumOperations.browserLaunch(input1);
}

@Given("user enter url as {string}")
public void user_enter_url_as(String url)
{
	 Object[] input2=new Object[1];
     input2[0]=url;
	  SeleniumOperations.openApplication(input2);
}

@When("user click on initial Login page")
public void user_click_on_initial_login_page() 
{
	  Object[] input3=new Object[1];
      input3[0]="//*[@class='_2KpZ6l _2doB4z']";
      Hashtable<String,Object> output3=SeleniumOperations.clickOnElement(input3);
      HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(), "user click on initial Login page", output3.get("MESSAGE").toString());
}

@When("user navigate on Login button")
public void user_navigate_on_login_button() 
{
	  Object[] input4=new Object[1];
      input4[0]="//*[@class='_1_3w1N']";
      Hashtable<String,Object> output4=SeleniumOperations.moveToElement(input4);
      HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(), "user navigate on Login button", output4.get("MESSAGE").toString());
}

@When("user click on My Profile")
public void user_click_on_my_profile() throws InterruptedException
{
	   Object[] input5=new Object[1];
       input5[0]="//*[text()='My Profile']";
       Hashtable<String,Object> output5=SeleniumOperations.clickOnElement(input5);
       HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(), "user click on My Profile", output5.get("MESSAGE").toString());
       Thread.sleep(3000);
}

@When("user enter {string} as username")
public void user_enter_as_username(String uname) throws InterruptedException
{
	Object[] input6=new Object[2];
    input6[0]="//*[@class='_2IX_2- VJZDxU']";
    input6[1]=uname;	  
    Hashtable<String,Object> output6=SeleniumOperations.sendTextOnUi(input6);
    HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(), "user enter {string} as username", output6.get("MESSAGE").toString());
    Thread.sleep(3000);
}

@When("user enter {string} as password")
public void user_enter_as_password(String pass) throws InterruptedException 
{
	Object[] input7=new Object[2];
    input7[0]="//*[@type='password']";
    input7[1]=pass;	  
    Hashtable<String,Object> output7=SeleniumOperations.sendTextOnUi(input7);
    HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(), "user enter {string} as password", output7.get("MESSAGE").toString());
    Thread.sleep(3000);
}

@When("user click on Login button")
public void user_click_on_login_button()
{
	 Object[] input8=new Object[1];
     input8[0]="(//*[@type='submit'])[2]";
     Hashtable<String,Object> output8=SeleniumOperations.clickOnElement(input8);
     HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(), "user click on Login button", output8.get("MESSAGE").toString());
}

@Then("application shows login successfully")
public void application_shows_login_successfully() {
	Object [] input9 = new Object[2];
	input9[0] = "Personal Information";
	input9[1] = "//*[text()=\"Personal Information\"]";
	Hashtable<String,Object>output9 =SeleniumOperations.ValidationbyGetText(input9 );
	HTMLReportGenerator.StepDetails(output9.get("STATUS").toString(), "application shows login successfully", output9.get("MESSAGE").toString());
}

}
