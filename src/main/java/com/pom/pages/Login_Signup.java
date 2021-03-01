package com.pom.pages;

import com.pom.base.Testbase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Signup extends Testbase {
    public Login_Signup()
    {
        PageFactory.initElements(driver,this);

    }
    @FindBy(id = "userName")
    public WebElement Username;
    @FindBy(id = "checkUser")
    public WebElement Continue;
    @FindBy(xpath = "//form[@id='loginUC']/input[@name='j_password']")
    public WebElement password;
    @FindBy(id = "submitLoginUC")
    public WebElement login;

    public WebElement getUsername()
    {
        return Username;
    }
    public WebElement getContinue()
    {
        return Continue;
    }
    public WebElement getPassword()
    {
        return password;
    }
    public WebElement getLogin()
    {
        return login;
    }

}
