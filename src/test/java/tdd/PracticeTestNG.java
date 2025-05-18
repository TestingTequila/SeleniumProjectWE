package tdd;

import org.testng.Assert;
import org.testng.annotations.*;

public class PracticeTestNG
{

    @BeforeSuite
    public void createDb()
    {
        System.out.println("@BeforeSuite: creating DB....");
    }

    @AfterSuite
    public void deleteDb()
    {
        System.out.println("@AfterSuite: deleting DB....");
    }

    @BeforeTest
    public void connectToDb()
    {
        System.out.println("@BeforeTest: connecting with DB....");
    }

    @AfterTest
    public void disConnectWithDb()
    {
        System.out.println("@AfterTest: Disconnecting with DB....");
    }
    @BeforeClass
    public void openBrowser()
    {
        System.out.println("@BeforeClass: Opening the browser....");
    }

    @AfterClass
    public void closeBrowser()
    {
        System.out.println("@AfterClass: Closing the browser....");
    }
    @BeforeMethod
    public void enterUrl()
    {
        System.out.println("@BeforeMethod: Entering URL in browser....");
    }
    @Test(priority = 2, invocationCount = 10, dependsOnMethods = "registration")
    public void login()
    {
        System.out.println("@Test :Login....");
        Assert.assertFalse(false);
    }

    @Test(priority = 1)
    public  void registration()
    {
        System.out.println("@Test: Registration....");
        Assert.assertFalse(false);
    }

    @Test(priority = 3, enabled = true)
    public  void contactUs()
    {
        System.out.println("@Test: Contact Us....");
        Assert.assertEquals(12,14);
    }

    @AfterMethod
    public  void removeUrl()
    {
        System.out.println("@AfterMethod: Removing URL from browser....");
    }


}
