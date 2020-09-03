package com.petstore.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewOrderPage {
    public WebDriver driver ;

    private By CardType=By.xpath("//select[@name='order.cardType']')]");
    private By CardNumber=By.xpath("//input[@name='order.creditCard']']");
    private By ExpiryDate = By.xpath("//input[@name='order.expiryDate']']");
    private By Firstname=By.xpath("//input[@name='order.billToFirstName']");
    private By Lastname=By.xpath("//input[@name='order.billToLastName']");
    private By Address1= By.xpath("//input[@name='order.billAddress1']");
    private By Address2=By.xpath("//input[@name='order.billAddress2']");
    private By City=By.xpath("//input[@name='order.billCity']");
    private By State= By.xpath("//input[@name='order.billState']");
    private By Zip=By.xpath("///input[@name='order.billZip']");
    private By Country=By.xpath("//input[@name='order.billCountry']");
    private By continueButton= By.cssSelector("input[name='newOrder']");
    private By ShippingAddressCheckbox=By.xpath("//input[@name='shippingAddressRequired']");
    private By OrderConfirmButton= By.xpath("//a[contains(text(),'Confirm')]");
    private By PaymentDetailSection=By.xpath("//th[contains(text(),'Payment Details')]");


    public WebElement getOrderConfirmButton() {
        return driver.findElement(OrderConfirmButton);
    }

    public WebElement getPaymentDetailSection() {
        return driver.findElement(PaymentDetailSection);
    }


    public NewOrderPage(WebDriver driver) {
        this.driver = driver;
    }

    public By getCardType() {
        return driver.findElement (CardType);
    }

    public By getCardNumber() {
        return driver.findElement (CardNumber);
    }

    public By getExpiryDate() {
        return driver.findElement(ExpiryDate);
    }

    public By getFirstname() {
        return driver.findElement(Firstname);
    }

    public By getLastname() {
        return driver.findElement(Lastname);
    }

    public By getAddress1() {
        return driver.findElement(Address1);
    }

    public By getAddress2() {
        return driver.findElement(Address2);
    }

    public By getCity() {
        return driver.findElement( City);
    }

    public By getState() {
        return State;
    }

    public By getZip() {
        return Zip;
    }

    public By getCountry() {
        return driver.findElement( Country);
    }

    public By getcontinueButton() {
        return driver.findElement(continueButton);
    }

    public By getShippingAddressCheckbox() {
        return driver.findElement (ShippingAddressCheckbox);
    }
}
