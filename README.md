# Selenium Basic Automation Testing with Java

This repository is a practical guide to mastering Selenium WebDriver with Java, covering essential topics for automation testing, including browser setup, cross-browser testing, headless mode, locators, TestNG, assertions, handling alerts and frames, navigation commands, and the Page Object Model framework. Perfect for beginners and professionals aiming to enhance their test automation skills.

---

## Table of Contents

1. [Introduction](#introduction)
2. [Prerequisites](#prerequisites)
3. [Topics Covered](#topics-covered)
    - [Introduction to Selenium WebDriver](#introduction-to-selenium-webdriver)
    - [Cross-Browser Testing and TestNG](#cross-browser-testing-and-testng)
    - [Locating and Interacting with Web Elements](#locating-and-interacting-with-web-elements)
    - [Assertions and Advanced User Actions](#assertions-and-advanced-user-actions)
    - [Handling Alerts, Waits, and Frames](#handling-alerts-waits-and-frames)
    - [Working with Windows, Tabs, and HTML Tables](#working-with-windows-tabs-and-html-tables)
    - [Page Object Model (POM)](#page-object-model-pom)
    - [Advanced Page Object Model](#advanced-page-object-model)
4. [How to Run](#how-to-run)
5. [References](#references)

---

## Introduction

This repository aims to provide a practical learning experience for beginners in Selenium automation testing. Each lecture introduces a new concept with hands-on examples, gradually building your expertise.

---

## Prerequisites

1. **Java Development Kit (JDK)** (version 8 or above).
2. **Maven** for dependency management.
3. **IDE** like IntelliJ IDEA or Eclipse.
4. **Supported Browsers**: Chrome, Firefox, Edge, Safari.
5. Add the following dependencies to your `pom.xml`:
   ```xml
   <dependencies>
       <dependency>
           <groupId>org.seleniumhq.selenium</groupId>
           <artifactId>selenium-java</artifactId>
           <version>4.x.x</version>
       </dependency>
       <dependency>
           <groupId>io.github.bonigarcia</groupId>
           <artifactId>webdrivermanager</artifactId>
           <version>5.x.x</version>
       </dependency>
       <dependency>
           <groupId>org.testng</groupId>
           <artifactId>testng</artifactId>
           <version>7.x.x</version>
           <scope>test</scope>
       </dependency>
   </dependencies>
   ```

---

## Topics
## Introduction to Selenium WebDriver

### Overview of Selenium WebDriver and its features
Selenium WebDriver is a powerful tool for automating web browsers. It provides APIs to control and interact with web elements, making it ideal for functional and regression testing.

### Setting up Selenium WebDriver Environment

To get started with Selenium WebDriver, we need to configure the environment for different browsers. Below are the necessary setups for Chrome, Firefox, and Edge.

## Chrome Browser Setup

### Start Chrome Browser
```
@BeforeSuite
public void startChromeBrowser(){
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
}
```
Description: Initializes the Chrome browser before the suite begins, sets up the WebDriver, and maximizes the browser window.
```
@Test
public void openURL() throws InterruptedException {
    driver.get("https://mvnrepository.com/");
    Thread.sleep(15000);
}
```
Description: Opens the specified URL in the browser and waits for 15 seconds.

Close Chrome Browser
```
@AfterSuite
public void closeChromeBrowser(){
    driver.close();
}
```
  - [Firefox Browser Setup](browser/FireFoxBrowserInit.java)
  - [Edge Browser Setup](browser/CrossBrowserInit.java)
- **Launching Browsers:**
  - Run tests using Chrome, Firefox, Edge, and Safari.
- **Dependencies:**
  - [selenium-java](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java)
  - [webdrivermanager](https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager)
  - [testng](https://mvnrepository.com/artifact/org.testng/testng)
---

### Lecture 2: Cross Browser Testing and TestNG
- **Cross Browser Testing**:
  - [Dynamic Browser Configuration](browser/CrossBrowserInit.java)
  - **Headless Mode Testing**:
    - [Chrome Headless](browser/HeadlessChrome.java)
- **TestNG Lifecycle**:
  - `@BeforeSuite`, `@BeforeTest`, `@BeforeClass`, `@BeforeMethod`, `@Test`, `@AfterMethod`, `@AfterClass`, `@AfterTest`, `@AfterSuite`
- **Browser Commands**:
  - [Browser Command Examples](browserCommand/BrowserCommandExample.java)

---

### Lecture 3: Locating and Interacting with Web Elements
- **Locators in Selenium WebDriver**:
  - ID, Name, LinkText, Partial LinkText, Tag Name, Class Name, CSS Selector, XPath, Custom Xpath, Custom CSS.
- **Interacting with Web Elements**:
  - WebElement Commands: `sendKeys`, `click`, `clear`, `getAttribute`, `getCssValue`, `getText`, `isDisplayed`, `isEnabled`, `isSelected`.
- **Navigation Commands**:
  - Navigate Forward, Backward, Refresh.

---

### Lecture 4: Assertions and Advanced User Actions
- **Assertions**:
  - Hard Assertion and Soft Assertion.
- **Action & Select Classes**:
  - Mouse Hover, Select Class Methods, Scrolling.

---

### Lecture 5: Handling Alerts, Waits, and Frames
- **Handling Alerts**:
  - Simple Alert, Prompt Alert, Confirmation Alert.
- **Waits**:
  - Implicit and Explicit Waits, `Thread.sleep()`.
- **Handling Frames**:
  - Switching Between Frames, Interacting with Elements Inside Frames.

---

### Lecture 6: Working with Windows, Tabs, and HTML Tables
- **Working with Windows and Tabs**:
  - Create New Window/Tab, Switch Between Windows/Tabs, Close a Window/Tab.
- **HTML Tables**:
  - Extracting Data from Tables.

---

### Lecture 7: Page Object Model (POM)
- **Introduction to POM**:
  - Designing Page Object Classes.

---

### Lecture 8: Advanced Page Object Model
- **Advanced POM Techniques**:
  - Framework Enhancements (Details Coming Soon).

---

## How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/selenium-basic-automation.git
   cd selenium-basic-automation
   ```
2. Open the project in your preferred IDE.
3. Configure the Maven dependencies.
4. Run the desired TestNG test cases.

---

## References

- [Selenium Documentation](https://www.selenium.dev/documentation/)
- [TestNG Documentation](https://testng.org/doc/)
- [WebDriverManager Documentation](https://github.com/bonigarcia/webdrivermanager)
