package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {

//writing test method	
@Test
public void TechfiosLoginTest(){


//we are going to the browser! 
WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login/");

//we have to call a pagefactory i want to access certain function from the login page therefore pagefactory has to be created
//therefore declared the class name loginpage and object non static function on stact environment. pagefactory is allowing me to access any function of the page
//pagefactory is allowing me to access any funtion from the login page. 
//purpose of using page factory is if i want to got to different pages and stuff 

LoginPage logintotechfios= PageFactory.initElements(driver, LoginPage.class);

logintotechfios.Login("techfiosdemo@gmail.com", "abc123");

driver.close();
driver.quit();



}

}

