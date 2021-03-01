package com.pom.pages;

import com.pom.base.Testbase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_in extends Testbase {

    public Sign_in(){
        PageFactory.initElements(driver,this);

    }
    @FindBy(xpath = "//div[@class='accountInner']")
    public WebElement Sign_in;

    @FindBy(xpath = "//span[@class='accountBtn btn rippleWhite']")
    public WebElement login;

    public WebElement getSign_in()
    {
        return  Sign_in;
    }
    public WebElement getLogin()
    {
        return login;
    }






}
