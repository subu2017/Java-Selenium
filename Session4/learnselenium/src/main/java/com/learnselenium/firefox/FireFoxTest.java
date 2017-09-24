package com.learnselenium.firefox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by z001qgd on 9/21/17.
 */
public class FireFoxTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver firefoxDriver ;

        String url ="https://www.google.com";

        System.setProperty("webdriver.gecko.driver", "/Dilip/Study/Java+Selenium/codebase/Java-Selenium/Session4/lib/gecko-driver/geckodriver");

        firefoxDriver = new FirefoxDriver();

        try{

            //This will maximize the window.
            firefoxDriver.manage().window().maximize();

            firefoxDriver.get(url);


            //Find using id
            firefoxDriver.findElement(By.id("gs_htif0")).sendKeys("Expedia");

            //Find using xpath
            //firefoxDriver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[3]/center/input[1]")).click();

            //Find using Name
            firefoxDriver.findElement(By.name("btnK")).click();

            //Find By Link Text
            firefoxDriver.findElement(By.linkText("Expedia Travel: Vacations, Cheap Flights, Airline Tickets & Airfares")).click();

            Thread.sleep(2000);
            //Find By Partial-Link Text
            firefoxDriver.findElement(By.partialLinkText(" Add your property")).click();
            Thread.sleep(2000);

            firefoxDriver.findElement(By.className("et_pb_slide_content et-hide-mobile")).click();

            Thread.sleep(5000);

        }catch (Exception e ){
            System.out.println("Exception : " + e);
        }finally {
            firefoxDriver.quit();
        }



    }
}
