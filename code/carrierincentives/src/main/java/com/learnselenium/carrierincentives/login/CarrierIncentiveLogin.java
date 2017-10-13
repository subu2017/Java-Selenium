package com.learnselenium.carrierincentives.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CarrierIncentiveLogin {
	
	public static void main(String[] args) {
		String URL = "https://www.carrierincentives.com";

	    WebDriver webDriver = null;
    	System.setProperty("webdriver.chrome.driver", "E:\\Dilip\\Study\\java-selenium\\codebase\\Java-Selenium\\lib\\chrome-driver\\windows\\chromedriver.exe");

	    try{

		    webDriver = new ChromeDriver();

		    webDriver.get(URL);
		    Thread.sleep(4000);
		    
		    webDriver.findElement(By.xpath(".//*[@id='app_20']")).click(); //Clicking the login page
		    
		    webDriver.findElement(By.xpath(".//*[@id='UserName']")).sendKeys("dilip"); //Sending the user name
		    
		    webDriver.findElement(By.xpath(".//*[@id='PASSWORD']")).sendKeys("dilip");//Sending the password
		    
		    Thread.sleep(6000);

		    webDriver.findElement(By.id("loginButton")).click();//Clicking the login button

		   
		    Thread.sleep(4000);
		    
		    

	    }catch(Exception e){
	    	e.printStackTrace();
	    	System.out.println("` Exception is : " + e);
	    }finally {
	    	webDriver.quit();
	    }
	

	}
	
	
}
