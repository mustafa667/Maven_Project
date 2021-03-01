package com.pom.pages;

import com.pom.base.Testbase;
import com.pom.utilities.Action_utilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class computers_Gaming_Page extends Testbase {
    public Action_utilities actions=new Action_utilities();

    public computers_Gaming_Page()
    {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//span[contains(text(),'Core i5/i7 Laptops')]")
    public WebElement laptop_i5;


    @FindBy(xpath = "(//div[@class='filter-inner']//descendant::a)[1]")
    public WebElement Minimum_Price_slider;

    @FindBy(xpath = "(//div[@class='filter-inner']//descendant::a)[2]")
    public WebElement Maximum_Price_slider;

    @FindBy(xpath = "//label[@for='Brand-Lenovo']")
    public WebElement Brand_lenovo;
    @FindBy(xpath = "//span[@class='sort-label']")
    public WebElement Sort_BY;
    @FindBy(xpath = "//li[@data-index='2' and @data-sorttype='phtl']")
    public WebElement Select_HIgh_to_low;
    @FindBys(
            @FindBy(xpath = "//p[@class=\"product-title \"]"))
    public List<WebElement>all_Product_Names;
    @FindBys(
            @FindBy(xpath = "//span[@class='lfloat product-price']"))
    public List<WebElement>ALl_product_prices;
    @FindBy(xpath = "//h1[contains(text(),'Laptops')]")
    WebElement Heading_Text;
    @FindBy(xpath = "(//div[@class='filter-inner filter-inner-height'] //descendant::a)[1]")
    public WebElement Core_i5_checkbox;

    public WebElement click_core_i5()
    {
         return Core_i5_checkbox;
    }
    public WebElement Headtext_Laptops()
    {
        return Heading_Text;
    }


    public WebElement getLaptop_i5() {
        return laptop_i5;
    }
    public WebElement getMINIMUM_Price_slider()
    {
        return Minimum_Price_slider;

    }
    public WebElement getMaximum_Price_slider()
    {
        return Maximum_Price_slider;

    }
    public WebElement getBrand_lenovo()
    {
        return Brand_lenovo;
    }

    public WebElement getSort_BY() {
        return Sort_BY;
    }

    public WebElement getSelect_HIgh_to_low() {
        return Select_HIgh_to_low;
    }
    public List<WebElement> get_all_Product_Names()
    {
        return all_Product_Names;
    }
    public List<WebElement> get_ALl_product_prices()
    {
        return ALl_product_prices;
    }

    public void Click_ON_i5_Laptop()
    {
        getLaptop_i5().click();
    }
    public void Slide_till_minimum_value()
    {

        actions.Perform_Drag_and_Drop(getMINIMUM_Price_slider(),27,0);
    }
    public void Slide_Till_Maximum_value()
    {
        actions.perform_click_and_hold(getMaximum_Price_slider(),-70,0);
    }
    public void Click_on_Brand_lenovo()
    {
        getBrand_lenovo().click();
    }
    public void Click_On_sort_by()
    {
        getSort_BY().click();
    }
    public void Click_Sort_High_to_low()
    {
        getSelect_HIgh_to_low().click();
    }
    public void Scroll_to_Element()
    {
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
    }






}
