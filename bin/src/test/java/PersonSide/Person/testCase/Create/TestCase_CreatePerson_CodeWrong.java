package PersonSide.Person.testCase.Create;
import org.testng.annotations.Test;
import Config.BeforeAction;
import Establishment.Login.pageObject.LoginPage;
import Establishment.Login.testCase.CsvReader;
import PersonSide.Person.pageObject.PersonPage;
import PersonSide.Person.testCase.CsvReaderPerson;
import org.testng.annotations.BeforeMethod;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TestCase_CreatePerson_CodeWrong {
	WebDriver driver;
  @Test
  public void f() throws IOException, InterruptedException {
	//Login
	  LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
	  CsvReader LoginData = new CsvReader();
	  loginPage.login(LoginData.LoginFileCorrectWhitNumber());
	  
	//Create Person Correct with icon
	  CsvReaderPerson dataPerson = new CsvReaderPerson();
	  PersonPage personPage = PageFactory.initElements(driver, PersonPage.class);
	  personPage.CreatePerson_WithButton();
	  personPage.CreatePersonMandatory(dataPerson.CreatePerson_CodeWrong());
	  
	//Assertion
	  WebElement assertion = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/main/div/div/div/div[2]"));
	  Assert.assertEquals("https://kasb.abrestan.com/persons/create",driver.getCurrentUrl());
	  Assert.assertEquals(assertion.getText(),"این کد قبلا در سیستم ثبت شده است.");
  }
  @BeforeMethod
  public void beforeMethod() throws IOException {
	  BeforeAction beforeAction = PageFactory.initElements(driver, BeforeAction.class);
	  this.driver = beforeAction.Beforeaction(driver);
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
