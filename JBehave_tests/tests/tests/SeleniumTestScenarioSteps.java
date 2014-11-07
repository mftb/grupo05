package tests;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
             
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTestScenarioSteps {

	public WebDriver driver;
	
		@Given("the Chosen Website is <URL>")
		public void chooseWebsite(@Named("URL") String website) {
			driver = new FirefoxDriver();
			//driver.navigate().to(website);
			driver.get(website);
		}
		
		@When("the user clicks <elemName>")
		public void clickElem(@Named("elemName") String elemName) {
			driver.findElement(By.linkText(elemName)).click();
		}
		
	    @Then("the pageTitle should be <someTitle>")
	    public void checkPageTitle(@Named("someTitle") String CorrectTitle) {
	        assertThat(driver.getTitle(), is(CorrectTitle));
	    }
}
