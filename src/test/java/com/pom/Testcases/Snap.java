package com.pom.Testcases;

import com.pom.utilities.Action_utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Snap {
    public static void main(String args[]) throws InterruptedException {

        String path="C:\\Users\\mustafa.mohammed\\IdeaProjects\\Maven_Project\\src\\test\\resources\\executables\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",path);
        WebDriver dr= new ChromeDriver();
        dr.manage().window().maximize();
        Actions ac=new Actions(dr);
        dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        dr.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
        dr.get("https://www.snapdeal.com/");
        WebElement sign_in=dr.findElement(By.xpath("//div[@class='accountInner']"));
        ac.moveToElement(sign_in).build().perform();
        WebElement login=dr.findElement(By.xpath("//span[@class='accountBtn btn rippleWhite']"));
        login.click();
        //WebElement frame=dr.findElement(By.xpath("//div[@class='userAuthIcons']"));
        dr.switchTo().frame(0);
        Thread.sleep(2000);
        dr.findElement(By.id("userName")).sendKeys("mustafakhan139@gmail.com");
        dr.findElement(By.id("checkUser")).click();
        Thread.sleep(3000);

        WebElement password=dr.findElement(By.xpath("//form[@id='loginUC']/input[@name='j_password']"));
        WebDriverWait wait1=new WebDriverWait(dr,30);
        wait1.until(ExpectedConditions.visibilityOf(password));

        password.sendKeys("Snapdeal@585");
        dr.findElement(By.id("submitLoginUC")).click();
        Thread.sleep(5000);

        WebElement name=dr.findElement(By.xpath("//div[@class='myAccountTab accountHeaderClass col-xs-13 reset-padding']"));
        wait1.until(ExpectedConditions.visibilityOf(name));

        ac.moveToElement(name).build().perform();
        Thread.sleep(2000);
        dr.findElement(By.xpath("//div[@class='dropdownAccount'] //a[contains(text(),'Orders')]")).click();
        dr.findElement(By.id("dotAccountSavedAddresses")).click();
        Thread.sleep(3000);

        WebElement Empty_message=dr.findElement(By.id("emptyMessageDetail"));
        String Empty_text= Empty_message.getText();

        if(Empty_text.equalsIgnoreCase("You do not have any saved address"))
        {
            dr.findElement(By.xpath("//a[text()='Add New Address']")).click();
            dr.findElement(By.id("zip")).sendKeys("533101");
            dr.findElement(By.id("fullName")).sendKeys("Mustafa");
            dr.findElement(By.id("address")).sendKeys("Flat no 103,Tilak Road");
            dr.findElement(By.id("nearestLandmark")).sendKeys("JN road");
            dr.findElement(By.id("mobile")).sendKeys("9493782569");
            Thread.sleep(3000);
            WebElement radio_button = dr.findElement(By.id("home-mobile"));
            JavascriptExecutor js = (JavascriptExecutor) dr;
            js.executeScript("arguments[0].click();", radio_button);
            dr.findElement(By.id("dotaccount-saveAddress-continue")).click();

        }

        else {

            System.out.println("Already present");

        }





    }
}
