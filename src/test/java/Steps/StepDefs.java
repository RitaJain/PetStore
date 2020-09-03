package Steps;

import com.petstore.page.*;
import common.Base;
import cucumber.api.java8.En;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import javax.xml.bind.SchemaOutputResolver;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static common.Base.driver;
import static common.Base.initializeDriver;
import static common.Base.prop;

public class StepDefs implements En {
    public PetstoreHomePage petstoreHomePagepage;
    public  SignInPage signInPage;
    RegisterPage registerPage;
    ProductListPage productListPage;
    ShoppingCartPage shoppingCartPage;
    NewOrderPage newOrderPage;
    OrderConfirmationPage orderConfirmationPage;
    OrderSuccessPage orderSuccessPage;



    public StepDefs() {

        Given("Initialize chrome Browser", () -> {
            // Write code here that turns the phrase above into concrete actions
            System.out.println("step1");
            driver = initializeDriver();
        });


        And("^I Navigate to Petstore Website$", () -> {
            driver.get(prop.getProperty("url"));


        });
        Given("^I am on Petstore Website$", () -> {
            driver.get(prop.getProperty("url"));
        });
        And("^I Navigate to SignIn Page$", () -> {
            petstoreHomePagepage =  new PetstoreHomePage(driver);
            WebElement signInLink=petstoreHomePagepage.getsignInLink ();
            signInLink.click();
        });
        And("^I click on Register Now$", () -> {
            signInPage= new SignInPage(driver);
            WebElement registerNowLink = signInPage.getRegisterNow();
        registerNowLink.click();
        });
        And("^I provide information on register page$", () -> {
            registerPage =new RegisterPage(driver);
            registerPage.getuserid().sendKeys("user2");
            registerPage.getNewPassword().sendKeys("password");
            registerPage.getRepeatedPassword().sendKeys("password");
            registerPage.getFirstname().sendKeys("user2");
            registerPage.getLastname().sendKeys("tester2");
            registerPage.getEmail().sendKeys("user2@tester.com");
            registerPage.getPhone().sendKeys("981502265");
            registerPage.getAddress1().sendKeys("address line 1");
            registerPage.getAddress2().sendKeys("address line 2");
            registerPage.getCity().sendKeys("delhi");
            registerPage.getState().sendKeys("delhi");
            registerPage.getZip().sendKeys("1100094");
            registerPage.getCountry().sendKeys("India");
            registerPage.getSaveAccountInformationButton().click();





        });

        And("^I Login on Petsore site$", () -> {
            petstoreHomePagepage= new PetstoreHomePage(driver);
            petstoreHomePagepage.getsignInLink().click();

        });
        And("^I Clicked on Dogs$", () -> {
            petstoreHomePagepage= new PetstoreHomePage(driver);
        petstoreHomePagepage.getDoglink().click();

        });
        Then("^Dogs list displays$", () -> {
            productListPage = new ProductListPage(driver);
        Assert.assertEquals(productListPage.getHeaderText().getText(),"dogs");
        });
        And("^I search for dog \"([^\"]*)\"$", (String dogBreed) -> {
            productListPage = new ProductListPage(driver);
        Assert.assertEquals(productListPage.getItemname().getText(),dogBreed);
        });
        And("^I Add to Cart \"([^\"]*)\" item$", (String arg0) -> {
            productListPage = new ProductListPage(driver);
            productListPage.getItemLink().click();
            productListPage.getaddTocartLink().click();
        });
        Then("^I land on shopping cart page$", () -> {
            shoppingCartPage = new ShoppingCartPage(driver);
            Assert.assertEquals(shoppingCartPage.getshoppingPageHeader().getText(),"Shopping Cart");
        });
        When("^I proceed to checkout$", () -> {
            shoppingCartPage = new ShoppingCartPage(driver);
        shoppingCartPage.getProceedToCheckoutButton().click();
        });
        Then("^I land on new order page$", () -> {
            newOrderPage = new NewOrderPage(driver);
        Assert.assertTrue(newOrderPage.getPaymentDetailSection().isDisplayed());
        });
        And("^I continue for checkout$", () -> {
            newOrderPage = new NewOrderPage(driver);
            newOrderPage.getOrderConfirmButton().click();
        });
        And("^I confirm the order$", () -> {
            orderConfirmationPage = new OrderConfirmationPage(driver);
        orderConfirmationPage.getConfirmButton().click();
        });
        Then("^I see order success page$", () -> {
            orderSuccessPage = new OrderSuccessPage(driver);
            Assert.assertEquals(orderSuccessPage.getOrderSuccessMessage().getText(),"Thank you, your order has been submitted");
        });
        And("^I logout from petstore site$", () -> {
            signInPage= new SignInPage(driver);
            signInPage.getSignOutLink();
        });
        And("^I Login on petstore site$", () -> {
            petstoreHomePagepage = new PetstoreHomePage(driver);
            petstoreHomePagepage.getsignInLink().click();
            signInPage =  new SignInPage(driver);
            signInPage.username().sendKeys("user1");
            signInPage.getpassword().sendKeys("password");
            signInPage.getlogin().click();
        });
        Then("^I see petstore home page$", () -> {
            signInPage =  new SignInPage(driver);
           Assert.assertTrue(signInPage.getSignOutLink().isDisplayed());

        });




    }
}

