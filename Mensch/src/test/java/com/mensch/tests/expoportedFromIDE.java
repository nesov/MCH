/**
 * Created by alexnesov on 09.09.16.
 */
package com.mensch.tests;


 import org.junit.Test;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.By;
 import org.openqa.selenium.chrome.ChromeDriver;


public class expoportedFromIDE {
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();



    @Test
    public void testExp(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://dev-mensch.synergetica.net/login");

        driver.close();
        driver.quit();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).sendKeys("a.nesov@synergetica.co");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("Admin321");
        driver.findElement(By.id("loginBtn")).click();

        driver.findElement(By.id("loginBtn")).click();
        try {
            Thread.sleep(2000);
            System.out.print("I have been here!!!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("loginBtn")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("I have been here!!!");
        driver.findElement(By.xpath("/html/body/div/user-navbar/header/nav/a[2]")).click();
        System.out.print("I have been here!!!");
        try {

            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
////        driver.findElement(By.linkText("Outgoing")).click();
////        Thread.sleep(2000);
////        driver.findElement(By.linkText("History")).click();
////        Thread.sleep(2000);
//        driver.findElement(By.xpath("//nav[@id='userNavbar']/a[3]/span")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//nav[@id='userNavbar']/a[4]/span")).click();
//        Thread.sleep(2000);
////        driver.findElement(By.linkText("Reports")).click();
////        Thread.sleep(2000);
////        driver.findElement(By.linkText("Headcount")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//a[contains(text(),'Standard Reports')]")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.linkText("New hires")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//nav[@id='userNavbar']/a[6]/span")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//button")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//div[2]/button")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.cssSelector("#Logout > span.ng-scope")).click();
//        driver.close();
//        driver.quit();
    }
}