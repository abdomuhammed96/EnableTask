package pages.SignInPage;

import base.WebPageObjectBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPO extends WebPageObjectBase {


    @FindBy(xpath = "//input[@id='password']")
    public WebElement Password;
    @FindBy(xpath = "//input[@id='email']")
    public WebElement Email;
    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/form[1]/div[5]/input[1]")
    public WebElement SignInBtn;

    @FindBy(xpath ="//h5[contains(text(),'Sign In')]")
    public WebElement SignInHeader;



















}
