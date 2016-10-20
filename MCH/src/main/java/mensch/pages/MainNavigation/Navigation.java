package mensch.pages.MainNavigation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.WrapsElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * Created by alexnesov on 10/17/16.
 */
public class Navigation {

    @FindBy
    @CacheLookup
    public WebElement dashboardSection;

    @FindBy
    @CacheLookup
    public WebElement myTasksSection;

    @FindBy
    @CacheLookup
    public WebElement employeesSection;

    @FindBy
    @CacheLookup
    public WebElement filesSection;

    @FindBy
    @CacheLookup
    public WebElement reportsSection;

    @FindBy
    @CacheLookup
    public WebElement calendarSetion;

    @FindBy
    @CacheLookup
    public WebElement searchControll;
}



