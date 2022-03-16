package PersonSide.Person.testCase.Sreach;
import org.testng.annotations.Test;
import Config.BeforeAction;
import Establishment.Login.pageObject.LoginPage;
import Establishment.Login.testCase.CsvReader;
import PersonSide.Person.pageObject.PersonPage;
import PersonSide.Person.testCase.CsvReaderPerson;
import org.testng.annotations.BeforeMethod;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TestCase_SreachPerson {
	WebDriver driver;
  @Test
  public void f() throws IOException {
	//login
	  //sdfsdfsdf987978
	  LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
	  CsvReader LoginData = new CsvReader();
	  loginPage.login(LoginData.LoginFileCorrectWhitNumber());
	  
	//Search Person Correct
	  CsvReaderPerson DataPerson = new CsvReaderPerson();
	  PersonPage personPage = PageFactory.initElements(driver, PersonPage.class);
	  personPage.ListPerson();
	  personPage.SearchPerson_CSV(DataPerson.SearchPerson());
  }
  @BeforeMethod
  public void beforeMethod() throws IOException {
	  BeforeAction beforeAction = PageFactory.initElements(driver, BeforeAction.class);
	  this.driver = beforeAction.Beforeaction(driver);
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  driver.close();
  }
}