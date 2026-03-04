package com.thetestingacademy.Index.Tasks;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Task4_WebTablenew {

    @Test
    @Description
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Chaitany")

    public void Add_delete_Employee() throws Exception{

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/webtables");

        Thread.sleep(2000);

        WebElement Add= driver.findElement();
        driver.quit();

    }
}
