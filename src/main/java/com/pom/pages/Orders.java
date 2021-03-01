package com.pom.pages;

import com.pom.base.Testbase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orders extends Testbase {
    public Orders()
    {
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "dotAccountSavedAddresses")
    public WebElement Savedaddress;
    public WebElement Address()
    {
        return Savedaddress;
    }
}
