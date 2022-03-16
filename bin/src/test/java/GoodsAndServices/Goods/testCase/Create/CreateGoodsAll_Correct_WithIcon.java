package GoodsAndServices.Goods.testCase.Create;

import org.testng.annotations.Test;
import Config.BeforeAction;
import Establishment.Login.pageObject.LoginPage;
import Establishment.Login.testCase.CsvReader;
import GoodsAndServices.Goods.pageObject.GoodsPage;
import GoodsAndServices.Goods.testCase.CsvReaderGoods;
import org.testng.annotations.BeforeMethod;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class CreateGoodsAll_Correct_WithIcon {
	WebDriver driver;
  @Test
  public void f() throws IOException {
	//Login
	  LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
	  CsvReader LoginData = new CsvReader();
	  loginPage.login(LoginData.LoginFileCorrectWhitNumber());
	  
	//Create Goods Correct with icon
	  CsvReaderGoods dataGoods = new CsvReaderGoods();
	  GoodsPage goodsPage = PageFactory.initElements(driver, GoodsPage.class);
	  goodsPage.CreateGoods_WithIcon();
	  goodsPage.CreateGoodsAll(dataGoods.CreateGoodsAll_Correct());
	  
	//Assertion
	  WebElement assertion = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/main/div[1]/div/div/div[2]"));
	  Assert.assertEquals("https://kasb.abrestan.com/persons/create",driver.getCurrentUrl());
	  Assert.assertEquals(assertion.getText(),"محصول به درستی ایجاد شده است.");	  
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
