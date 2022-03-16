package PersonSide.PersonGroup.testCase.Delete;
import org.testng.annotations.Test;
import Config.BeforeAction;
import Establishment.Login.pageObject.LoginPage;
import Establishment.Login.testCase.CsvReader;
import PersonSide.PersonGroup.pageObject.PersonGroupPage;
import org.testng.annotations.BeforeMethod;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TestCase_DeletePersonGroup_wrong {
	WebDriver driver;
  @Test
  public void f() throws IOException, InterruptedException {
	//login
	  LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
	  CsvReader LoginData = new CsvReader();
	  loginPage.login(LoginData.LoginFileCorrectWhitNumber());
	  
	//Delete Account Group Correct
	  String title = "0001";
	  PersonGroupPage personGroupPage = PageFactory.initElements(driver, PersonGroupPage.class);
	  personGroupPage.ListPersonGroup();
	  personGroupPage.SearchPersonGroup(title);
	  personGroupPage.DeletePersonGroup();
	  
	//Assertion
	  String alert = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/main/div/div/div/div[2]")).getText();
	  Assert.assertEquals(alert,"کاربر گرامی از این گروه اشخاص برای گروه بندی اشخاص استفاده کرده اید و قادر به حذف نمی باشید");
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
