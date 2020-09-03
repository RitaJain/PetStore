package com.petstore.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductListPage
{
    public WebDriver driver ;
    private By headerText=By.xpath("//h2[contains(text(),'Dogs')]");
    private By itemname=By.xpath(("//td[contains(text(),'Chihuahua')]"));
    private By itemLink=By.xpath("//a[contains(text(),'K9-CW-01')]");
    private By addToCartLink=By.xpath("//tr[3]//td[5]//a[1]");

    public ProductListPage (WebDriver driver) {
        this.driver = driver;

    }

    public WebElement getHeaderText() {
        return driver.findElement(headerText);
    }

    public WebElement getItemname() {
        return driver.findElement(itemname);
    }

    public WebElement getItemLink() {
        return driver.findElement(itemLink);
    }

    public WebElement getaddTocartLink() {
        return driver.findElement(addToCartLink);
    }
}
