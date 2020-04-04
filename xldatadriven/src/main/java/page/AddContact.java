package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddContact{

	WebDriver driver;

	public AddContact(WebDriver ldriver) {
		this.driver=ldriver;
	}
@FindBy(how=How.ID,using="account")
WebElement fullname;

@FindBy(how=How.ID,using="company")
WebElement CompanyName;

@FindBy(how=How.ID,using="email")
WebElement Email;

@FindBy(how=How.ID,using="phone")
WebElement Phone;

@FindBy(how=How.ID,using="address")
WebElement Address;

@FindBy(how=How.ID,using="city")
WebElement City;

@FindBy(how=How.ID,using="state")
WebElement State;

@FindBy(how=How.ID,using="zip")
WebElement ZipCode;

@FindBy(how=How.ID,using="submit")
WebElement submitbutton;

public void FillingUpAddressForm(String FName,String CName,String email,String phone,String address,String city,String state,String zipcode){
	
	fullname.sendKeys(FName);
	
	CompanyName.sendKeys(CName);
	
	Email.sendKeys(email);
	
	Phone.sendKeys(phone);
	
	Address.sendKeys(address);
	
	City.sendKeys(city);
	State.sendKeys(state);
	ZipCode.sendKeys(zipcode);
	submitbutton.click();
}

public static void clickSubmitButton() {
	// TODO Auto-generated method stub
	
}
}