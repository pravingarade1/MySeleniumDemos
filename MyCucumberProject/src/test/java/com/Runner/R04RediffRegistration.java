package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/MyCucumberProject/MyCucumberProject/F04RediffRegistration.feature",
				glue="com.StepDef",
				publish=true,
				tags="@AllTests"
		)
public class R04RediffRegistration {
	
	/*
	 Execute Single Scenario		tags = "@Sanity"
	 Execute Multiple Scenarios		tags = "@Sanity or @Regression"
	 Skip Single Scenario			tags = "not @Sanity"
	 Skip Multiple Scenarios		tags = "not @Sanity and not @Regression"
	 Execute All Scenarios			tags = "@AllTests"
	 
	 */

}
