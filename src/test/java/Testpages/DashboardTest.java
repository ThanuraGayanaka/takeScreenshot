package Testpages;

import Basepage.Basetest;
import Pages.DashboardPage;
import Pages.Loginpage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DashboardTest extends Basetest {



@BeforeTest
    @Override
    public void chromesetup() {
        super.chromesetup();
    }

    @AfterTest
    @Override
    public void teardwon() {
        super.teardwon();
    }

    @Test
    public void Selectproduct() throws InterruptedException {
        Loginpage loginpage = new Loginpage(driver) ;
        loginpage.loginprocess("standard_user","secret_sauce");
        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.selectProduct();
        Thread.sleep(2000);


    }

@Test
    public void validateTitle(){  //validate the dashboard page Title

        DashboardPage dashboardPage = new DashboardPage(driver);
        String title=dashboardPage.GetTitle();
        String ExcpetedTitle ="Products";


        Assert.assertEquals(title,ExcpetedTitle,"Dashboard Title is correct");





    }


}
