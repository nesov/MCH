package com.mensch.tests.SanityTestsSuite.FunctionalTestsSuite.SanityTestsSuite;

import com.sun.deploy.net.protocol.chrome.ChromeURLConnection;
import org.hamcrest.Factory;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.http.HttpClient;

import java.util.ArrayList;

/**
 * Created by alexnesov on 10/17/16.
 */
public class Profile {

    @Test
    public void openHimenschUsingGoogleChromeProfle(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        String chromeProfile = "/Users/alexnesov/Library/Application\\ Support/Google/Chrome/Profile\\ 2";

        ArrayList<String> switches = new ArrayList<String>();
        switches.add("--user-data-dir=" + chromeProfile);
        capabilities.setCapability("chrome.switches", switches);

        WebDriver driver = new ChromeDriver(capabilities);
        driver.get("http://www.himensch.com/dashboard");
    }
}
