package com.learnselenium.carrierincentives.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CarrierIncentiveLogin {
	
	public static void main(String[] args) {
		String URL = "http://www.google.com";

	    WebDriver webDriver = null;
    	System.setProperty("webdriver.chrome.driver", "E:\\Dilip\\Study\\java-selenium\\codebase\\Java-Selenium\\lib\\chrome-driver\\windows\\chromedriver.exe");

	    try{

		    webDriver = new ChromeDriver();

		    webDriver.get(URL);
		    Thread.sleep(4000);
	    }catch(Exception e){
	    	e.printStackTrace();
	    	System.out.println("` Exception is : " + e);
	    }finally {
	    	webDriver.quit();
	    }
	

	}
	
	
}
