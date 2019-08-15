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

    public TopBanner(WebDriver driver)
    {
        this.driver = driver;
    }

    public void ResponsiveImg()
    {
        responsiveImage.click();
    }

    public void ShopNo()
    {
        shopPhoneNo.getText();
    }

    public void ContactUs()
    {
        contactUs.click();
    }

    public void Login()
    {
        login.click();
    }
}
