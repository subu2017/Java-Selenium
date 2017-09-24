package com.learnselenium.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by z001qgd on 9/21/17.
 */
public class ChromeTest {

    public static void main(String[] args) throws InterruptedException {

        String URL = "http://www.google.com";

        WebDriver webDriver;

        System.setProperty("webdriver.chrome.driver", "/Dilip/Study/Java+Selenium/codebase/Java-Selenium/Session4/lib/chrome-driver/chromedriver");

        webDriver = new ChromeDriver();

        webDriver.get(URL);
        webDriver.findElement(By.id("gs_htif0")).sendKeys("Expedia");
        webDriver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[3]/center/input[1]")).click();
        Thread.sleep(3000);
        webDriver.quit();

    }
}
