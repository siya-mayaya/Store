package TestLandingPageObject;

import LandingPageObject.TopBanner;
import SetUp.BrowserFactory;
import SetUp.CodeDelay;
import SetUp.Repository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TopBannerTest
{
    private Repository repo = new Repository();
    private String browser = repo.EnvironmentProperties("browsername");
    private WebDriver driver = BrowserFactory.startBrowser(browser);
    private TopBanner topBanner = PageFactory.initElements(driver, TopBanner.class);
    private CodeDelay wait = new CodeDelay();

    @Test(priority = 1)
    public void responsiveImg()
    {
        topBanner.ResponsiveImg();
    }

    @AfterTest
    public void TearDown()
    {
        driver.quit();
    }
}
