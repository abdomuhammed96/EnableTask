package pages.EnableAssessment;

import base.WebPageObjectBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnableAssessmentPO extends WebPageObjectBase {

    @FindBy(id="user-name")
    public WebElement userName;

    @FindBy(id="password")
    public WebElement password ;

    @FindBy(id="login-button")
    public WebElement loginButton;

    @FindBy(id="add-to-cart-sauce-labs-backpack")
    public WebElement addToCartButton;

    //@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/a[1]")
    //public WebElement shoppingCartIcon;

    @FindBy(className = "shopping_cart_link")
    public WebElement shoppingCartIcon;

    @FindBy(id="checkout")
    public WebElement checkoutButton;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]")
    public WebElement checkoutOverviewPageHeader;

    @FindBy(id="first-name")
    public WebElement firstName;

    @FindBy(tagName="h2")
    public WebElement confirmationPageMessage;

    @FindBy(id="last-name")
    public WebElement lastName;

    @FindBy(id="postal-code")
    public WebElement postalCode;

    @FindBy(id="continue")
    public WebElement continueButton;

    @FindBy(id="finish")
    public WebElement finishButton;




}
