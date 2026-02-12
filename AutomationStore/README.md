# 🧪 Automation Store -- BDD Test Automation Framework

## 📌 Project Overview

This project is an end-to-end test automation framework developed for
the Automation Test Store web application.

The framework automates a complete e-commerce workflow including login,
address management, product selection, cart operations, checkout
process, invoice verification, and logout.

It is implemented using Selenium WebDriver with Java and follows the
Page Object Model (POM) combined with a Behavior Driven Development
(BDD) approach.

------------------------------------------------------------------------

## 🏗 Framework Architecture

The project follows a layered hybrid framework design:

-   📝 BDD Layer -- Feature files written in Gherkin
-   🔁 Step Definition Layer -- Maps feature steps to Java methods
-   📄 Page Object Layer -- Contains UI interaction logic
-   🔧 Hooks Layer -- Setup and teardown configuration
-   ⚙ Utility Layer -- Driver management
-   ▶ Runner Layer -- Executes tests using TestNG

------------------------------------------------------------------------

## 📂 Project Structure

    src
    ├── main
    │   ├── java
    │   └── resources
    │
    └── test
        ├── java
        │   ├── hooks
        │   │   └── Hooks.java
        │   ├── pages
        │   │   ├── HomePage.java
        │   │   ├── ProductPage.java
        │   │   ├── CartPage.java
        │   │   ├── CheckoutPage.java
        │   │   ├── AccountPage.java
        │   │   └── LogoutPage.java
        │   ├── runners
        │   │   └── TestNGRunner.java
        │   ├── steps
        │   │   ├── LoginSteps.java
        │   │   ├── ManageAddress.java
        │   │   ├── SearchSteps.java
        │   │   ├── CartSteps.java
        │   │   ├── CheckoutSteps.java
        │   │   └── LogoutSteps.java
        │   └── utils
        │       └── DriverFactory.java
        │
        └── resources
            ├── features
            │   └── ecommerce.feature
            └── log4j2.properties

------------------------------------------------------------------------

## 🎯 Automated Test Scenario

Scenario: Complete E-Commerce Purchase and Account Flow

The automated scenario performs the following steps:

1.  Launch the application
2.  Login with valid credentials
3.  Navigate to Manage Address section
4.  Add a new address
5.  Navigate to Apparel and Accessories → T-Shirts
6.  Sort products by price (Low to High)
7.  Add product to cart
8.  Update product quantity
9.  Proceed to checkout
10. View invoice page
11. Logout successfully

------------------------------------------------------------------------

## ✅ Functional Coverage

-   🔐 Login functionality
-   🏠 Address management (Add new address)
-   🛍 Product navigation and sorting
-   🛒 Add to cart functionality
-   🔄 Cart quantity update
-   💳 Checkout workflow
-   🧾 Invoice page navigation
-   🚪 Logout functionality

------------------------------------------------------------------------

## 🛠 Technologies Used

-   ☕ Java
-   🌐 Selenium WebDriver
-   🥒 Cucumber (BDD)
-   📊 TestNG
-   📦 Maven
-   📝 Log4j2
-   🔁 Git and GitHub
-   💻 Eclipse IDE

------------------------------------------------------------------------

## 🔄 Execution Workflow

1.  TestNGRunner triggers Cucumber execution
2.  Cucumber reads the ecommerce.feature file
3.  Hooks.java initializes WebDriver
4.  Login steps execute
5.  Manage Address steps execute
6.  Product navigation and sorting steps execute
7.  Cart and Checkout steps execute
8.  Invoice page is opened
9.  Logout steps execute
10. Browser closes after scenario completion

Logs are generated using Log4j2 during execution.

------------------------------------------------------------------------

## ▶ How to Run the Project

Clone the repository:

    git clone <your-repository-url>

Navigate to the project directory:

    cd AutomationStore

Run using Maven:

    mvn clean test

Or run TestNGRunner.java directly from your IDE.

------------------------------------------------------------------------

## 👥 Authors

Siva  
Sivaram  
Sriram  
Gokul  
Chaitanya  
Jawwad
