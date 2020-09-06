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
  And I Login on PetStore site
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
  And I Login on PetStore site
  Then I see petstore home page

  @avoid
  Scenario: User sign in and search for product add item to cart and on shopping bag page increase qty
  Given I am on Petstore Website
  And I Navigate to SignIn Page
  And I Login on PetStore site
  And I search for dog "Chihuahua"
  And I Add to Cart "Second" item
  Then I land on shopping cart page
  And I update the qty as "2"
  And I logout from petstore site

  @avoid
  Scenario: user add product cart without login and proceed for checkout
    Given I am on Petstore Website
    And I search for dog "Chihuahua"
    And I Add to Cart "Second" item
    Then I land on shopping cart page
    When I proceed to checkout
    Then user should see sign in page


  @avoid
  Scenario: user add product to cart and after login remove the product
    Given I am on Petstore Website
    And I Login on PetStore site
    And I search for dog "Chihuahua"
    And I Add to Cart "Second" item
    Then I land on shopping cart page
    When I remove "all" the items from the bag
    Then I should see empty shopping bag page