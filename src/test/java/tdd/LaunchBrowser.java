package tdd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchBrowser
{

    public static WebDriver openBrowser(String browserName)
    {
        WebDriver driver;

        if(browserName.equals("Chrome"))
        {
            driver = new ChromeDriver();
        }
        else if (browserName.equals("Firefox"))
        {
            driver = new FirefoxDriver();
        }
        else if (browserName.equals("Edge"))
        {
            driver = new EdgeDriver();
        }

        else if (browserName.equals("IE"))
        {
            driver = new InternetExplorerDriver();
        }
        else
        {
            return null;
        }
        return driver;
    }
}
