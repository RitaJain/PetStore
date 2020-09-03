package com.petstore.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCartPage {
    public WebDriver driver ;
    private By shoppingPageHeader= By.xpath ("//h2[contains(text(),'Shopping Cart')]");
    private By productDescription=By.xpath("//td[contains(text(),'Adult Female')]");
    private By productQty=By.cssSelector("input[name='EST-27']");
    private By proceedToCheckoutButton=By.xpath("//a[contains(text(),'Proceed to Checkout')]");

    public ShoppingCartPage(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement getshoppingPageHeader() {
        return driver.findElement(shoppingPageHeader);
    }

    public WebElement getProceedToCheckoutButton() {
        return driver.findElement(proceedToCheckoutButton);
    }

    public WebElement getProductQty() {
        return driver.findElement(productQty);
    }

    public WebElement getProductDescription() {
        return driver.findElement(productDescription);
    }
}

