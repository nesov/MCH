
 package com.mensch.tests.SanityTestsSuite.FunctionalTestsSuite.SanityTestsSuite;

 import mensch.pages.Autorization.LoginPage;
 import mensch.pages.Autorization.ForgotPasswordPage;

 import org.junit.*;
 import org.junit.runners.MethodSorters;
 import org.junit.runners.Suite;
 import org.openqa.selenium.Dimension;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.chrome.ChromeDriver;
 import mensch.pages.constants.INSTANCE;
 import org.openqa.selenium.support.ThreadGuard;

 @Suite.SuiteClasses(SanityCases.class)
 @FixMethodOrder (MethodSorters.NAME_ASCENDING)
 public class SanityCases {
     WebDriver driver;
     private String prep;

    @Before
    public void setup() throws  Exception{
        Dimension d = new Dimension(1366,768);
//        Cookie ck = new Cookie("ngStorage-secret-1549051297", "6a0d1066c2ae0280c18ff4bad692156f");
        prep = System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        driver = ThreadGuard.protect(new ChromeDriver());
        driver.manage().window().setSize(d);


    }

     @After
     public void teardown(){
        driver.quit();
    }

    @Test
    public void AcheckForgotPassword() throws Exception {
        LoginPage loginPage = new LoginPage(driver);
        ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage(driver);
        loginPage.openLoginPage();
        loginPage.clickForgotPasswordLink();
        forgotPasswordPage.fillOutEmailField("owner@teleworm.us",driver);
        forgotPasswordPage.clickSendButton();
        forgotPasswordPage.getBackToLoginPage(driver);
    }

    @Test
    public void BloginCase() throws Exception{
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openLoginPage();
        loginPage.fillOutEmail("owner@teleworm.us");
        loginPage.fillOutPassword("Admin321");
        loginPage.clickSendButton();
        loginPage.clickSendButton();
    }

    @Test
     public void CopenForgotPasswordScreen()throws Exception{
        LoginPage loginPage = new LoginPage(driver);
        ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage(driver);
        loginPage.openLoginPage();
        loginPage.clickToForgotPasswordLinkByMouse(driver);
        forgotPasswordPage.fillOutEmailField("owner@cuvox.de",driver);
        forgotPasswordPage.clickSendButton();
        forgotPasswordPage.getBackToLoginPage(driver);
    }

//    @Test
//     public void openDasboard() throws Exception {
//        driver.get(INSTANCE.DEV +"/dashboard");
//        Assert.assertTrue("Olloolo", driver.getCurrentUrl().equalsIgnoreCase("dev-mensch.synergetica.net/dashboard") );
//    }
}