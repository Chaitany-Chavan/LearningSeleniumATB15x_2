package com.thetestingacademy.Index.Tasks;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Task5_Vwo_withwaits_commontoall {
@Test
    @Owner("Chaitany Chavan")
    @Description
    @Severity(SeverityLevel.CRITICAL)

    public void Test_Waits() throws Exception {

    WebDriver driver = new ChromeDriver();
    driver.get("https://app.vwo.com/#/login");

    WebElement email = driver.findElement(By.id("login-username"));
    email.sendKeys("admin@admin.com");

    WebElement pass = driver.findElement(By.id("login-password"));
    pass.sendKeys("admin");

    WebElement login = driver.findElement(By.id("js-login-btn"));
    login.click();

// verify error message - locator - id="js-notification-box-msg"

//    Your email, password, IP address or location did not match"

//    driver.quit();
 }
}

