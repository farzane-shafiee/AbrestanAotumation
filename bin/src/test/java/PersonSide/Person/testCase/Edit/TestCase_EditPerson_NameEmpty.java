package PersonSide.Person.testCase.Edit;
import org.testng.annotations.Test;
import Config.BeforeAction;
import Establishment.Login.pageObject.LoginPage;
import Establishment.Login.testCase.CsvReader;
import PersonSide.Person.pageObject.PersonPage;
import PersonSide.Person.testCase.CsvReaderPerson;
import PersonSide.PersonGroup.pageObject.PersonGroupPage;
import PersonSide.PersonGroup.testCase.CsvReaderPersonGroup;
import org.testng.annotations.BeforeMethod;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TestCase_EditPerson_NameEmpty {
	WebDriver driver;
  @Test
  public void f() throws IOException {
	//login
	  LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
	  CsvReader LoginData = new CsvReader();
	  loginPage.login(LoginData.LoginFileCorrectWhitNumber());
	  
	//Edit Person Name Empty
	  String title = "0012";
	  CsvReaderPerson DataPerson = new CsvReaderPerson();
	  PersonPage personPage = PageFactory.initElements(driver, PersonPage.class);
	  personPage.ListPerson();
	  personPage.SearchPerson(title);
	  personPage.EditPerson(DataPerson.EditPerson_NameEmpty());
	  
	//Assertion
	  String alert = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/main/div/div/div/div[2]")).getText();
	  Assert.assertEquals(alert,"نام الزامی می‌باشد.");
  }
  @BeforeMethod
  public void beforeMethod() throws IOException {
	  BeforeAction beforeAction = PageFactory.initElements(driver, BeforeAction.class);
	  this.driver = beforeAction.Beforeaction(driver);
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(2000);
	  //driver.close();
  }

}
