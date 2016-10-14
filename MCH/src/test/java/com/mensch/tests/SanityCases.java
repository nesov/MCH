
 package com.mensch.tests;

 import mensch.pages.LoginPage;
 import mensch.pages.ForgotPasswordPage;

 import org.junit.After;
 import org.junit.Before;
 import org.junit.FixMethodOrder;
 import org.junit.Test;
 import org.junit.runners.MethodSorters;
 import org.openqa.selenium.Dimension;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.chrome.ChromeDriver;
 import mensch.pages.constants.INSTANCE;
 import org.openqa.selenium.support.ThreadGuard;

 import java.util.concurrent.TimeUnit;


 @FixMethodOrder (MethodSorters.NAME_ASCENDING)
 public class SanityCases {
     WebDriver driver;
     private String prep;

    @Before
    public void setup(){
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("start-maximized");

        Dimension d = new Dimension(800,600);
        prep = System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = ThreadGuard.protect(new ChromeDriver());
        driver.manage().window().setSize(d);
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

    }

    @After
    public void teardown(){
        driver.quit();
    }

    @Test
    public void AcheckForgotPassword() throws Exception {
        LoginPage loginPage = new LoginPage(driver);
        ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage(driver);
        loginPage.openLoginPage(driver,INSTANCE.DEV);
        loginPage.clickForgotPasswordLink();
        forgotPasswordPage.fillOutEmailField("owner@teleworm.us");
        forgotPasswordPage.clickSendButton();
        forgotPasswordPage.getBackToLoginPage(driver);
    }

    @Test
    public void BloginCase() throws Exception{
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openLoginPage(driver,INSTANCE.DEV);
        loginPage.fillOutEmail("owner@teleworm.us");
        loginPage.fillOutPassword("Admin321");
        loginPage.clickSendButton();
        loginPage.clickSendButton();
    }

    @Test
     public void CopenForgotPasswordScreen()throws Exception{
        LoginPage loginPage = new LoginPage(driver);
        ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage(driver);
        loginPage.openLoginPage(driver,INSTANCE.DEV);
        loginPage.clickToForgotPasswordLinkByMouse(driver);
        forgotPasswordPage.fillOutEmailField("owner@cuvox.de");
        forgotPasswordPage.clickSendButton();
        forgotPasswordPage.getBackToLoginPage(driver);
    }
}