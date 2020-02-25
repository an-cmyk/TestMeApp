package skeleton;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RunTestmeDemo {
	
	WebDriver driver;
	@Given("online Testmeapp should be  open")
	public void online_Testmeapp_should_be_open() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Anup\\chromedriver_win32 (2)\\chromedriver.exe");
		 driver =new ChromeDriver();
	   
	}

	@When("user provide valid login username and password")
	public void user_provide_valid_login_username_and_password() {
		driver.navigate().to("https://10.232.237.143/TestMeApp/fetchcat.htm");
	    driver.findElement(By.linkText("SignIn")).click();
	    driver.findElement(By.name("userName")).sendKeys("Lalitha");
	    driver.findElement(By.name("password")).sendKeys("Password123");
	    driver.findElement(By.name("Login")).click();
	}

	@Then("user should be able to go to next page")
	public void user_should_be_able_to_go_to_next_page() {
		String msg=driver.findElement(By.cssSelector("ul.nav")).getText();
	    String msg2="Hi, Lalitha";
	   Assert.assertTrue(msg.contains(msg2));
	    driver.findElement(By.linkText("SignOut")).click();
	}
	

	@Given("online Testmeapp open")
	public void online_Testmeapp_open() {
		System.setProperty("webdriver.chrome.driver","C:\\Anup\\chromedriver_win32 (2)\\chromedriver.exe");
		 driver =new ChromeDriver();
	   
	}

	@When("user provide invalid login credentials")
	public void user_provide_invalid_login_credentials() {
		driver.navigate().to("https://10.232.237.143/TestMeApp/fetchcat.htm");
	    driver.findElement(By.linkText("SignIn")).click();
	    driver.findElement(By.name("userName")).sendKeys("Kinchin");
	    driver.findElement(By.name("password")).sendKeys("Kalyani");
	    driver.findElement(By.name("Login")).click();
	}

	@Then("user should get an error message")
	public void user_should_get_an_error_message() {
	    System.out.println("Invalid Username and Password");
	}

	@Given("online Testmeapp is on")
	public void online_Testmeapp_is_on() {
		System.setProperty("webdriver.chrome.driver","C:\\Anup\\chromedriver_win32 (2)\\chromedriver.exe");
		 driver =new ChromeDriver();
	}

	@When("user  provide blank  login credentials")
	public void user_provide_blank_login_credentials() {
		driver.navigate().to("https://10.232.237.143/TestMeApp/fetchcat.htm");
	    driver.findElement(By.linkText("SignIn")).click();
		
		driver.findElement(By.name("Login")).click();
	}
	
	@Then("user should get an blank error message")
	public void user_should_get_an_blank_error_message() {
		  System.out.println("Invalid Username and Password");
	  	}





}
