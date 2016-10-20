package mensch.pages.Autorization;

import mensch.pages.constants.INSTANCE;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.ScrollAction;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by alexnesov on 10/8/16.
 */

public class LoginPage {

    private WebDriver driver;
    /************************************************************************/

    // Login Page Elements
    @FindBy(name = "email")
    @CacheLookup
    private WebElement emailField;

    @FindBy(name = "password")
    @CacheLookup
    private WebElement passwordField;

    @FindBy(xpath = "//span[contains(.,'Forgot Password?')]")
    @CacheLookup
    private WebElement forgotPasswordLink;

    @FindBy (id = "loginBtn")
    @CacheLookup
    private WebElement loginButton;

    @FindBy (name = "code")
    private WebElement passcodeField;

    /************************************************************************/
    //Constructor
    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    // Login Page Actions
    public void openLoginPage(String url) throws Exception{
        driver.get(url);
    }

    public void fillOutEmail(String email) throws Exception{
        emailField.clear();
        emailField.sendKeys(email);
    }

    public void fillOutPassword(String password) throws Exception{
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickForgotPasswordLink()throws Exception{
        forgotPasswordLink.click();
    }

    public void clickSendButton() throws Exception{
            loginButton.click();
        }

    public WebElement getPasswordLinkObject(){
         return this.forgotPasswordLink;
     }

    public void clickIfPasscodeNotEmpty(boolean isTrue){
        if (isTrue)loginButton.click();
    }

    public boolean isPasscodeDisplayedAndNotNull(WebElement passcodeField){
      return  (passcodeField.isDisplayed() == true && passcodeField.getText()!= null) ? true : false;
    }

    public WebElement getPasscodeElement(){
        return this.passcodeField;
    }

    public void clickToForgotPasswordLinkByMouse(WebDriver driver){
        Actions builder = new Actions(driver);
        builder.moveToElement(getPasswordLinkObject()).click().perform();
    }
    public void logIn(LoginPage loginPage, String login, String password) throws Exception{
        this.openLoginPage(INSTANCE.DEV);
        this.fillOutEmail(login);
        this.fillOutPassword(password);
        this.clickSendButton();
    }

}