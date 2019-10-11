package org.classes;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\Rajasekar\\Desktop\\number programs\\Overallfacebook\\src\\test\\resources\\faceook.feature",glue = {"org.classes"},monochrome = true,dryRun = false)
public class testrunner {

}
