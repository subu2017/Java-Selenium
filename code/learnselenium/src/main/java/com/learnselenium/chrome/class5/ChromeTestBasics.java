package com.learnselenium.chrome.class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by z001qgd on 9/21/17.
 */
public class ChromeTestBasics {

    public static void main(String[] args) throws InterruptedException {

        String URL = "http://www.google.com";

        WebDriver webDriver;

        System.setProperty("webdriver.chrome.driver", "/Dilip/Study/Java+Selenium/codebase/Java-Selenium/Session4/lib/chrome-driver/chromedriver-2");

        webDriver = new ChromeDriver();

        webDriver.get(URL);
        try{
            Thread.sleep(2000);
            WebElement searchBox = webDriver.findElement(By.xpath(".//*[@id='gs_htif0']"));
            searchBox .sendKeys("Expedia");

            Thread.sleep(2000);
            webDriver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[3]/center/input[1]")).click();

            Thread.sleep(3000);
        }catch(Exception e ){
            e.printStackTrace();
        }finally {
            webDriver.quit();
        }



    }
}
