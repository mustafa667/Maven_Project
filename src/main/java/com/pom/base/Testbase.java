package com.pom.base;


import com.pom.utilities.Test_utilities;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Stack;
import java.util.concurrent.TimeUnit;

public class Testbase {

    public static WebDriver driver;

    public static void initialize(String browsername, String urlname) {
        if (browsername.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver",
                    System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\chromedriver.exe");
            driver = new ChromeDriver();

        } else if (browsername.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver",
                    System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\geckodriver.exe");
            driver = new FirefoxDriver();

        }


        driver.get(urlname);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Test_utilities.implict_load_timeout, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(Test_utilities.page_load_timeout, TimeUnit.SECONDS);


    }



}





