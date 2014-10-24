package me.ederign.selenium;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class CnnSample {

	
	@Test
	public void apucaranaWeather(){
		WebDriver driver = new HtmlUnitDriver();
		driver.get("http://cnn.com");
		WebElement weatherComponent = driver.
				findElement(By.id("weatherLoc"));
		weatherComponent.clear();
		weatherComponent.sendKeys("Apucarana Brazil");
	
		WebElement goBT = driver.findElement
				(By.id("weatherLocBtn"));
		goBT.click();
		
		String hiTemp = driver.findElement(By.id("pmHiTemp")).getText();
		System.out.println("Hi temp: " + hiTemp);
		
	}
}

