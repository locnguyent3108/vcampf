package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StartUpPage extends AbstractPage {
  WebElement element;
  String locator;

  //--Constructor
  public StartUpPage(WebDriver driver){
    super(driver);
  }

  //--get ELEMENT on page
  public String PageTitleText () {
    locator = "//a[text()='VCAM BF']";
    return driver.findElement ( By.xpath (locator)).getText ();
  }

  public String EmailLabel() {
    locator = "//label[@for='customer_email']";
    return driver.findElement ( By.xpath (  locator ) ).getText ();
  }

  public WebElement emailField () {
    locator = "//input[@type='email']";
    return driver.findElement ( By.xpath ( locator ) );
  }

  public String PassWordLabel() {
    locator = "//label[@for='customer_password']";
    return driver.findElement ( By.xpath ( locator ) ).getText ();
  }

  public WebElement passwordField () {
    locator = "//input[@type='password']";
    return driver.findElement ( By.xpath ( locator ) );
  }

  public String RememberMeLabel () {
    locator = "//label[@for='customer_remember_me']";
    return driver.findElement ( By.xpath ( locator ) ).getText ();
  }
  public WebElement loginButton() {
    locator = "//input[@name='commit' or value='Đăng nhập' or type ='submit']";
    return driver.findElement ( By.xpath ( locator ) );
  }

  public WebElement rememberMeCheckBox() {
    locator = "//input[@id='customer_remember_me']";
    return driver.findElement ( By.xpath ( locator ) );
  }

  public WebElement signUpButton() {
    try {
      locator = "//a[@id='sign-up-btn']/parent::div";
    } catch (Exception e) {
      System.out.println (locator + "doesn't exist");
    }

    return driver.findElement ( By.xpath ( locator ) );
  }







}
