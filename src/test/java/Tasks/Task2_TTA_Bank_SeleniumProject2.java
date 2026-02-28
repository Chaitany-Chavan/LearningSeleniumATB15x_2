package Tasks;

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

public class Task2_TTA_Bank_SeleniumProject2 {
    @Owner("chaitany")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify Sign Up is working")
    @Test
    public void test_TTA_Bank_SignUp_Page() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://tta-bank-digital-973242068062.us-west1.run.app/");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
}
