package me.ederign.selenium;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InfoQHelloWorldCola {

	private int soma(int a, int b) {
		// O Auto-generated method stub
		return a + b;
	}

	@Test
	public void helloWorld() {

		WebDriver driver = new FirefoxDriver();

		driver.navigate().to("file:///home/cc2012/ra139270/Downloads/Tela%20upload/upload.html?path=#");

		//driver.findElement(By.id("keyword")).clear();

		System.out.println("Title:");
		System.out.println(driver.getTitle());
		
		//driver.findElement(By.ByLinkText).click();
		
		//String test = driver.findElement(By.xpath("//button[contains(text(),'Browse...')]")).getText();
		
		//driver.findElement(By.name("path")).click();
		driver.findElement(By.name("path")).sendKeys("/home/cc2012/ra139270/aoInfinitoEALEM"); 
		
		//driver.findElement(By.xpath("//button[contains(.,'Submeter')]")).sendKeys("/home/cc2012/ra139270/aoInfinitoEALEM"); 
		
		//driver.findElement(By.).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector(".main > form:nth-child(5) > input:nth-child(4)")).click();
		
		System.out.println("Subs");
		//System.out.println(test);
		
		//driver.findElement(By.id("keyword")).sendKeys("chico bento");

		//driver.findElement(By.name("Wiki")).click();

		List<WebElement> resultado = driver.findElements(By
				.className("one_result"));

		assertTrue("devem existir elementos", resultado.size() > 0);

		driver.close();
	}

	@Test
	public void test() {
		/*WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://infoq.com/br");
		WebElement keyword = driver.findElement(By.id("keyword"));
		keyword.sendKeys("eder ignatowicz");

		WebElement botao = driver.findElement(By.id("search"));
		botao.submit();

		List<WebElement> findElements = driver.findElements(By
				.className("one_result"));

		assertTrue(findElements.size() > 0);
		clicaNaAba(driver, "data");
		clicaNaAba(driver, "rele");
		// driver.close();*/
	}

	private void clicaNaAba(WebDriver driver, String campo) {
		List<WebElement> findElements;
		findElements = driver.findElements(By.cssSelector(".search_sort li a"));
		for (WebElement webElement : findElements) {
			System.out.println(webElement.getText());

			if (webElement.getText().contains(campo)) {
				webElement.click();
			}
		}
	}

}
