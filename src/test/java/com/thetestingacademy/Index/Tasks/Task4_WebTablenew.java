package com.thetestingacademy.Index.Tasks;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

public class Task4_WebTablenew {

    @Test
    @Description
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Chaitany")

    public void Add_delete_Employee() throws Exception{

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/webtables");
driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement addemployee = driver.findElement(By.id("addNewRecordButton"));
                addemployee.click();
                // Employee1
                WebElement first_Name = driver.findElement(By.id("firstName"));
                first_Name.sendKeys("vinayak");
                WebElement last_Name = driver.findElement(By.id("lastName"));
                last_Name.sendKeys("latpate");
                WebElement email = driver.findElement(By.id("userEmail"));
                email.sendKeys("vinu@gmail.com");
                WebElement age_input = driver.findElement(By.id("age"));
                age_input.sendKeys("25");
                WebElement salary = driver.findElement(By.id("salary"));
                salary.sendKeys("70000");
                WebElement department_input = driver.findElement(By.id("department"));
                department_input.sendKeys("Account");
                WebElement button2 = driver.findElement(By.id("submit"));
                button2.click();

                //employee2
                WebElement addemployee2 = driver.findElement(By.id("addNewRecordButton"));
                addemployee2.click();
                WebElement first_Name2 = driver.findElement(By.id("firstName"));
                first_Name2.sendKeys("ajay");
                WebElement last_Name2 = driver.findElement(By.id("lastName"));
                last_Name2.sendKeys("latpate");
                WebElement email2 = driver.findElement(By.id("userEmail"));
                email2.sendKeys("ajay@gmail.com");
                WebElement age_input2 = driver.findElement(By.id("age"));
                age_input2.sendKeys("29");
                WebElement salary2 = driver.findElement(By.id("salary"));
                salary2.sendKeys("2000");
                WebElement department_input2 = driver.findElement(By.id("department"));
                department_input2.sendKeys("IT");
                WebElement button3 = driver.findElement(By.id("submit"));
                button3.click();

                //employee3
                WebElement addemployee3 = driver.findElement(By.id("addNewRecordButton"));
                addemployee3.click();
                WebElement first_Name3= driver.findElement(By.id("firstName"));
                first_Name3.sendKeys("VIJAY");
                WebElement last_Name3 = driver.findElement(By.id("lastName"));
                last_Name3.sendKeys("patil");
                WebElement email3 = driver.findElement(By.id("userEmail"));
                email3.sendKeys("vijju@gmail.com");
                WebElement age_input3 = driver.findElement(By.id("age"));
                age_input3.sendKeys("26");
                WebElement salary3 = driver.findElement(By.id("salary"));
                salary3.sendKeys("30000");
                WebElement department_input3 = driver.findElement(By.id("department"));
                department_input3.sendKeys("Legal");
                WebElement button4 = driver.findElement(By.id("submit"));
                button4.click();

//        employee4
                WebElement addemployee4 = driver.findElement(By.id("addNewRecordButton"));
                addemployee4.click();
                WebElement first_Name4 = driver.findElement(By.id("firstName"));
                first_Name4.sendKeys("vikcy");
                WebElement last_Name4 = driver.findElement(By.id("lastName"));
                last_Name4.sendKeys("kausahl");
                WebElement email4 = driver.findElement(By.id("userEmail"));
                email4.sendKeys("vikky@gmail.com");
                WebElement age_input4 = driver.findElement(By.id("age"));
                age_input4.sendKeys("28");
                WebElement salary4 = driver.findElement(By.id("salary"));
                salary4.sendKeys("10000");
                WebElement department_input4 = driver.findElement(By.id("department"));
                department_input4.sendKeys("HR");
                WebElement button5 = driver.findElement(By.id("submit"));
                button5.click();

//        employee5
                WebElement addemployee5 = driver.findElement(By.id("addNewRecordButton"));
                addemployee5.click();
                WebElement first_Name5 = driver.findElement(By.id("firstName"));
                first_Name5.sendKeys("Semanti");
                WebElement last_Name5 = driver.findElement(By.id("lastName"));
                last_Name5.sendKeys("rao");
                WebElement email5 = driver.findElement(By.id("userEmail"));
                email5.sendKeys("seventy@gmail.com");
                WebElement age_input5 = driver.findElement(By.id("age"));
                age_input5.sendKeys("20");
                WebElement salary5 = driver.findElement(By.id("salary"));
                salary5.sendKeys("200");
                WebElement department_input5 = driver.findElement(By.id("department"));
                department_input5.sendKeys("it-junior");
                WebElement button6 = driver.findElement(By.id("submit"));
                button6.click();


                WebElement getEmpName = driver.findElement(By.xpath("//td[contains(text(), 'Legal')]/parent::tr/td[1]"));
                System.out.println(getEmpName.getText());

                WebElement delRecord = driver.findElement(By.id("delete-record-3"));
                delRecord.click();

                driver.quit();

            }
        }
