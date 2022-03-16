package GoodsAndServices.Goods.pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoodsPage {
	WebDriver driver;
	Actions action;
	@FindBy(xpath="//*[@id=\"sidebar\"]/ul/li[3]/a/span") WebElement Sidebar;
	@FindBy(linkText="کالا / خدمات") WebElement GoodsAndServices;
	@FindBy(xpath="//*[@id=\"ui-commodity\"]/ul/li[1]/a[2]/img") WebElement IconAddGoodsAndServices;
	@FindBy(xpath="//*[@id=\"همه\"]/div[1]/div/button[1]") WebElement BtnAddGoodsAndServices;
	
	@FindBy(id="code") WebElement Code;
	@FindBy(id="barcode") WebElement Barcode;
	@FindBy(id="product_name") WebElement ProductName;
	@FindBy(id="product_group") WebElement ProductGroup;
	@FindBy(id="latin_name") WebElement LatinName;
	@FindBy(id="order_point") WebElement OrderPoint;
	@FindBy(xpath="//*[@id=\"add_product_form\"]/div[3]/div/div[1]/button") WebElement MainUnit;
	@FindBy(id="buy_price") WebElement BuyPrice;
	@FindBy(id="buy_description") WebElement BuyDescription;
	@FindBy(id="sale_price") WebElement SalePrice;
	@FindBy(id="sale_description") WebElement SaleDescription;
	@FindBy(id="product_description") WebElement ProductDescription;
	@FindBy(id="builder") WebElement Builder;
	@FindBy(id="model") WebElement model;
	@FindBy(id="initial_balance") WebElement InitialBalance;
	@FindBy(xpath="//*[@id=\"کالا\"]/div[4]/div[2]/div/button") WebElement InitialWarehouse;
	@FindBy(id="initial_price") WebElement InitialPrice;
	@FindBy(name="auto_tax") WebElement AutoTax;
	@FindBy(name="auto_complications") WebElement AutoComplications;
	@FindBy(id="salable") WebElement Salable;
	
	@FindBy(xpath="//*[@id=\"example\"]/tbody/tr") WebElement ResultSearch;
	@FindBy(xpath="/html/body/div[2]/div/div[2]/main/div[1]/div/div/div[2]/div[1]/div/button[1]") WebElement BtnEditGood;
	
	public GoodsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
		action = new Actions(driver);
	}
	
	//List Goods
	public void ListGoods() {
		Sidebar.click();
		GoodsAndServices.click();
	}
	
	//Create Goods_WithIcon
	public void CreateGoods_WithIcon() {
		Sidebar.click();
		IconAddGoodsAndServices.click();
	}
	//Create Goods_WithButton
	public void CreateGoods_WithButton() {
		Sidebar.click();
		GoodsAndServices.click();
		BtnAddGoodsAndServices.click();
	}
	
	//Create Goods All
	public void CreateGoodsAll(List<String[]> list) {
		Barcode.click();
		Barcode.sendKeys(list.get(0));
		ProductName.click();
		ProductName.sendKeys(list.get(1));
		ProductGroup.click();
		ProductGroup.sendKeys(list.get(2));
		LatinName.click();
		LatinName.sendKeys(list.get(3));
		OrderPoint.click();
		OrderPoint.sendKeys(list.get(4));
		MainUnit.click();
		MainUnit.sendKeys(list.get(5));
		BuyPrice.click();
		BuyPrice.sendKeys(list.get(6));
		BuyDescription.click();
		BuyDescription.sendKeys(list.get(7));
		SalePrice.click();
		SalePrice.sendKeys(list.get(8));
		SaleDescription.click();
		SaleDescription.sendKeys(list.get(9));
		ProductDescription.click();
		ProductDescription.sendKeys(list.get(10));
		Builder.click();
		Builder.sendKeys(list.get(11));
		model.click();
		model.sendKeys(list.get(12));
		InitialBalance.click();
		InitialBalance.sendKeys(list.get(13));
		InitialWarehouse.click();
		InitialWarehouse.sendKeys(list.get(14));
		InitialPrice.click();
		InitialPrice.sendKeys(list.get(15));
		AutoTax.click();
		AutoComplications.click();
		
		WebElement BtnInsertGoods = driver.findElement(By.id("submitButton"));
		BtnInsertGoods.click();
	}
	
	//Create Goods Mandatory
	public void CreateGoodsMandatory(List<String[]> list) {
		ProductName.click();
		ProductName.sendKeys(list.get(0));
		
		WebElement BtnInsertGoods = driver.findElement(By.id("submitButton"));
		BtnInsertGoods.click();
	}
	
	//Delete Goods Some
	public void DeleteGoodsSome() {
		driver.findElement(By.name("select_all")).click();
		driver.findElement(By.xpath("//*[@id=\"همه\"]/div[1]/div/button[5]")).click();
		driver.findElement(By.id("delete_document_button")).click();
	}
	
	//Delete Goods One
	public void DeleteGoodsOne() {
		ResultSearch.click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/main/div[1]/div/div/div[2]/div[1]/div/button[2]")).click();
		driver.findElement(By.id("delete_document_button")).click();
	}
	
	//Search Good
	public void SearchGood(String title) {
		WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"example_filter\"]/label/input"));
		searchBox.click();
		searchBox.sendKeys(title);
	}
	
	//Search Goods CSV
	public void SearchGoods_CSV(List<String[]> list) {
		WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"example_filter\"]/label/input"));
		for (int i = 0 ; i < list.size() ; i++) {
			searchBox.clear();
			searchBox.click();
			searchBox.sendKeys(list.get(i));
		}		
	}
	
	//Edit Goods
	public void EditGoods(List<String[]> list) {
		ResultSearch.click();
		BtnEditGood.click();
		ProductName.click();
		ProductName.clear();
		ProductName.sendKeys(list.get(0));
		driver.findElement(By.id("submitButton")).click();
	}
}
