package mensch.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

/**
 * Created by alexnesov on 10/10/16.
 */
public class ForgotPasswordPage {

    @FindBy (name = "email")
    @CacheLookup
    private WebElement emailField;

    @FindBy (id = "sendEmailBtn")
    @CacheLookup
    private WebElement sendButton;





    public void openForgotPassswordscreen (LoginPage loginPage)throws Exception{
        loginPage.clickForgotPasswordLink();
    }

    public void fillOutEmailField(String email) throws Exception{
        emailField.sendKeys(email);
    }

    public void clickSendButton(){
        sendButton.click();
    }

    public void getBackToLoginPage(WebDriver driver){
        driver.navigate().back();
    }

    public ForgotPasswordPage (WebDriver driver) throws Exception {
        PageFactory.initElements(driver, this);
    }
}


