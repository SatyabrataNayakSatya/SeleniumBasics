package com.anvsystems.learningselenium;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleBot {

    public static void main(String[] args) throws InterruptedException {

                            //key
        System.setProperty("webdriver.chrome.driver",

                            //value
                "C:\\Users\\User\\IdeaProjects\\SeleniumBasics\\binaries\\chromedriver.exe");

        //basically webDriver is an interface

        WebDriver driver;           //the driver is lunch  //driver is an object
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in");


        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Puma Shoes");

        //ye bata ta hai ki pura page mein
        //ek aisa field thoodndo jiska name attribute ka value "q" ho agara tum find karliye ho tab type karo "Automation"
        //basically ye hum selenium ko keh rehee hain

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);

        //now it will open google then there is only one field which  is search field now it;ll automatic search automation
        //and enter it i.e search it.

    //this is same as :
    /**
     * WebDriver driver=new ChromeDriver();
     * driver.get("https://www.google.com");
     * webElement el= driver.FindElement(By.name="q");
     * el.SendKeys("automation");
     *  */

//
//
//
        Thread.sleep(30000);            //now it wait for 30 sec.
        driver.quit();                  //the driver is close






    }
}

