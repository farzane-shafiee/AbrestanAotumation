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

public class TestCase_LoginCorrect_WithGoogle {
	WebDriver driver;
  @Test
  public void f() throws IOException {
	//login
	  LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
	  loginPage.loginWhitGoogle();
	
	//Assertion
	  Assert.assertEquals("https://kasb.abrestan.com/user/dashboard",driver.getCurrentUrl());
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
