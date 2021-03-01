package com.pom.utilities;

import com.pom.base.Testbase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.crypto.spec.PSource;

public class Action_utilities extends Testbase {


    Actions actions=new Actions(driver);

    public void perform_escape_action()
    {
        actions.sendKeys(Keys.ESCAPE).perform();
    }
    public void perform_move_to_element(WebElement element)
    {
        actions.moveToElement(element).perform();
    }
    public void perform_move_to_element_and_click (WebElement element)
    {
        actions.moveToElement(element).click().perform();
    }
    public void Perform_Drag_and_Drop(WebElement Source,int min,int max)
    {
        actions.dragAndDropBy(Source,min,max).build().perform();
    }
    public void perform_double_click(WebElement Element_to_click)
    {
        actions.doubleClick(Element_to_click).build().perform();
    }
    public void Perform_right_click(WebElement Element_to_doubleclick)
    {
        actions.contextClick(Element_to_doubleclick).build().perform();
    }
    public void perform_click_and_hold(WebElement Element_to_locate, int xoffset, int yoffset)
    {
        actions.clickAndHold(Element_to_locate).moveByOffset(xoffset, yoffset).release().perform();
    }



}