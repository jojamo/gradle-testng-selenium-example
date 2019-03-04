import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;

public class TrySeleniumTestNG
{
    private static WebDriver driver;

    @Test
    public void SeleniumTest() throws InterruptedException
    {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();

        String URL = "https://www.google.com/";
        driver.get(URL);

        TimeUnit.SECONDS.sleep(1);

        driver.quit();
    }
}