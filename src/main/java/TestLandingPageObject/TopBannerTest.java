package TestLandingPageObject;

import LandingPageObject.TopBanner;
import SetUp.BrowserFactory;
import SetUp.CodeDelay;
import SetUp.Repository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TopBannerTest
{
    private Repository repo = new Repository();
    private CodeDelay wait = new CodeDelay();
    private String phone = repo.EnvironmentProperties("phoneno");
    private String browser = repo.EnvironmentProperties("browsername");
    private String searchCriteria = repo.EnvironmentProperties("search");
    private WebDriver driver = BrowserFactory.startBrowser(browser);
    private TopBanner topBanner = PageFactory.initElements(driver, TopBanner.class);


    @Test(priority = 1)
    public void LoginButton()
    {
        topBanner.Login();
    }

    @Test
    public void ContactUs()
    {
        topBanner.ContactUs();
    }

    @Test
    public void PhoneNo()
    {
        String phonen = topBanner.ShopNo();
        Assert.assertEquals(phone, phonen);
    }

    @Test
    public void Search()
    {
        topBanner.Search(searchCriteria);
        topBanner.SubmitSearch();
    }

    @AfterTest
    public void TearDown()
    {
        wait.waitForTestToLoad();
        driver.quit();
    }
}
