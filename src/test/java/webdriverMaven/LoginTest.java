package webdriverMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	public static WebDriver driver;

	@BeforeSuite
	public void setUp() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test
	public void doLogin() {

		driver.get("https://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("sks102it");

		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).perform();

	}

	@AfterSuite
	public void tearDown() {
		driver.quit();

	}
}
