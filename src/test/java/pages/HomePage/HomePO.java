package pages.HomePage;

import base.WebPageObjectBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePO extends WebPageObjectBase {

    @FindBy(xpath = "/html/body/div/div/div/div[1]/div[2]/section/h1")
    public WebElement subscriptionType;

    @FindBy(id="country-name")
    public WebElement countryName;

    @FindBy(id="name-premium")
    public WebElement premiumPackage ;

    @FindBy(id="name-classic")
    public WebElement classicPackage;

    @FindBy(id="name-lite")
    public WebElement litePackage;


    //UAE ELements
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[2]/div[1]/i[1]")
    public WebElement UAEPackageCurrency;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[2]/div[1]/b[1]")
    public WebElement UAEClassicPackageCurrency;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/b[1]")
    public WebElement UAELitePackageCurrency;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[3]/div[1]/b[1]")
    public WebElement UAEPremiumPackageCurrency;

    @FindBy(id="ae")
    public WebElement UAE;

    //Algeria elements
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/i[1]")
    public WebElement AlgeriaPackageCurrency;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/b[1]")
    public WebElement AlgeriaClassicPackagePrice;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/b[1]")
    public WebElement AlgeriaLitePackagePrice;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[3]/div[1]/b[1]")
    public WebElement AlgeriaPremiumPackagePrice;

    @FindBy(id="dz")
    public WebElement Algeria;


    //Jordan elements
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[3]/div[1]/i[1]")
    public WebElement JordanPackageCurrency;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[2]/div[1]/b[1]")
    public WebElement JordanClassicPackagePrice;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/b[1]")
    public WebElement JordanLitePackagePrice;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[3]/div[1]/b[1]")
    public WebElement JordanPremiumPackagePrice;

    @FindBy(id="jo")
    public WebElement Jordan;






}
