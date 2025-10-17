package com.mytests.TestNG_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TextBoxTest {

    private WebDriver driver;

    @BeforeMethod
    public void setup() throws InterruptedException {
        // Set ChromeDriver path

   System.setProperty("webdriver.chrome.driver", "C:\\selenium webdriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(1000);
    }

    @Test(priority = 1)
    public void testTextBoxFormSubmission1() throws InterruptedException {
        fillTextBoxForm("John Doe", "johndoe@example.com", "123 Main Street", "456 Oak Avenue");
    }

    @Test(priority = 2)
    public void testTextBoxFormSubmission2() throws InterruptedException {
        fillTextBoxForm("Alice Smith", "alice@example.com", "789 Pine Road", "321 Maple Street");
    }

    // Method to fill form + submit + verify
    private void fillTextBoxForm(String fullName, String email, String currentAddress, String permanentAddress) throws InterruptedException {
        driver.get("https://demoqa.com/text-box");
        Thread.sleep(1000);

        driver.findElement(By.id("userName")).sendKeys(fullName);
        Thread.sleep(500);
        driver.findElement(By.id("userEmail")).sendKeys(email);
        Thread.sleep(500);
        driver.findElement(By.id("currentAddress")).sendKeys(currentAddress);
        Thread.sleep(500);
        driver.findElement(By.id("permanentAddress")).sendKeys(permanentAddress);
        Thread.sleep(1000);

        WebElement submitButton = driver.findElement(By.id("submit"));
        ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submitButton);
        Thread.sleep(500);
        ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].click();", submitButton);
        Thread.sleep(1000);

        WebElement output = driver.findElement(By.id("output"));
        Assert.assertTrue(output.isDisplayed(), "Output section not visible");

        String outputName = driver.findElement(By.id("name")).getText();
        String outputEmail = driver.findElement(By.id("email")).getText();

        Assert.assertTrue(outputName.contains(fullName), "Name does not match");
        Assert.assertTrue(outputEmail.contains(email), "Email does not match");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
