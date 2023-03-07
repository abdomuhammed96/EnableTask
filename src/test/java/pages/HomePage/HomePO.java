package pages.HomePage;

import base.WebPageObjectBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePO extends WebPageObjectBase {

    @FindBy(xpath = "/html/body/div/div/div/div[1]/div[2]/section/h1")
    public WebElement homePageHeaderline;

    @FindBy(id="email")
    public WebElement Email;

    @FindBy(xpath = "/html/body/div/div/div/div[1]/div[2]/section/div[1]/div/a/button")
    public WebElement lookingForWorkButton;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/section[1]/div[2]/div[1]/h1[1]")
    public WebElement lookingForWorkPageHeaderline;

    @FindBy(id="password")
    public WebElement Password;



















}
