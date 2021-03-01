package com.pom.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Syncrinization {

    public static void Wait_until_element_clickable(WebElement element, WebDriver driver, int seconds)
    {
        WebDriverWait wait_for_Element=new WebDriverWait(driver,seconds);
        wait_for_Element.until(ExpectedConditions.elementToBeClickable(element));
    }
    public static void safe_javascript_click(WebElement element,WebDriver driver)
    {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].click()", element);
    }
    public static void Wait_until_element_Visible(WebElement element, WebDriver driver, int seconds)
    {
        WebDriverWait wait_for_Element=new WebDriverWait(driver,seconds);
        wait_for_Element.until(ExpectedConditions.visibilityOf(element));
    }

}
