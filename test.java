import DriverConfig.BROWSER;
import DriverConfig.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class test {
    static final By ELEMENT = By.xpath("//*[@id=\"body\"]/div[1]/main/section[1]/div[2]/div/ul/li[5]/div/div/img");
    static final String BASEURL="https://ithillel.ua/";



    public static void main(String[] args) throws Exception {

        WebDriver driver = DriverFactory.getDriver(BROWSER.valueOf("CHROME"));
        driver.get(BASEURL);

        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(20));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(ELEMENT));

        WebElement element = driver.findElement(ELEMENT);
        if (element.isDisplayed()) {
            System.out.println("ELEMENT IS DISPLAYED");
        } else {
            System.out.println("Error");
        }



        try {
            Thread.sleep(5000);
        } catch (InterruptedException ignore) {
            driver.quit();
        }


        driver.quit();


    }
}
