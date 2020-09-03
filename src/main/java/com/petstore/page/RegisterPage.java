package com.petstore.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {
    public WebDriver driver ;
    private By userid = By.cssSelector ("input[name='username']");
    private By NewPassword = By.cssSelector ("input[name='password']");
    private By RepeatedPassword = By.cssSelector ("input[name='repeatedPassword']");
    private By Firstname=By.cssSelector("input[name='account.firstName']");
    private By Lastname=By.cssSelector("input[name='account.lastName']");
    private By Email=By.cssSelector("input[name='account.email']");
    private By Phone=By.cssSelector("input[name='account.phone']");
    private By Address1=By.cssSelector("input[name='account.address1']");
    private By Address2=By.cssSelector("input[name='account.address2']");
    private By City=By.cssSelector("input[name='account.city']");
    private By  State=By.cssSelector("input[name='account.state']");
    private By  Zip=By.cssSelector("input[name='account.zip']");
    private By Country=By.cssSelector("input[name='account.country']");
    private By languagePreference= By.cssSelector ("select[name='account.languagePreference']");
    private By favouriteCategoryId= By.cssSelector ("select[name='account.favouriteCategoryId']");
    private By enableMyListCheckbox= By.cssSelector ("input[type='checkbox'][name='account.listOption']");
    private By enableMyBannerCheckbox= By.cssSelector ("input[type='checkbox'][name='account.bannerOption']]");
    private By  saveAccountInformationButton=By.cssSelector("input[name='newAccount']");

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getuserid() {
        return driver.findElement (userid);
    }

    public WebElement getNewPassword() {
        return driver.findElement (NewPassword);
    }
    public WebElement getRepeatedPassword() {
        return driver.findElement (RepeatedPassword);
    }
    public WebElement getFirstname() {
        return driver.findElement (Firstname);
    }
    public WebElement getLastname() {
        return driver.findElement (Lastname);}


    public WebElement getEmail() {
        return driver.findElement(Email);
    }

    public WebElement getPhone() {
        return driver.findElement(Phone);
    }

    public WebElement getAddress1() {
        return driver.findElement(Address1);
    }

    public WebElement getAddress2() {
        return driver.findElement(Address2);
    }

    public WebElement getCity() {
        return driver.findElement(City);
    }

    public WebElement getState() {
        return driver.findElement (State);
    }

    public WebElement getZip() {
        return driver.findElement  (Zip);
    }

    public WebElement getCountry() {
        return driver.findElement(Country);
    }

    public WebElement getLanguagePreference() {
        return driver.findElement(languagePreference);
    }

    public WebElement getFavouriteCategoryId() {
        return driver.findElement(favouriteCategoryId);
    }

    public WebElement getEnableMyListCheckbox() {
        return driver.findElement(enableMyListCheckbox);
    }

    public WebElement getEnableMyBannerCheckbox() {
        return driver.findElement(enableMyBannerCheckbox);
    }

    public WebElement getSaveAccountInformationButton() {
        return driver.findElement(saveAccountInformationButton);
    }
}


