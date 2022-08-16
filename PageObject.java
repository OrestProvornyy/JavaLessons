package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PageObject {
    private WebDriver driver;
    private By courseTitleBy = By.className("course-descriptor_header-text");

    private By courseRateBy = By.className("course-rating_average");

    private By courseDescriptionBy = By.xpath("//*[@id=\"body\"]/div[1]/main/section[2]/div/div/div[1]/div[2]/div");

    public PageObject(WebDriver driver) {
        this.driver = driver;
    }

    public String getCourseTitle() {
        WebElement span = driver.findElement(courseTitleBy);
        WebElement strong = span.findElement(By.tagName("strong"));
        String courseTitle = strong.getText();
        return courseTitle;
    }

    public String getCourseRate(){
    WebElement span = driver.findElement(courseRateBy);
    String courseRate = span.getText();
    return courseRate;
    }

    public String getCourseDescription(){
        WebElement div = driver.findElement(courseDescriptionBy);
        WebElement description = div.findElement(By.tagName("p"));
        String courseDecription = description.getText();
        return courseDecription;

    }


}