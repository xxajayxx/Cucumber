package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Testmeapp {
	WebDriver driver ;
	
	@Given("the link to app is available")
public void the_link_to_app_is_available() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_d2.03.07\\Desktop\\chromedriver.exe");
		driver =new ChromeDriver();
		
    // Write code here that turns the phrase above into concrete actions
//    throw new cucumber.api.PendingException();
}

@Given("the app is Launched")
public void the_app_is_Launched() {
	driver =new ChromeDriver();
	driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	
	
	
    // Write code here that turns the phrase above into concrete actions
//    throw new cucumber.api.PendingException();
}






@Given("the app is up and running")
public void the_app_is_up_and_running() {
    // Write code here that turns the phrase above into concrete actions
//    throw new cucumber.api.PendingException();
}

@Then("Click on login button")
public void click_on_login_button() {
	driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	
	
    // Write code here that turns the phrase above into concrete actions
//    throw new cucumber.api.PendingException();
}

@Then("the username is entered {string}")
public void the_username_is_entered(String string) {
	driver.findElement(By.xpath("//*[@id='userName']")).sendKeys(string);
	
	
	
    // Write code here that turns the phrase above into concrete actions
//    throw new cucumber.api.PendingException();
}

@Then("the password is entered {string}")
public void the_password_is_entered(String string) {
	driver.findElement(By.xpath("//*[@id='password']")).sendKeys(string);
    // Write code here that turns the phrase above into concrete actions
//    throw new cucumber.api.PendingException();
}

@Then("the login button is clicked")
public void the_login_button_is_clicked() {
	driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
    // Write code here that turns the phrase above into concrete actions
//    throw new cucumber.api.PendingException();
}
     






@Given("the user is at homepage and logged in")
public void the_user_is_at_homepage_and_logged_in() {

//	Assert.assertTrue(driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/ul/a")).getText().contains("SignOut"));
    // Write code here that turns the phrase above into concrete actions
//    throw new cucumber.api.PendingException();
}

@Then("the user browses the product using the tree")
public void the_user_browses_the_product_using_the_tree() {
	Actions action = new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("//*[@id='menu3']/li[2]/a/span"))).click().build().perform();
	action.moveToElement(driver.findElement(By.xpath("//*[@id='menu3']/li[2]/ul/li[2]/a/span"))).click().build().perform();
	action.moveToElement(driver.findElement(By.xpath("//*[@id='submenuul11292']/li[1]/a/span"))).click().build().perform();
	
    // Write code here that turns the phrase above into concrete actions
//    throw new cucumber.api.PendingException();
}

@Then("selects the product which is to be purchased")
public void selects_the_product_which_is_to_be_purchased() {
	
	driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
    // Write code here that turns the phrase above into concrete actions
//    throw new cucumber.api.PendingException();
}

@When("at the cart page")
public void at_the_cart_page() {
	driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@Then("add the product to the cart")
public void add_the_product_to_the_cart() {
	driver.findElement(By.xpath("/html/body/header/div/b/a[1]")).click();
    // Write code here that turns the phrase above into concrete actions

	//    throw new cucumber.api.PendingException();
}








@Given("the user is at home page and logged in")
public void the_user_is_at_home_page_and_logged_in() {
//	Assert.assertTrue(driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/ul/a")).getText().contains("SignOut"));

    // Write code here that turns the phrase above into concrete actions
//    throw new cucumber.api.PendingException();
}

@Then("the user clicks on the cart")
public void the_user_clicks_on_the_cart() {
	driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/ul/a[1]")).click();
	
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}

@Then("removes the product")
public void removes_the_product() {
	driver.findElement(By.xpath("//*[@id='cart']/tbody/tr/td[5]/form/input[2]")).click();
	driver.close();
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}

}
