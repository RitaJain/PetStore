package com.petstore.page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class searchResultPage {
    public WebDriver driver ;
    private By productName = By.cssSelector ("table>tbody>tr:nth-child(2)>td:nth-child(3)");
    private By GreatcompaniondogLink = By.cssSelector ("table>tbody>tr:nth-child(2)>td:nth-child(1))");

    private By addToCartButton= By.cssSelector ("table:nth-child(2) tbody:nth-child(1) tr:nth-child(3) td:nth-child(5) > a.Button]");
    private By searchButton= By.cssSelector ("div#SearchContent input[name='searchProducts']");

    public searchResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getproductName() {
        return driver.findElement (productName);
    }

    public WebElement getGreatcompaniondogLink() {
        return driver.findElement (GreatcompaniondogLink);
    }

    public WebElement getaddToCartButton() {
        return driver.findElement (addToCartButton);
    }


}

