package Basepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Basetest {

  protected   WebDriver driver;


    public void chromesetup(){

        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.saucedemo.com/");




    }


    public void teardwon(){

        if(driver!=null){


            driver.quit();
        }
    }

    public WebDriver getDriver() {  // ✅ This method allows TestListener to access driver
        return driver;
    }


}
