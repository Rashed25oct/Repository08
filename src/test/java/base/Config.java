package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Config {
    //init driver
    public static WebDriver driver;

    //setup browser type
    public static WebDriver setupBrowser(String driverType){
        if(driverType.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver =new ChromeDriver();
        } else if (driverType.equalsIgnoreCase("Firefox")) {
            WebDriverManager.chromedriver().setup();
            driver =new FirefoxDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        return driver;
    }





}
