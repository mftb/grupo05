package me.ederign.selenium;

import org.jbehave.core.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class UploadViewSteps{
	WebDriver driver;
	
	@Given("a file to be uploaded")
	@Pending
	public void givenAFileToBeUploaded(){
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("file:///home/cc2012/ra139270/Downloads/Tela%20upload/upload.html?path=#");
	}
	
	@Given("that the 'Browse' button is clicked and $file is chosen")
	@Pending
	public void whenTheBrowseButtonIsClicked(String file){
		driver.findElement(By.name("path")).sendKeys(file); 
	}
	
	@Given("that is a valid file")
	@Pending
	public void givenThatIsAValidFile(){
		 //TODO 
	}
	
	@When("the 'Submeter' button is clicked")
	@Pending
	public void whenTheSubmeterButtonIsClicked(){
		driver.findElement(By.cssSelector(".main > form:nth-child(5) > input:nth-child(4)")).click();
	}

	@Then("the file is uploaded ")
	@Pending
	public void thenTheFileIsUploaded(){
		//ensureThat(stock.getStatus().name(), equalTo(status));
	}
}