package com.pom.pages;

import com.pom.utilities.Action_utilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pom.base.Testbase;

public class Snapdeal_Home_page extends Testbase {
    public  Action_utilities act=new Action_utilities();


    public Snapdeal_Home_page()
    {
        PageFactory.initElements(driver, this);
    }
    // Search field
    @FindBy(xpath = "//li[@navindex='4']")
    WebElement COmputers_Gaming;



    public  WebElement element_Computer_Gaming()
    {
        return COmputers_Gaming;
    }

    public void perform_Hover_on__computer_and_Gaming()
    {
        act.perform_move_to_element(COmputers_Gaming);
    }



}


