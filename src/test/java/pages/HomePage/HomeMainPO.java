package pages.HomePage;

import base.WebPageObjectBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeMainPO extends WebPageObjectBase {
    @FindBy(xpath = "//body/nav[1]/div[2]/div[2]/a[1]")
    public WebElement SignInButton;



   @FindBy(xpath="/html[1]/body[1]/app-root[1]/div[1]/div[1]/div[1]/app-game-list[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/button[1]")
   public WebElement VIPTarneeb;










}
