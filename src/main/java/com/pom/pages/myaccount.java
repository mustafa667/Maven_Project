package com.pom.pages;

import com.pom.base.Testbase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class myaccount extends Testbase {
    public myaccount()
    {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//div[@class='accountInner']/span[@class='accountUserName col-xs-12 reset-padding']")
    public WebElement myaccount;
    @FindBy(xpath = "//div[@class='dropdownAccount'] //a[contains(text(),'Orders')]")
    public WebElement MY_orders;

    public WebElement My_account_Tab()
    {
        return myaccount;
    }
    public WebElement orders()
    {
        return MY_orders;
    }
}
