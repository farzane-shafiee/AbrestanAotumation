package Establishment.Login.testCase;
import org.testng.annotations.Test;
import Config.BeforeAction;
import Establishment.Login.pageObject.LoginPage;
import org.testng.annotations.BeforeMethod;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TestCase_LoginUsernameCorrect_PasswordWrong_WithEmail {
	WebDriver driver;
  @Test
  public void f() throws IOException {
	//login
	  LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
	  CsvReader LoginData = new CsvReader();
	  loginPage.login(LoginData.LoginFileUsernameCorrect_PasswordWrongWhitEmail());
	  
	//Assertion
	  Assert.assertEquals("http://betakasb.abrestan.com/",driver.getCurrentUrl());
  }
  
  @BeforeMethod
  public void beforeMethod() throws IOException {
	  BeforeAction beforeAction = PageFactory.initElements(driver, BeforeAction.class);
	  this.driver = beforeAction.Beforeaction(driver);
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.close();
  }

}
