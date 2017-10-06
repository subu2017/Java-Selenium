package com.learnselenium.firefox.class6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by z001qgd on 10/4/17.
 */
public class FireFoxAdvancedLocators {

    public static void main(String[] args) {

        WebDriver firefoxDriver ;

        String url ="https://www.google.com";

        System.setProperty("webdriver.gecko.driver", "/Dilip/Study/Java+Selenium/codebase/Java-Selenium/Session4/lib/gecko-driver/geckodriver");

        firefoxDriver = new FirefoxDriver();



    }
}
