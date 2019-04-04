package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InvestorPage extends AbstractPage {
  private String locator;
  public InvestorPage(WebDriver driver) {
    super(driver);
  }
  //--get ELEMENT on page
  public String investorPageTitle () {
    locator = "//h3[text()='Nhà đầu tư']";
    return driver.findElement ( By.xpath ( locator ) ).getText ();
  }

  public String investorLabel () {
    locator = "//label[contains(text(),'Tên nhà đầu tư')]";
    return driver.findElement ( By.xpath ( locator ) ).getText ();
  }

  public WebElement InvestorField ( ) {
    locator = "//input[@id='q_full_name_cont']";
    return driver.findElement ( By.xpath ( locator ) );
  }

  public String emailTextBox () {
    locator = "//label[contains(text(),'Thư điện tử')]";
    return driver.findElement ( By.xpath ( locator ) ).getText ();
  }

  public WebElement emailField ( ) {
    locator = "//input[@id='q_email_cont']";
    return driver.findElement ( By.xpath ( locator ) );
  }

  public String phoneNumberLabel () {
    locator = "//label[@class='control-label tel required']";
    return driver.findElement ( By.xpath ( locator ) ).getText ();
  }

  public WebElement phoneNumberField ( ) {
    locator = "//input[@id='q_mobile_phone_number_cont']";
    return driver.findElement ( By.xpath ( locator ) );
  }

  public String tradingAccountLabel ( ) {
    locator = "http://vievie.vn/vievie-gold-ket-noi-chuyen-gia/";
    return driver.findElement ( By.xpath ( locator ) ).getText ();
  }

  public String tradingAccountField ( ) {
    locator = "//label[contains(text(),'Tài khoản giao dịch')]//following-sibling::input";
    return driver.findElement ( By.xpath ( locator ) ).getText ();
  }

  public String passportLabel ( ) {
    locator = "//label[contains(text(),'/passport/')]";
    return driver.findElement ( By.xpath ( locator ) ).getText ();
  }

  public WebElement passportField ( ) {
    locator = "//label[contains(text(),'/passport/')]/following-sibling::input";
    return driver.findElement ( By.xpath ( locator ) );
  }

  public InvestorPage clickabc () {
    super.clickToElement ( passportField () );
    return this;
  }
}


