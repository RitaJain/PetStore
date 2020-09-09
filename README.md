# PetStore UI  Testing

## Table of contents
* [PetStore Website Testcases](#General info)
* [Technologies](#technologies)
* [Setup](#setup)
* [Folder structure conventions](#folder-structure-conventions)
* [Test execution](#test-execution)


General info
============
This automation project aims to help developers to detect and prevent any issues releated to PetStore Website
at url https://petstore.octoperf.com/ 

 * Scenario: 
    New user search for any product & add item to cart,places order and log out ,after that relogin.
 
 * Features Tested:
    1. Register 
    2. Login 
    3. Logout
    4. Add to Cart
    5. Search an Item
    6. Add Item to Cart
    7. Placing order
    8. confirmaiton of order

Technologies
============
- Java Compiler 1.8 : used to compile the project
- Testng 7.1.0 - Support for data-driven testing (with @DataProvider)and other Annotations (@Test , @BeforeTest, @AfterTest) 
- MVN  3.6.3 - build automation tool
- Cucumber BDD framework
- Selenium Webdriver

Setup
=====
Ubuntu OS installation

* Install Java JDK 8 on your local machine
* Install Maven
$ mvn -v
* Install IntelliJ IDEA please follow the steps [here](https://www.jetbrains.com/idea/)
* Launch IntelliJ IDEA and click on `Import project

Folder structure conventions
============================

> Folder structure for an automation software project

### A top-level directory layout
    .
    ├── src                     # Source files
    ├── test-output             # Test report generated files by Testng
    ├── README.md               # Project Details
    ├── target                  # Internal test report generated files

### Source files
    .
    ├── ...
    ├── src
    │   │
    │   └── main
    │       ├── java
    │       │    ├── com.petstore.page (contain classes for various pages of website having css locators path
    │       │    │      ├── Petstore Home page   
    │       │    │      ├── Sign in Page  
    │       │    |      ├── Register Page  
    │            |      ├── Product List Page  
    |            |      ├── New Order Page  
                 |       |....
                 ├── common
                 |      ├──Base class (Contains methods to initialize and close browser)
    │       │    │      
                 ── Resources
                 |      ├─Driver
                       ├─data.properties (contain information about driver , base url)

    |       |
    |       └── Test
                ├── java
                    ├── Features(this package contains feature file petstore.feature)
                    ├── Steps (this package  contains step defination file )
                    ├── Ruuner (contains cucumber run options/configurations
    #Test Execution
    can be run by right clicking on petstore.feature file 
   

   
