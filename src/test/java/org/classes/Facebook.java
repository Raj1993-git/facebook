package org.classes;

import org.baseclass.basefb;

import POM.loginpage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Facebook extends basefb {
loginpage  l=new loginpage();


@Given("Launch the url")
public void launch_the_url() {
   launch("https://www.facebook.com/");}

@When("enter the details")
public void enter_the_details() {
l.getUsername().sendKeys("rajasekarj9@gmail.com");
l.getPassword().sendKeys("Raj@1991");
cl(l.getBtnclick());
}

@Then("expect the result")
public void expect_the_result() {
   System.out.println(hooks.driver.getTitle());
	
   
}

}
