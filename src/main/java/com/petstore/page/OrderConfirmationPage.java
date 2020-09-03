package com.petstore.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderConfirmationPage {
    public WebDriver driver ;
    private By ConfirmButton= By.xpath("//a[contains(text(),'Confirm')]");
    private By PaymentDetailSection=By.xpath("//th[contains(text(),'Payment Details')]");
    public OrderConfirmationPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getConfirmButton() {
        return driver.findElement(ConfirmButton);
    }

    public WebElement getPaymentDetailSection() {
        return driver.findElement(PaymentDetailSection);
    }
}
