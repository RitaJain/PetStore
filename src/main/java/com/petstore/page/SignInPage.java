package com.petstore.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage {
        public WebDriver driver ;
        private By username = By.cssSelector ("input[name='username']");
        private By password = By.cssSelector ("input[name='password']");
        private By login= By.cssSelector ("input[name='signon']");
        private By RegisterNow= By.xpath ("//a[contains(text(),'Register Now!')]");
        private By signOutLink= By.xpath("//a[contains(text(),'Sign Out')]");

        public SignInPage(WebDriver driver) {
            this.driver = driver;
        }

        public WebElement getUsername() {
            return driver.findElement (username);
        }

        public WebElement getpassword() {
            return driver.findElement (password);
        }

        public WebElement getlogin() {
            return driver.findElement (login);
        }
        public WebElement getRegisterNow() {
            return driver.findElement (RegisterNow);}

        public WebElement getSignOutLink() {
            return driver.findElement(signOutLink);
        }
}


