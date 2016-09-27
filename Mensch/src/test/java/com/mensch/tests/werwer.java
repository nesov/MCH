package com.mensch.tests;



import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.junit.*;

import java.util.List;

import static org.openqa.selenium.By.*;

/**
 * Created by alexnesov on 14.09.16.
 */


public class werwer {
    WebDriver driver;
    public String baseURL = "http://dev-mensch.synergetica.net";
    public String myTasks ="//nav[@id='userNavbar']//a[.='My Tasks']";


    @Test
    public void testWerwer() {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();


        driver.get(baseURL + "/login");
        driver.findElement(name("email")).clear();
        driver.findElement(name("email")).sendKeys("a.nesov@synergetica.co");
        driver.findElement(name("password")).clear();
        driver.findElement(name("password")).sendKeys("Admin321");
        driver.findElement(id("loginBtn")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        driver.findElement(id("loginBtn")).click();

        }
        driver.findElement(id("loginBtn")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        driver.getTitle();
        driver.findElement((xpath(myTasks))).click();


//        driver.findElement(ByCssSelector("")).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.close();

        driver.quit();
    }
}
