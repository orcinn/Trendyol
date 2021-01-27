package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserSetup {

    public static WebDriver createADriver(String browserName){

        if(browserName.equalsIgnoreCase("chrome")){

            WebDriverManager.chromedriver().setup();

            return new ChromeDriver();
        }else {

            return null;
        }
    }
}
