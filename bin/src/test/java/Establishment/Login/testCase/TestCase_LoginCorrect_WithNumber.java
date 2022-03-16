package Establishment.Login.testCase;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Config.BeforeAction;
import Establishment.Login.pageObject.LoginPage;

public class TestCase_LoginCorrect_WithNumber {
	WebDriver driver;
  @Test
  public void f() throws IOException {
	//login
	  LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
	  CsvReader LoginData = new CsvReader();
	  loginPage.login(LoginData.LoginFileCorrectWhitNumber());
	
	//Assertion
	  Assert.assertEquals("http://betakasb.abrestan.com/user/dashboard",driver.getCurrentUrl());
  }
  
  @BeforeMethod
  public void beforeMethod() throws IOException {
	  //WebDriverManager.chromedriver().setup();
	  BeforeAction beforeAction = PageFactory.initElements(driver, BeforeAction.class);
	  this.driver = beforeAction.Beforeaction(driver);
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.close();
  }

}
