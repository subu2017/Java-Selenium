
## Introduction to Selenium:

- Selenium automates web browsers.
- This is mainly used for automating Web Applications for testing the browsers.
- Selenium also used for some boring web browser tasks.

## Setting up the Firefox browser

-	Download firefox browser.
-	Install firebug and fire path plugin.

## How to install FireBug anf FirePath:

-	Click Addons in Firefox.

![](https://github.com/dilipthelip/Java-Selenium/blob/master/selenium/images/firefox-1.png)

-	Search **Firebug**

![](https://github.com/dilipthelip/Java-Selenium/blob/master/selenium/images/firefox-2.png)

- Click Install.

-	Search **FirePath**

![](https://github.com/dilipthelip/Java-Selenium/blob/master/selenium/images/firefox-3.png)

- Click Finish.


## Create a maven Project.

-	Open Eclipse.
-	Create a new Maven Project.
		
![](https://github.com/dilipthelip/Java-Selenium/blob/master/selenium/images/selenium-1.png)

![](https://github.com/dilipthelip/Java-Selenium/blob/master/selenium/images/selenium-3.png)

- Click finish.


## How to download Selenium Jars ?

Go to the below link and download the java related jar files.

http://www.seleniumhq.org/download/

## How to connect to a firefox browser ?

- In order to open the FireFox browser from


## How to connect to a chrome browser ?

### Where to download chrome driver?

Go to the below link.  

http://chromedriver.storage.googleapis.com/index.

- Add this driver as part of your test class. Have it set like below.

```
System.setProperty("webdriver.chrome.driver", "/Dilip/Study/Java+Selenium/codebase/Java-Selenium/Session4/lib/chromedriver");
```

## How to connect to a safari browser ?

- Safari driver behaves differently from the chrome driver.

- Go to the below link and download it.  

```
http://selenium-release.storage.googleapis.com/index.html?path=2.45/
```
- Install the plugin.
- Go to Develop Menu -> Enable "Allow Remote Automation".
