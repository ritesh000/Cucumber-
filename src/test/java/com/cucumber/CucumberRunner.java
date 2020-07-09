package com.cucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resource", plugin = { "pretty", "html:target/site/cucumber-pretty",
"json:target/cucumber.json" })
public class CucumberRunner {

}
