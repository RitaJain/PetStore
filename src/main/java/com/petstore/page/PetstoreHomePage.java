package com.petstore.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PetstoreHomePage {
    public WebDriver driver ;
    private By cartIcon = By.cssSelector ("#MenuContent>a:nth-child(1)");
    private By signInLink = By.xpath("//a[contains(text(),'Sign In')]");
    private By searchBox= By.cssSelector ("div#SearchContent input[name='keyword']");
    private By searchButton= By.cssSelector ("div#SearchContent input[name='searchProducts']");
    private By Doglink =By.cssSelector("div#SidebarContent>a:nth-child(4)");

    public PetstoreHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getcartIcon() {
        return driver.findElement (cartIcon);
    }

    public WebElement getsignInLink() {
        return driver.findElement (signInLink);
    }

    public WebElement getsearchBox() {
        return driver.findElement (searchBox);
    }
    public WebElement getsearchButton() {
        return driver.findElement (searchButton);}

    public WebElement getDoglink() {
        return driver.findElement(Doglink);
    }
}
