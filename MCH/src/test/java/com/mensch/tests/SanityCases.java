
package com.mensch.tests;


 import org.junit.After;
 import org.junit.Before;
 import org.junit.Test;
 import org.openqa.selenium.*;
 import org.openqa.selenium.chrome.ChromeDriver;

 import static org.openqa.selenium.By.id;


public class SanityCases {


    WebDriver driver = new ChromeDriver();


    private static String MENSCH_URL = "http://dev-mensch.synergetica.net/login";
    private static String EMAIL_INPUT = "email";
    private static String PASSWORD_INPUT = "password";
    private static String FORGOT_PASSWORD_LINK = "//div/div/div[2]/form/a/span";

    public String generateLogin(){
        String login = "a.nesov@synergetica.co";
        return login;
    }
    public String generatePassword (){
        String password = "Admin321";
        return password;
    }





    @Before
    public void startDriver() {

    }

    @After
    public void stopDriver(){
        driver.quit();
        driver.close();
    }



    @Test
    public void checkForgotPassword(){
        System.setProperty("webdriver.chrome.driver", "/drivers/chromedriver");

        driver.get(MENSCH_URL);
        WebElement forgotPasswordLink = driver.findElement(By.xpath(FORGOT_PASSWORD_LINK));
        forgotPasswordLink.click();


    }

    @Test
    public void loginCase() throws Exception{

        driver.get(MENSCH_URL);

        driver.findElement(By.name(EMAIL_INPUT)).clear();
        driver.findElement(By.name(EMAIL_INPUT)).sendKeys(generateLogin());

        driver.findElement(By.name(PASSWORD_INPUT)).clear();
        driver.findElement(By.name(PASSWORD_INPUT)).sendKeys(generatePassword());

        WebElement loginButton = driver.findElement(id("loginBtn"));

        for (int i = 0; i < 2; i++){
           Thread.sleep(5000);
           loginButton.click();
       }
        Thread.sleep(10000);
    }
}