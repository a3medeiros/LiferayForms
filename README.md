# LiferayForms

The main goal of this project was to do automated tests according to the requisites below:

* The text "party rock" must be present on the form.
* All the fields must be obligatory and have an error message, in case they aren't filled.
* A success message must be shown after the form is sent with success.

## Getting started
Download or clone the project and import it to eclipse. Then, right click on `src/test/LiferayFormTest.java` and select `Run As -> JUnit test`.
#### Prerequisites
* Java
* Eclipse
* Selenium
* JUnit 5

## Drivers
This project uses the latest Windows version of the [Chromedriver](http://chromedriver.storage.googleapis.com/index.html). 
If you use a different OS, follow the steps below:
* Download the latest version of [Chromedriver](http://chromedriver.storage.googleapis.com/index.html) for your OS.
* Copy the chromedriver file to the root of the project.
* Edit the `src/suporte/Web.java` and replace the filename.

## Packages
Information about the project packages and classes following below:

### tests
This package contains the classes to run the tests.
#### BaseTest
This class is where the `@Before` and `@After` are defined.
#### LiferayFormTests
This class contains the automated testcases.

### support
This support package contains the constants and the chromedriver initializer used on the project.
#### Constants
This class is where all the constants are located and defined.
#### Web
This class is where the chromedriver is initilized.

### pageObjects
This package contains the methods and elements to be used on the automated testcases.
#### BasePage
This class initializes the `WebDriver` to be used on the form pages.
#### LiferayFormPage
This class contains the methods and elements of the Liferay Form Page to be used on the tests and captures the new Page after the submit.
#### SuccessLiferayFormPage
This class contains the methods and elements from the Success Liferay Form Page to be used on the tests.
