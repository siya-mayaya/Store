package SetUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory
{
    private static WebDriver driver;

    public static WebDriver startBrowser(String browserName)
    {
        //instantiating the class that calls properties file
        Repository repository = new Repository();
        String url = repository.EnvironmentProperties("mystore");

        //setting the chosen browser to lowercase
        String browser = browserName.toLowerCase();

        switch(browser)
        {
            //setting chrome selenium properties
            case "chrome":
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("disable-infobars");
                String chromeProperty = repository.EnvironmentProperties("chromedriver");
                String chromeDriverPath = repository.EnvironmentProperties("chromepath");
                System.setProperty(chromeProperty, chromeDriverPath);
                driver = new ChromeDriver();
                break;

            //setting firefox selenium properties
            case "firefox":
                String ffDriverPath = repository.EnvironmentProperties("firefoxpath");
                String ffProperties = repository.EnvironmentProperties("geckodriver");
                System.setProperty(ffProperties, ffDriverPath);
                driver = new FirefoxDriver();
                break;
        }
        driver.manage().window().maximize();
        driver.get(url);
        return driver;
    }
}
