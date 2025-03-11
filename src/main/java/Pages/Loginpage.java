package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Loginpage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    // Locators for username, password, and login button
    By usernameFiled = By.xpath("//input[@id='user-name']");
    By passwordFiled = By.xpath("//input[@id='password']");
    By LoginBtnFiled = By.xpath("//input[@id='login-button']");
    By LoginPageError = By.xpath("//h3[@data-test=\"error\"]");
    By LoginPageError2 = By.xpath("//div[@class=\"error-message-container error\"]");



    // Constructor to initialize the driver and wait
    public Loginpage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Method to enter username
    public void Enterusername(String username) {
        driver.findElement(usernameFiled).sendKeys(username);
    }

    // Method to enter password
    public void Enterpasword(String password) {
        driver.findElement(passwordFiled).sendKeys(password);
    }

    // Method to click the login button
    public void ClickloginBtn() {
        // Wait until the login button is clickable, then click
        wait.until(ExpectedConditions.elementToBeClickable(LoginBtnFiled)).click();
    }

    // Method to perform the complete login process
    public DashboardPage loginprocess(String username, String password) throws InterruptedException {
        Enterusername(username);
        Enterpasword(password);
        ClickloginBtn();
        Thread.sleep(1000);

        return new DashboardPage(driver);
    }

    public String getErrorMessage() {
        return driver.findElement(LoginPageError).getText(); // This will return the error message text1
    }


    public String getErrorRequiedMessage(){

        return driver.findElement(LoginPageError2).getText(); // This will return the error message text2

    }

}
