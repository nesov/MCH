package com.mensch.tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by alexnesov on 08.09.16.
 */


@SuppressWarnings("ALL")
public class sanityTests {


    @Test
    public void testGoogleSearch() {
        // Optional, if not specified, WebDriver will search your path for chromedriver.
//        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
//        WebDriver driver = new ChromeDriver();
//        WebDriver driver = new SafariDriver();
        WebDriver driver = new FirefoxDriver();

        driver.get("http://www.google.com/xhtml");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("ChromeDriver");
        searchBox.submit();
        try {
            Thread.sleep(5000);  // Let the user actually see something!
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}






