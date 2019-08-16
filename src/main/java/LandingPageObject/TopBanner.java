package LandingPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TopBanner
{
    WebDriver driver;

    @FindBy(how = How.CLASS_NAME, using = "img-responsive")
    private WebElement responsiveImage;

    @FindBy(how = How.CLASS_NAME, using = "shop-phone")
    private WebElement shopPhoneNo;

    @FindBy(how = How.ID, using = "contact-link")
    private WebElement contactUs;

    @FindBy(how = How.CLASS_NAME, using = "login")
    private WebElement login;

    @FindBy(how = How.CLASS_NAME, using = "logo img-responsive")
    private WebElement responsiveLogo;

    @FindBy(how = How.ID, using = "search_query_top")
    private WebElement search;

    @FindBy(how = How.NAME, using = "submit_search")
    private WebElement submitSearch;

    public TopBanner(WebDriver driver)
    {
        this.driver = driver;
    }

    public void ResponsiveImg()
    {
        responsiveImage.click();
    }

    public String ShopNo()
    {
        String phone = shopPhoneNo.getText();
        return phone;
    }

    public void ContactUs()
    {
        contactUs.click();
    }

    public void Login()
    {
        login.click();
    }

    public void Logo()
    {
        responsiveLogo.click();
    }

    public void Search(String searchCriteria)
    {
        search.clear();
        search.sendKeys(searchCriteria);
    }

    public void SubmitSearch()
    {
        submitSearch.click();
    }
}
