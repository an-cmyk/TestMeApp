package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Casestudy4 {
	WebDriver driver;
	
	
	
	@Given("TestMeApp is opened with valid login and password")
	public void testmeapp_is_opened_with_valid_login_and_password() {
		System.setProperty("webdriver.chrome.driver","C:\\Anup\\chromedriver_win32 (2)\\chromedriver.exe");
		 driver =new ChromeDriver();
		 driver.navigate().to("https://10.232.237.143/TestMeApp/fetchcat.htm");
		    driver.findElement(By.linkText("SignIn")).click();
		    driver.findElement(By.name("userName")).sendKeys("Lalitha");
		    driver.findElement(By.name("password")).sendKeys("Password123");
		    driver.findElement(By.name("Login")).click();
	}

	@When("search the product and go to the cart")
	public void search_the_product_and_go_to_the_cart() {
		WebElement search = driver.findElement(By.xpath("//*[contains(@name,'products')]"));
		   search.sendKeys("h");
		   search.sendKeys("e");
		   search.sendKeys("a");
		   search.sendKeys("d");
		   Actions act1 =new Actions(driver);
		   act1.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Headphone')]"))).build().perform();
		   driver.findElement(By.xpath("//*[@id=\"myInputautocomplete-list\"]")).click();
		   driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}

	@Then("Finding the product in cart")
	public void finding_the_product_in_cart() {
		  String msg=driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]")).getText();
		    String msg1="cart";
		    Assert.assertFalse(msg.contains(msg1));
		    System.out.println("Selection of item must be done");
		    driver.close();
	}



}
