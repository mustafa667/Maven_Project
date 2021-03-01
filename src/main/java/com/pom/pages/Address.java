package com.pom.pages;

import com.pom.base.Testbase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.PublicKey;

public class Address extends Testbase {
    public Address()
    {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[text()='Add New Address']")
    public WebElement Add_address;

    @FindBy(id = "zip")
    public WebElement Zip_code;
    @FindBy(id = "fullName")
    public WebElement fullname;
    @FindBy(id="address")
    public WebElement address;
    @FindBy(id="nearestLandmark")
    public WebElement landmark;
    @FindBy(id = "mobile")
    public WebElement MObile_number;
    @FindBy(id="home-mobile")
    public WebElement Home_button;
    @FindBy(id="office-mobile")
    public WebElement Official;
    @FindBy(id="dotaccount-saveAddress-continue")
    public WebElement Save;
    @FindBy(xpath = "//h3[@data-name='name']")
    public WebElement Name;
    @FindBy(xpath = "//div[@class='location']/span[@data-name='addressTag']")
    public WebElement Address_type;
    @FindBy(id="emptyMessageDetail")
    public WebElement Empty_text;
    @FindBy(xpath = "//a[@class='deleteAddress']")
    public WebElement Delete;
    public WebElement ADD_Address()
    {
        return Add_address;
    }
    public WebElement Add_Zipcode()
    {
        return Zip_code;
    }
    public  WebElement Full_name()
    {
        return fullname;
    }
    public WebElement Add_address()
    {
        return address;
    }
    public WebElement Landmark()
    {
        return landmark;
    }
    public WebElement Mobile_Number()
    {
        return MObile_number;
    }
    public WebElement Home()
    {
        return Home_button;
    }
    public WebElement Official()
    {
        return Official;
    }
    public WebElement get_save()
    {
        return Save;
    }
    public String Full_Name()
    {
        return Name.getText();
    }
    public String Address_type()
    {
        return  Address_type.getText();
    }
    public String Empty_Message()
    {
        return Empty_text.getText();
    }
    public WebElement Delete_Button()
    {
        return Delete;
    }


}
