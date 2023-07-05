package pages;

import core.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.Browser;
import utils.CommonFunctions;
import utils.WaitTool;

import java.security.PublicKey;

public class RegisterPage extends BasePage {

private static final By INPUT_FIRST_NAME = By.id("input-firstname");
private static final By INPUT_LAST_NAME = By.id("input-lastname");
private static final By INPUT_EMAIL = By.id("input-email");
private static final By INPUT_TELEPHONE = By.id("input-telephone");
private static final By INPUT_PASSWORD = By.id("input-password");
private static final By INPUT_PASSWORD_CONFIRM = By.id("input-confirm");
private static final String PAGE_URL = "http://shop.pragmatic.bg";
private static final By CLICK_CHECK_BOX = By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
private static final By CLICK_CONTINUE_BUTTON = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
private static final By CLICK_MY_ACCOUNT_BUTTON = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]");
private static final By CLICK_REGISTER_BUTTON = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a");
private static final By REGISTER_VALIDATION_MESSAGE = By.xpath("//*[@id=\"content\"]/h1");

public static void goToPage(){
    Browser.getDriver().get(PAGE_URL);
}

public static void setClickMyAccountButton(){
    driver.findElement(CLICK_MY_ACCOUNT_BUTTON).click();
}
public static void setClickRegisterButton(){
    driver.findElement(CLICK_REGISTER_BUTTON).click();
}
public static void waitForInputFields(){
    WaitTool.waitForElementVisibility(By.id("input-firstname"), 3);
}
public static void setInputFirstName(){
    driver.findElement(INPUT_FIRST_NAME).sendKeys("John");
}
public static void setInputLastName(){
    driver.findElement(INPUT_LAST_NAME).sendKeys("Smith");
}
public static void setInputEmail(){
    driver.findElement(INPUT_EMAIL).sendKeys(CommonFunctions.getRandomEmail());
}
public static void setInputTelephone(){
    driver.findElement(INPUT_TELEPHONE).sendKeys(CommonFunctions.getRandomTelephone());
}
public static void setInputPassword(){
    String password = CommonFunctions.getRandomPassword();
    driver.findElement(INPUT_PASSWORD).sendKeys(password);
    driver.findElement((INPUT_PASSWORD_CONFIRM)).sendKeys(password);
}
public static void setClickCheckBox(){
    driver.findElement(CLICK_CHECK_BOX).click();
}
public static void setClickContinueButton(){
    driver.findElement(CLICK_CONTINUE_BUTTON).click();
    }
public static void waitForValidationSuccess(){
    WaitTool.waitForElementVisibility(By.xpath("//*[@id=\"common-success\"]/ul/li[3]/a"), 5);
    }
public static void verifyValidationMessage(String expectedValidationMessage){
    String actualValidationMessage = driver.findElement(REGISTER_VALIDATION_MESSAGE).getText();
    Assert.assertTrue(actualValidationMessage.contains(expectedValidationMessage));
}
}
