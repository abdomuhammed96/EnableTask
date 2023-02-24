package base;

import com.google.gson.JsonObject;
import core.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Set;

public abstract class WebPageObjectBase {
    public WebDriver driver;
    JavascriptExecutor js;
    WebDriverWait wait;
    Select selector;


    public WebPageObjectBase() {
        this.driver = Hooks.getWebDriver();
        PageFactory.initElements(this.driver, this);
        wait = new WebDriverWait(driver, 60);
    }
    public void waitForVisibility(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void clickOnElement(WebElement element) {
        waitForVisibility(element);
        element.click();
    }


    public void writeInTextField(WebElement element, String text) {
        element.sendKeys(text);
    }

    public void ScrollDown() {
        js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)", "");
    }


    public void HoverOverElement(WebElement element) {

        Actions action = new Actions(driver);

      //Performing the mouse hover action on the target element.
        action.moveToElement(element).perform();

    }

}
