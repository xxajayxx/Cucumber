package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyWEB {
	 WebDriver driver;
	@Given("User launches the DemoWebShop App zz")
	public void user_launches_the_DemoWebShop_App_zz() {
		System.setProperty("webdriver.chrome.driver", "C:\\MyDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(60, TimeUnits.SECONDS);
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}

	@Then("User clicks on SignIn button")
	public void user_clicks_on_SignIn_button() {
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
		
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}

	@Then("User provides the valid data for all the fields")
	public void user_provides_the_valid_data_for_all_the_fields() {
		driver.findElement(By.xpath("//*[@id='gender-male']")).click();
		driver.findElement(By.xpath("//*[@id='FirstName']")).sendKeys("Ajay");
		driver.findElement(By.xpath("//*[@id='LastName']")).sendKeys("Singh");
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("manuqwerty123@gmail.com");
		driver.findElement(By.xpath("//*[@id='Password']")).sendKeys("Ajay@22995");
		driver.findElement(By.xpath("//*[@id='ConfirmPassword']")).sendKeys("Ajay@22995");

	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}

	@When("User clicks on Submit button at the end of the form")
	public void user_clicks_on_Submit_button_at_the_end_of_the_form() {
		driver.findElement(By.xpath("//*[@id='register-button']")).click();
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}


	@Then("Verifies the result of the registration")
	public void verifies_the_result_of_the_registration() {
		Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).getText().contains("manuqwerty123@gmail.com"));
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}

	@Then("Prints the message")
	public void prints_the_message() {
		Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]")).getText().contains("registration"));
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		driver.close();
	}

	@Given("Application launched by registered user zz")
	public void application_launched_by_registered_user_zz() {
		System.setProperty("webdriver.chrome.driver", "C:\\MyDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}

	@Then("User access the login Link")
	public void user_access_the_login_Link() {
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}

	@Then("Provides the Valid data as input")
	public void provides_the_Valid_data_as_input() {
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("manuqwerty123@gmail.com");
		driver.findElement(By.xpath("//*[@id='Password']")).sendKeys("Ajay@22995");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}

	@Then("Verifies the login status")
	public void verifies_the_login_status() {
	driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).getText().contains("manuqwerty123@gmail.com");
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}
	



}
