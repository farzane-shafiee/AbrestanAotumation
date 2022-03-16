package PersonSide.PersonGroup.testCase.Sreach;
import org.testng.annotations.Test;
import Config.BeforeAction;
import Establishment.Login.pageObject.LoginPage;
import Establishment.Login.testCase.CsvReader;
import PersonSide.PersonGroup.pageObject.PersonGroupPage;
import PersonSide.PersonGroup.testCase.CsvReaderPersonGroup;
import org.testng.annotations.BeforeMethod;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TestCase_SreachPersonGroup {
	WebDriver driver;
  @Test
  public void f() throws IOException {
	//login
	  LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
	  CsvReader LoginData = new CsvReader();
	  loginPage.login(LoginData.LoginFileCorrectWhitNumber());
	  
	//Delete Person Group Correct
	  //String title = "0001";
	  CsvReaderPersonGroup DataPersonGroup = new CsvReaderPersonGroup();
	  PersonGroupPage personGroupPage = PageFactory.initElements(driver, PersonGroupPage.class);
	  personGroupPage.ListPersonGroup();
	  personGroupPage.SearchPersonGroup_CSV(DataPersonGroup.SearchPersonGroup());
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
