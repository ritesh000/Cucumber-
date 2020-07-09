package com.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefination {
	
	public static WebDriver driver ;
	@Given("i navigated to java page")
	public void i_navigated_to_java_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/rites/Desktop/chrome83/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.javatpoint.com");
	Thread.sleep(3000);
	driver.findElement(By.linkText("Java")).click();;
	Thread.sleep(3000);
	}

	@When("i click oops link")
	public void i_click_oops_link() throws InterruptedException {
		driver.findElement(By.linkText("Java OOPs Concepts")).click();
		Thread.sleep(4000);
		driver.findElement(By.linkText("Object and Class")).click();
		Thread.sleep(3000);
	}

	@Then("i navigate to collection")
	public void i_navigate_to_collection() throws InterruptedException {
		
		driver.findElement(By.xpath("//span[contains(text(),'Java Collection')]")).click();
		Thread.sleep(3000);
		driver.quit();
	}
	
	@Given("i navigated to SQL page")
	public void i_navigated_to_SQL_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/rites/Desktop/chrome83/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.w3schools.com");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Learn HTML")).click();;
		Thread.sleep(3000);
	}

	@When("i click join link")
	public void i_click_join_link() throws InterruptedException {
	   driver.findElement(By.linkText("SQL")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//a[contains(text(),'SQL Joins')]")).click();
	   Thread.sleep(3000);
	   driver.quit();
	}

	
}
