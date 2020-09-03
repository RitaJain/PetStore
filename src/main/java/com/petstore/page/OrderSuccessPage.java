package com.petstore.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderSuccessPage {
    public WebDriver driver;

    private By OrderSuccessMessage = By.cssSelector("div#Content>ul.messages>li");


    public OrderSuccessPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getOrderSuccessMessage() {
        return driver.findElement(OrderSuccessMessage);
    }
}
