package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.BrowserSetup;
import utilities.BrowserUtilities;
import utilities.StringUtilities;

public class NavigationTests {


    public static void main(String[] args) throws Exception{
        testChrome();

    }

    public static void testChrome(){
        WebDriver driver = BrowserSetup.createADriver("chrome");
        driver.get("https://www.trendyol.com/");
        driver.manage().window().maximize();
        BrowserUtilities.wait(4);
        String trendyol= driver.getTitle();
        StringUtilities.checkEquality(trendyol,"En Trend Ürünler Türkiye'nin Online Alışveriş Sitesi Trendyol'da");
        driver.findElement(By.cssSelector("a[class='fancybox-item fancybox-close']")).click();
        BrowserUtilities.wait(3);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.cssSelector("div[class='link account-user']"))).perform();
        BrowserUtilities.wait(2);
        driver.findElement(By.className("login-button")).click();
        BrowserUtilities.wait(3);
        driver.findElement(By.cssSelector("#login-email")).sendKeys("asdasd");
        BrowserUtilities.wait(3);
        driver.findElement(By.cssSelector("#login-password-input")).sendKeys("asdasd", Keys.ENTER);
        BrowserUtilities.wait(3);

        driver.quit();


    }
}
