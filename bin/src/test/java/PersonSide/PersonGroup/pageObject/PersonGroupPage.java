package PersonSide.PersonGroup.pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonGroupPage {
	WebDriver driver;
	Actions action;
	@FindBy(xpath="//*[@id=\"notice_preview_body\"]/div/button") WebElement btnPopup;
	@FindBy(xpath="//*[@id=\"sidebar\"]/ul/li[2]/a/span") WebElement Person;
	@FindBy(id="pgname") WebElement namePersonGroup;
	@FindBy(id="description") WebElement description;
	
	public PersonGroupPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		action = new Actions(driver);
	}
	
	//Show List Person
	public void ListPersonGroup() {
		Person.click();
		driver.findElement(By.linkText("گروه اشخاص")).click();
	}
	
	//Create Person Group_WithIcon
	public void CreatePersonGroup_WithIcon() {
		//driver.findElement(By.xpath("//*[@id=\"notice_preview_body\"]/div/button")).click();/////////////////////////
		Person.click();
		driver.findElement(By.xpath("//*[@id=\"ui-person\"]/ul/li[2]/a[2]/img")).click();
	}
	
	//Create Person Group_WithButton
	public void CreatePersonGroup_WithButton() throws InterruptedException {
		Person.click();
		driver.findElement(By.linkText("گروه اشخاص")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body > div.page-container > div > div.content-wrapper > main > div.col-lg-12.col-sm-12.col-xs-12.pull-left.m-b > div > div > div.panel-body > div > div.row.m-b > div > button")).click();
	}
	
	//Create Person Group
	public void CreatePersonGroup(List<String[]> list) throws InterruptedException {
		WebElement code = driver.findElement(By.id("code"));
		WebElement namePersonGroup = driver.findElement(By.id("pgname"));
		WebElement description = driver.findElement(By.id("description"));
		WebElement btnCreate = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/main/div/div/div/div[2]/form/div[2]/div/button[2]"));
		
		code.click();
		code.clear();
		code.sendKeys(list.get(0));
		namePersonGroup.click();
		namePersonGroup.sendKeys(list.get(1));
		description.click();
		description.sendKeys(list.get(2));
		Thread.sleep(1000);
		btnCreate.click();
	}
	
	//Delete Person Group
	public void DeletePersonGroup() {
		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr/td[5]/button[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/button[2]")).click();
	}
	
	//Search Person Group
	public void SearchPersonGroup(String title) {
		WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"example_filter\"]/label/input"));
		searchBox.click();
		searchBox.sendKeys(title);
	}
	
	//Search Person Group_CSV
	public void SearchPersonGroup_CSV(List<String[]> list) {
		WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"example_filter\"]/label/input"));
		for (int i = 0 ; i < list.size() ; i++) {
			searchBox.clear();
			searchBox.click();
			searchBox.sendKeys(list.get(i));
		}
	}
	
	//Edit Person Group
	public void EditPersonGroup(List<String[]> list) {
		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr/td[5]/button[2]")).click();
		namePersonGroup.clear();
		namePersonGroup.click();
		namePersonGroup.sendKeys(list.get(0));
		
		description.clear();
		description.click();
		description.sendKeys(list.get(1));
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/main/div/div/div/div[2]/form/div[2]/div/button[1]")).click();
	}
}
