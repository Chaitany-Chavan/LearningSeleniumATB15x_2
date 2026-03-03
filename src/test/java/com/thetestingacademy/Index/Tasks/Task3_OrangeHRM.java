package com.thetestingacademy.Index.Tasks;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Task3_OrangeHRM {
    @Owner("chaitany")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify OrangeHRM Working")
    @Test
    public void OrangeHRM() throws Exception{

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/hr/web/index.php");

        driver.manage().window().maximize();

        Thread.sleep(2000);
        WebElement input_username = driver.findElement(By.xpath("//input[@name='username']"));
        input_username.sendKeys("admin");

        WebElement input_password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        input_password.sendKeys("Hacker@4321");

        WebElement button = driver.findElement(By.xpath("//button"));
        button.click();

        Thread.sleep(2000);

        List<WebElement> First_TerminatedEmp = driver.findElements(By.xpath("//div[text()=\"Terminated\"]"));
        WebElement First_TerminatedEmpName = driver.findElement(By.xpath("//div[contains(text(),'Terminated')]/../preceding-sibling::div[3]"));
        System.out.println(First_TerminatedEmpName.getText());
        WebElement DeleteFirst_terminatedEmp = driver.findElement(By.xpath( "//div[text()=\"Terminated\"]/following::i[1]"));
        DeleteFirst_terminatedEmp.click();
Thread.sleep(2000);

        WebElement deletePopup=driver.findElement(By.xpath("//p[@class=\"oxd-text oxd-text--p oxd-text--card-body\"]"));
        Thread.sleep(2000);
        String Delete_Popup=deletePopup.getText();

        Assert.assertEquals(Delete_Popup,"The selected record will be permanently deleted. Are you sure you want to continue?");


//        WebElement deleteBtn = driver.findElement(By.xpath("(//div[text()='Terminated'])" +
//        "[1]/ancestor::div[contains(@class,'oxd-table-row')] //button[.//i[contains(@class,'bi-trash')]]"));
//        deleteBtn.click();

//        WebElement First_Employee = driver.findElement(By.xpath("//div[@class='oxd-table-card'][2]/div/div[@role='cell'][6]"));
//
//        WebElement deletebutton =driver.findElement(By.xpath("//i[@class='oxd-icon bi-trash']"));
//        deletebutton.click();

        Thread.sleep(2000);

//        Whole table relative table mapping = //div[@role="table"]/div[@class="oxd-table-body"]/div[@class="oxd-table-card"]
        // Table = //div[@role="cell"]
        //i =
        //j =

        driver.quit();
    }
}
