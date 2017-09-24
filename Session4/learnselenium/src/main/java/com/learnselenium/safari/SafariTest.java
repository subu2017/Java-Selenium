package com.learnselenium.safari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

/**
 * Created by z001qgd on 9/22/17.
 */
public class SafariTest {

    public static void main(String[] args) throws InterruptedException {

        String URL = "http://www.google.com";

        WebDriver webDriver;

        webDriver = new SafariDriver();

        webDriver.get(URL);
        Thread.sleep(3000);
        webDriver.quit();
    }
}
