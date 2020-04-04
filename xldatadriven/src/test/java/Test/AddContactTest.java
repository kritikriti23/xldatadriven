package Test;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import page.AddContact;
import page.Homepage;
import page.LoginPage;
import util.BrowserFactory;
import util.Xls_Reader;

public class AddContactTest {


	Xls_Reader reader=new Xls_Reader("/Users/kritidhungel/eclipse-workspace/xldatadriven/Data/fall2018java.xlsx");
	
String email=reader.getCellData("Sheet1", "email", 2);
String password=reader.getCellData("sheet1", "password", 2);		
String Name=reader.getCellData("sheet1", "Name", 2);			
String Company=reader.getCellData("sheet1", "Company", 2);			
String Email=reader.getCellData("sheet1", "Email", 2);			
String Phone=reader.getCellData("sheet1", "Phone", 2);				
String Address=reader.getCellData("sheet1", "Address", 2);				
String City=reader.getCellData("sheet1", "City", 2);				
String State=reader.getCellData("sheet1", "State", 2);			
String Zip=reader.getCellData("sheet1", "Zip", 2);	



@Test
public void AddingContact() throws InterruptedException {
	

		
	WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login/");

	
	LoginPage logintotechfios= PageFactory.initElements(driver, LoginPage.class);

	
	logintotechfios.Login(email,password);
	

Homepage home= PageFactory.initElements(driver, Homepage.class);
home.NavigateToAddContact();



Thread.sleep(2000);

AddContact contact=PageFactory.initElements(driver, AddContact.class);

Thread.sleep(5000);

contact.FillingUpAddressForm("name", "company", "email", "phone", "address", "city", "state", "zip");
AddContact.clickSubmitButton();
driver.close();
driver.quit();

}

}