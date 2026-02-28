package Ex04_XPath;

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

public class TestSelenium21_MiniProject_04 {
    @Owner("chaitany")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify login is working")
    @Test
    public void test_OHRM_login() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement input_username = driver.findElement(By.xpath("//input[@name='username']"));
        input_username.sendKeys("admin");
        WebElement input_password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        input_password.sendKeys("Hacker@4321");
//        WebElement button = driver.findElement(By.xpath("//button"));
        WebElement button = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        button.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement h6 = driver.findElement(By.xpath("//span[@class=\"oxd-topbar-header-breadcrumb\"]/h6"));

        Assert.assertEquals(h6.getText(), "PIM");

//        List<WebElement> alt_images = driver.findElements(By.xpath("//img[starts-with(@alt,\"Image\")]"));
//        alt_images.get(0).click();

        driver.quit();
    }
}
