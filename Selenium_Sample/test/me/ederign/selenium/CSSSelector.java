package me.ederign.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSSSelector {
	
	 public static void main(String[] args) {
		 
	        WebDriver driver = new FirefoxDriver();

	        driver.get("file:///Users/ederign/Documents/Dropbox/Talks/Unicamp%20-%20Testes/Selenium/SELENIUM_SAMPLE/index.html");

	        // Find the text input element by its name
	        List<WebElement> element = driver.findElements(By.cssSelector("#intro"));
	        
	        for (WebElement webElement : element) {
				System.out.println(webElement.getText());
			}
	        driver.close();

	    }

}
