# Selenium Basic Automation Testing with Java

This repository contains a step-by-step guide to mastering Selenium WebDriver with Java. It is based on a series of lectures designed to teach key concepts of Selenium automation testing, including browser interactions, locators, TestNG, assertions, and advanced topics like the Page Object Model.

---

## Table of Contents

1. [Introduction](#introduction)
2. [Prerequisites](#prerequisites)
3. [Lecture Topics](#lecture-topics)
   - [Lecture 1: Introduction to Selenium WebDriver](#lecture-1-introduction-to-selenium-webdriver)
   - [Lecture 2: Cross Browser Testing and TestNG](#lecture-2-cross-browser-testing-and-testng)
   - [Lecture 3: Locating and Interacting with Web Elements](#lecture-3-locating-and-interacting-with-web-elements)
   - [Lecture 4: Assertions and Advanced User Actions](#lecture-4-assertions-and-advanced-user-actions)
   - [Lecture 5: Handling Alerts, Waits, and Frames](#lecture-5-handling-alerts-waits-and-frames)
   - [Lecture 6: Working with Windows, Tabs, and HTML Tables](#lecture-6-working-with-windows-tabs-and-html-tables)
   - [Lecture 7: Page Object Model (POM)](#lecture-7-page-object-model-pom)
   - [Lecture 8: Advanced Page Object Model](#lecture-8-advanced-page-object-model)
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

## Lecture Topics

### Lecture 1: Introduction to Selenium WebDriver
- **Overview of Selenium WebDriver and its features.**
- **Setting up Selenium WebDriver Environment:**
  - [Chrome Browser Setup](browser/ChromeBrowserInit.java)
  - [Firefox Browser Setup](browser/FireFoxBrowserInit.java)
  - [Edge Browser Setup](browser/CrossBrowserInit.java)
- **Launching Browsers:**
  - How to run tests using Chrome, Firefox, Edge, and Safari.
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
