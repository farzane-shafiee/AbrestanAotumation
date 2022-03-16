package PersonSide.Person.pageObject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PersonPage {
	WebDriver driver;
	Actions action;
	@FindBy(xpath="//*[@id=\"sidebar\"]/ul/li[2]/a/span") WebElement sidebar;
	@FindBy(id="code") WebElement code;
	@FindBy(id="username") WebElement username;
	@FindBy(xpath="/html/body/div[2]/div/div[2]/main/div/div/div/div[2]/form/div[2]/div[2]/div/button/span[1]") WebElement person_type;
	@FindBy(id="persone-autocomplete") WebElement person_prefix;
	@FindBy(id="firsname") WebElement first_name;
	@FindBy(id="lname") WebElement last_name;
	@FindBy(id="display_name") WebElement display_name;
	@FindBy(xpath="/html/body/div[2]/div/div[2]/main/div/div/div/div[2]/form/div[10]/div/button[2]") WebElement save_Person;
	@FindBy(xpath="//*[@id=\"example\"]/tbody/tr") WebElement ResultSearch;
	@FindBy(xpath="/html/body/div[2]/div/div[2]/main/div[1]/div/div/div[2]/div[1]/div/button[1]") WebElement BtnEditPerson;
	@FindBy(linkText="اشخاص") WebElement Person;
	@FindBy(xpath="//*[@id=\\\"ui-person\\\"]/ul/li[1]/a[2]/img") WebElement IconAddPerson;
	@FindBy(xpath="/html/body/div[2]/div/div[2]/main/div[1]/div/div/div[2]/div/div[1]/div/button[1]") WebElement BtnAddPerson;
	
	public PersonPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
		action = new Actions(driver);
	}
	
	//List Person
	public void ListPerson() {
		sidebar.click();
		Person.click();
	}
	
	//Create Person_WithIcon
	public void CreatePerson_WithIcon() {
		sidebar.click();
		IconAddPerson.click();
	}
	
	//Create Person_WithButton
	public void CreatePerson_WithButton() throws InterruptedException {
		sidebar.click();
		Person.click();
		Thread.sleep(1000);
		BtnAddPerson.click();
	}
	//Create Person Mandatory
	public void CreatePersonMandatory(List<String[]> list) throws InterruptedException {
		username.click();
		username.sendKeys(list.get(0));
		code.click();
		code.clear();
		code.sendKeys(list.get(1));
		person_type.click();
		Thread.sleep(1000);
		WebElement person_type_selected = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/main/div/div/div/div[2]/form/div[2]/div[2]/div/div/ul/li[1]"));
		person_type_selected.click();
		
//		person_prefix.click();
//		Thread.sleep(1000);
//		WebElement person_prefix_selected = driver.findElement(By.xpath("/html/body/ul[1]/li[1]"));
//		person_prefix_selected.click();
		
		action
		.moveToElement(person_prefix).click()
		.sendKeys(list.get(2))
		.moveToElement(first_name).click()
		.sendKeys(list.get(3))
		.moveToElement(last_name).click()
		.sendKeys(list.get(4))
		.moveToElement(display_name).click()
		.sendKeys(list.get(5)).perform();
	
//		Thread.sleep(1000);
//		WebElement display_name_selected = driver.findElement(By.xpath("/html/body/ul[3]/li[1]"));
//		display_name_selected.click();
		save_Person.click();
	}
	
	//Create Person All
	public void CreatePersonAll(List<String[]> list) throws InterruptedException {
		
		WebElement national_barcode = driver.findElement(By.id("natinoal_bar_code"));
		WebElement economic_code = driver.findElement(By.id("economic_code"));
		WebElement group = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/main/div/div/div/div[2]/form/div[3]/div[2]/div/button/span[1]"));
		WebElement registration_code = driver.findElement(By.id("registration_code"));
		WebElement bank_account = driver.findElement(By.id("bank_account"));
		WebElement price_lists = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/main/div/div/div/div[2]/form/div[4]/div[1]/div/button"));
		WebElement is_visitor = driver.findElement(By.id("is_visitor"));
		WebElement visitor_commission = driver.findElement(By.id("visitor_commission"));
		
		WebElement mobile = driver.findElement(By.xpath("//*[@id=\"mobile\"]"));//برای موبایل خطا دارد
		WebElement email = driver.findElement(By.xpath("//*[@id=\"person_email\"]"));
		WebElement debt_ceiling = driver.findElement(By.xpath("//*[@id=\"debt_ceiling\"]"));
		WebElement debt_state = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/main/div/div/div/div[2]/form/div[6]/div[3]/div[3]/div/button/span[1]"));
		//*[@id="person_type_2"]/div[3]/div[3]/div/button/span[1]
		WebElement state = driver.findElement(By.id("state"));
		WebElement city = driver.findElement(By.id("city"));
		WebElement postal_code = driver.findElement(By.id("postal_code"));
		WebElement address = driver.findElement(By.id("Address"));
		WebElement phone = driver.findElement(By.id("tel"));
		WebElement fax = driver.findElement(By.id("fax"));
		WebElement website = driver.findElement(By.id("website"));
		WebElement notes = driver.findElement(By.id("notes"));
		
		username.click();
		username.sendKeys(list.get(0));
		Thread.sleep(1000);
		
		action
			.moveToElement(national_barcode).click()
			.sendKeys(list.get(1))
			.moveToElement(economic_code).click()
			.sendKeys(list.get(2)).perform();
		
		person_type.click();
		Thread.sleep(1000);
		WebElement person_type_selected = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/main/div/div/div/div[2]/form/div[2]/div[2]/div/div/ul/li[1]"));
		person_type_selected.click();
		
		action
			.moveToElement(registration_code).click()
			.sendKeys(list.get(4))
			.moveToElement(bank_account).click()
			.sendKeys(list.get(3))
			.moveToElement(is_visitor).click().perform();
		Thread.sleep(1000);
		
		person_prefix.click();
		Thread.sleep(1000);
		WebElement person_prefix_selected = driver.findElement(By.xpath("/html/body/ul[1]/li[1]"));
		person_prefix_selected.click();
		
		Thread.sleep(1000);
		action
			.moveToElement(first_name).click()
			.sendKeys(list.get(5))
			.moveToElement(last_name).click()
			.sendKeys(list.get(6))
			.moveToElement(display_name).click().perform();
		
		Thread.sleep(1000);
		WebElement display_name_selected = driver.findElement(By.xpath("/html/body/ul[3]/li[1]"));
		display_name_selected.click();
		
		Thread.sleep(1000);
		action
			.moveToElement(mobile).click()
			.sendKeys(list.get(7))
			.moveToElement(email).click()
			.sendKeys(list.get(8))
			.moveToElement(debt_ceiling).click()
			.sendKeys(list.get(9)).perform();
		
		debt_state.click();
//		Thread.sleep(1000);
//		WebElement debt_state_selected = driver.findElement(By.xpath("//*[@id=\"person_type_2\"]/div[3]/div[3]/div/div/ul/li[2]/a"));
//		debt_state_selected.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 100);
		By selectElementSelector = By.xpath("/html/body/div[2]/div/div[2]/main/div/div/div/div[2]/form/div[6]/div[3]/div[3]/div/select");
		WebElement debt_state_selected = wait.until(ExpectedConditions.presenceOfElementLocated(selectElementSelector));
		Select dropdown = new Select (debt_state_selected);
		dropdown.selectByValue("2");
		
		action
		.moveToElement(state).click()
		.sendKeys(list.get(10))
		.moveToElement(city).click()
		.sendKeys(list.get(11))
		.moveToElement(postal_code).click()
		.sendKeys(list.get(12))
		.moveToElement(address).click()
		.sendKeys(list.get(13))
		.moveToElement(phone).click()
		.sendKeys(list.get(14))
		.moveToElement(fax).click()
		.sendKeys(list.get(15))
		.moveToElement(website).click()
		.sendKeys(list.get(16))
		.moveToElement(notes).click()
		.sendKeys(list.get(17)).perform();
		
		Thread.sleep(1000);
		WebElement save_Person = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/main/div/div/div/div[2]/form/div[10]/div/button[2]"));
		save_Person.click();
	}
	
	//Delete Person Some
	public void DeletePersonSome() {
		driver.findElement(By.name("person_code_check")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/main/div[1]/div/div/div[2]/div/div[1]/div/button[5]")).click();
		driver.findElement(By.id("delete_document_button")).click();
	}
	
	//Delete Person One
	public void DeletePersonOne() {
		ResultSearch.click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/main/div[1]/div/div/div[2]/div[1]/div/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"delete_form\"]/button[2]")).click();
	}
	
	//Search Person
	public void SearchPerson(String title) {
		WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"example_filter\"]/label/input"));
		searchBox.click();
		searchBox.sendKeys(title);
	}
	
	//Search Person_CSV
	public void SearchPerson_CSV(List<String[]> list) {
		WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"example_filter\"]/label/input"));
		for (int i = 0 ; i < list.size() ; i++) {
			searchBox.clear();
			searchBox.click();
			searchBox.sendKeys(list.get(i));
		}
	}
	
	//Edit Person Correct
	public void EditPerson(List<String[]> list) {
		ResultSearch.click();
		BtnEditPerson.click();
		username.click();
		username.clear();
		username.sendKeys(list.get(0));
		
		person_prefix.click();
		person_prefix.clear();
		person_prefix.sendKeys(list.get(1));
		
		first_name.click();
		first_name.clear();
		first_name.sendKeys(list.get(2));
		
		last_name.click();
		last_name.clear();
		last_name.sendKeys(list.get(3));
		
		display_name.click();
		display_name.clear();
		display_name.sendKeys(list.get(4));
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/main/div/div/div/div[2]/form/div[10]/div/button[1]")).click();
	}
}
