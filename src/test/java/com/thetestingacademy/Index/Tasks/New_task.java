package com.thetestingacademy.Index.Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class New_task {
    @Test
     public void runtest() throws Exception {

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Open login page
            driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");

            // Login (Update credentials if different)
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).sendKeys("admin");
            driver.findElement(By.name("password")).sendKeys("Hacker@4321");
            driver.findElement(By.cssSelector("button[type='submit']")).click();

        // Navigate to Employee List page

            // Click on Employment Status dropdown
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Employment Status']/following::div[contains(@class,'oxd-select-text')]"))).click();

            // Select "Terminated"
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='listbox']//span[text()='Terminated']"))).click();

            // Click Search button
            driver.findElement(By.xpath("//button[@type='submit']")).click();

            // Wait for results table
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='table']/div[@role='rowgroup']/div[@role='row']")));

            // Get all rows
            List<WebElement> rows = driver.findElements(By.xpath("//div[@role='table']/div[@role='rowgroup']/div[@role='row']"));
        }
    }
