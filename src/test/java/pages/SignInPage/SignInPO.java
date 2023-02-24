package pages.SignInPage;

import base.WebPageObjectBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPO extends WebPageObjectBase {

    @FindBy(xpath = "/html[1]/body[1]/div[1]/section[1]/div[1]/form[1]/div[4]/div[1]/button[1]")
    public WebElement SignInBtn;

    @FindBy(id="email")
    public WebElement Email;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/a[1]/img[1]")
    public WebElement profileIcon;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]")
    public WebElement addProdctIcon;

    @FindBy(id="password")
    public WebElement Password;



















}
