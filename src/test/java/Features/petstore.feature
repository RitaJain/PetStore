@test @Smoke,@Regression
Feature: petstore
Background: Navigate to Petstore Website
Given Initialize chrome Browser
And I Navigate to Petstore Website

@Regression @smoke

  Scenario: New user search for any product & add item to cart,places order and log out ,after that relogin.
  Given I am on Petstore Website
  And I Navigate to SignIn Page
  And I click on Register Now
  And I provide information on register page
  And I Login on Petsore site
  And I Clicked on Dogs
  Then Dogs list displays
  And I search for dog "Chihuahua"
  And I Add to Cart "Second" item
  Then I land on shopping cart page
  When I proceed to checkout
  Then I land on new order page
  And I continue for checkout
  And I confirm the order
  Then I see order success page
  And I logout from petstore site
  And I Login on petstore site
  Then I see petstore home page







