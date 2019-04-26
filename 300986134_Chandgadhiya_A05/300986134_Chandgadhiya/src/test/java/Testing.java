import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testing {
    //Parth Chandgadhiya 300986134
    WebDriver driver;

    @BeforeTest
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//drivers//chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void  verifyTagLine(){
        driver.get("http://letzdotesting.com");
        driver.manage().window().maximize();
        Assert.assertTrue(driver.getPageSource().contains("Get ready to test"));
        String actualResult=  driver.findElement(By.xpath("//h2[@class='site-description']")).getText();
        Assert.assertEquals(actualResult, "Get ready to test");
    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
