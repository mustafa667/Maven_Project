package com.pom.Testcases;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.*;


import com.pom.pages.*;
import com.pom.utilities.Action_utilities;
import com.pom.utilities.Syncrinization;
import com.pom.utilities.TakeScreenshot;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import com.pom.base.Testbase;
import com.pom.utilities.Test_utilities;
import org.testng.asserts.SoftAssert;


public class Testsnapdeal extends Testbase  {
    Snapdeal_Home_page snapdeal_home;
    computers_Gaming_Page computersGamingPage;
    Sign_in sign_in;
    Login_Signup log_in;
    myaccount MY_account;
    Orders MY_orders;
    Address address;
    Logger log=Logger.getLogger(Testsnapdeal.class);
    SoftAssert softassert;



    @Parameters({"browser","url"})
    @BeforeMethod
    public void launch(String browserName, String urlname)  {
        Testbase.initialize(browserName, urlname);
    }

        @Test()
        public void tc_Verify_productadd() throws InterruptedException, IOException {
            snapdeal_home = new Snapdeal_Home_page();
            computersGamingPage=new computers_Gaming_Page();
            softassert=new SoftAssert();
            snapdeal_home.perform_Hover_on__computer_and_Gaming();
            log.info("Hovered on the Mobiles and Gaming");
            driver.switchTo().activeElement();
            Syncrinization.Wait_until_element_clickable(computersGamingPage.getLaptop_i5(),driver,50);
            Syncrinization.safe_javascript_click(computersGamingPage.getLaptop_i5(),driver);
            log.info("Click on the laptop page");
            Syncrinization.Wait_until_element_Visible(computersGamingPage.Headtext_Laptops(),driver,30);
            computersGamingPage.Scroll_to_Element();
            computersGamingPage.Slide_till_minimum_value();
            log.info("Minimum price is set for 37,000");
            Thread.sleep(3000);
            computersGamingPage.Scroll_to_Element();
           // WebDriverWait wait_for_Element= new WebDriverWait(driver,30);
           // new  WebDriverWait(driver, 50).until(
                //    webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
            //wait_for_Element.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='filter-inner']//descendant::a)[2]")));
            //Syncrinization.Wait_until_element_Visible(heading,driver,50);
            computersGamingPage.Slide_Till_Maximum_value();
            log.info("maximum price is set for 70,000");
            Thread.sleep(3000);
            computersGamingPage.Scroll_to_Element();
            Syncrinization.Wait_until_element_clickable(computersGamingPage.getBrand_lenovo(),driver,50);
            computersGamingPage.Click_on_Brand_lenovo();
            log.info("Selected on the brand lenovo");
            Thread.sleep(3000);
            //Syncrinization.Wait_until_element_clickable(computersGamingPage.Core_i5_checkbox,driver,50);
            computersGamingPage.Scroll_to_Element();
            //Syncrinization.Wait_until_element_clickable(computersGamingPage.Core_i5_checkbox,driver,50);
            Syncrinization.safe_javascript_click(computersGamingPage.Core_i5_checkbox,driver);
           log.info("clicked on core i5");
            //Syncrinization.Wait_until_element_clickable(computersGamingPage.getSort_BY(),driver,50);
            Thread.sleep(2000);
            computersGamingPage.Click_On_sort_by();
            log.info("Selected on the sort button to select High to low");
            computersGamingPage.Click_Sort_High_to_low();
            log.info("Selected High to low");

            computersGamingPage.Scroll_to_Element();
            Syncrinization.Wait_until_element_Visible(computersGamingPage.getBrand_lenovo(),driver,60);

           // TakeScreenshot.Take_screenshot("snapdeal");
                for(int i=0;i<computersGamingPage.get_all_Product_Names().size();i++)
                {

                    String Names=computersGamingPage.get_all_Product_Names().get(i).getText();
                    System.out.println(Names);


                    if(Names.contains("Core i5"))
                    {

                        softassert.assertTrue(true);
                    }
                     else
                    {

                        softassert.assertTrue(false,"Lenovo i5 are not present");
                     }

                        softassert.assertAll();
                }
                 List<String>Pric_INt= new ArrayList<String>();

                for(int j=0;j<computersGamingPage.ALl_product_prices.size();j++)
                {
                    Pric_INt.add( computersGamingPage.ALl_product_prices.get(j).getText());
                    System.out.println(Pric_INt);
                    System.out.println(issorted(Pric_INt));;
                    log.info("Sorted prices are in descending order");


            }


        }
            public static boolean issorted(List<String> Pric_INt)
                {
                if (Pric_INt.isEmpty() || Pric_INt.size() == 1) {
                return true;
                }

                Iterator<String> iter = Pric_INt.iterator();
                String current, previous = iter.next();
                while (iter.hasNext()) {
                    current = iter.next();
                    if (previous.compareTo(current) > 0) {
                    return false;
                    }
                    previous = current;
                }
                return true;
        }
    @Test
    public void Testcase_address() throws InterruptedException {
        sign_in=new Sign_in();
        log_in=new Login_Signup();
        MY_account =new myaccount();
        MY_orders=new Orders();
        address= new Address();
        //actions=new Action_utilities();
       /// actions.perform_move_to_element(sign_in.getSign_in());
        log.info("Hovered to sign in");
        sign_in.getLogin().click();
        log.info("Selected Login");
        Thread.sleep(3000);
       //WebElement frame=driver.findElement(By.xpath("//div[@class='iframeSignin']/div/div[@class='userAuth-card']"));
        WebElement frame1=driver.findElement(By.id("loginIframe"));
        driver.switchTo().frame(frame1);
        log.info("Switched to Frame");
        //Thread.sleep(2000);

        log_in.getUsername().sendKeys("mustafakhan139@gmail.com");
        log.info("Username is entered");
        log_in.getContinue().click();
        Thread.sleep(3000);
        WebDriverWait wait1=new WebDriverWait(driver,30);
        wait1.until(ExpectedConditions.visibilityOf(log_in.getPassword()));
        log_in.getPassword().sendKeys("Snapdeal@585");
        log.info("Password is entered");
        log_in.getLogin().click();
        log.info("Clicked on log in");
        driver.navigate().refresh();
        Thread.sleep(10000);
        //actions.perform_move_to_element(MY_account.My_account_Tab());
        log.info("moved to my Account");
        Thread.sleep(2000);
        MY_account.orders().click();
        log.info("click on orders");
        MY_orders.Address().click();
        log.info("click on saved address");


        if(address.Empty_Message().equalsIgnoreCase("You do not have any saved address"))
        {
            address.ADD_Address().click();
            log.info("clicked on add new address");
            address.Add_Zipcode().sendKeys("533101");
            log.info("Zip code is entered");
            String name="Mustafa";
            address.Full_name().sendKeys(name);
            log.info("Full name is entered");
            address.Add_address().sendKeys("103");
            log.info("Address is entered");
            address.Landmark().sendKeys("Aksharashri");
            log.info("Entered nearest landmark");
            address.Mobile_Number().sendKeys("9493782569");
            log.info("Entered Mobile number");
            Thread.sleep(3000);
            JavascriptExecutor js= (JavascriptExecutor)driver;
            js.executeScript("arguments[0].click();",address.Official());
            log.info("clicked on the official button");
            address.get_save().click();
            log.info("address is saved");
        }

        else if (address.Full_Name().equals("Mustafa")&&address.Address_type().equalsIgnoreCase("Office"))
        {
            address.Delete_Button().click();
            log.warn("YOu are about to delete the address entered");
            Thread.sleep(3000);
            driver.switchTo().alert().accept();
            log.warn("Accepting to delete the address");
            Thread.sleep(3000);
            address.ADD_Address().click();
            log.info("clicked on add new address");
            address.Add_Zipcode().sendKeys("533101");
            log.info("Zip code is entered");
            String name="Mustafa";
            address.Full_name().sendKeys(name);
            log.info("Full name is entered");
            address.Add_address().sendKeys("103");
            log.info("Address is entered");
            address.Landmark().sendKeys("Aksharashri");
            log.info("Entered nearest landmark");
            address.Mobile_Number().sendKeys("9493782569");
            log.info("Entered Mobile number");
            Thread.sleep(3000);
            JavascriptExecutor js= (JavascriptExecutor)driver;
            js.executeScript("arguments[0].click();",address.Official());
            log.info("clicked on the official button");
            address.get_save().click();
            log.info("address is saved");

        }




    }

    @AfterMethod
    public void run()
    {
    }

}

