package PersonSide.Person.testCase.Delete;
import org.testng.annotations.Test;
import Config.BeforeAction;
import Establishment.Login.pageObject.LoginPage;
import Establishment.Login.testCase.CsvReader;
import PersonSide.Person.pageObject.PersonPage;
import org.testng.annotations.BeforeMethod;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TestCase_DeletePerson_Wrong_Some {
	WebDriver driver;
  @Test
  public void f() throws IOException, InterruptedException {
	//login
	  LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
	  CsvReader LoginData = new CsvReader();
	  loginPage.login(LoginData.LoginFileCorrectWhitNumber());
	  
	//Delete Some Person Correct
	  String title = "0012";
	  PersonPage personPage = PageFactory.initElements(driver, PersonPage.class);
	  personPage.ListPerson();
	  personPage.SearchPerson(title);
	  personPage.DeletePersonSome();
	  
	//Assertion
	  String alert = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/main/div/div/div/div[2]")).getText();
	  Assert.assertEquals(alert,"برای شخص 0012 در سیستم، در قسمت مدیریت اسناد، سند ثبت شده است. لطفا جهت حذف ابتدا تمامی اسناد مربوط به این شخص را حذف نمایید.");
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
