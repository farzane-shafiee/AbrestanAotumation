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

public class CreateGoods_NameEmpty {
	WebDriver driver;
  @Test
  public void f() throws IOException {
	//Login
	  LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
	  CsvReader LoginData = new CsvReader();
	  loginPage.login(LoginData.LoginFileCorrectWhitNumber());
	  
	//Create Goods Name Empty with Button
	  CsvReaderGoods dataGoods = new CsvReaderGoods();
	  GoodsPage goodsPage = PageFactory.initElements(driver, GoodsPage.class);
	  goodsPage.CreateGoods_WithButton();
	  goodsPage.CreateGoodsMandatory(dataGoods.CreateGoods_NameEmpty());
	  
	//Assertion
	  WebElement assertion = driver.findElement(By.id("E_product_name"));
	  Assert.assertEquals("https://kasb.abrestan.com/persons/create",driver.getCurrentUrl());
	  Assert.assertEquals(assertion.getText(),"لطفا نام کالا/خدمات را وارد نمایید");
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
