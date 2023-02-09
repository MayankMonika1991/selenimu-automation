package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SauceDemoSteps {
	
	public static WebDriver driver;
	
	@Given("Open the browserURL {string}")
	public void OpenBrowser(String URL) {
		System.out.println("Start - OpenBrowser method ");
		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		System.out.println("End - OpenBrowser method ");
	}
	
	@When("Enter the username {string} & password {string}")
	public void SetUserCreds(String Uname, String Pwd) {
		System.out.println("Start - SetUserCreds method ");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(Uname);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Pwd);
		System.out.println("End - SetUserCreds method ");
	}

	@When("Click on loginButton")
	public void ClickOnLoginBtn() {
		System.out.println("Start - ClickOnLoginBtn method ");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		System.out.println("End - ClickOnLoginBtn method ");
	}
	
	@Then("User successfully logged in")
	public void UserLogin() {
		System.out.println("User logged in successfully");
	}
	
	@And("Close the browser")
	public void ClosingBrowser() {
		driver.close();
	}
}
