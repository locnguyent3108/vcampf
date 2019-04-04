package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AbstractPage {
  protected WebDriver driver;
  public AbstractPage(WebDriver driver){
    this.driver = driver;

  }
// Setup Driver before, after test
  public void openUrl (String url) {
    driver.get ( url );
  }

  public void endCase() {
    driver.quit ();
  }

  public void clickToElement(WebElement locator) {
    locator.click ();
  }

  public void navigateToPage(WebElement locator) {

  }




}
