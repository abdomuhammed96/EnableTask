package pages.AddProduct;

import base.WebPageObjectBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddProductPO extends WebPageObjectBase {
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[4]/div[1]/div[1]/div[1]/section[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/button[1]")
    public WebElement nextToStepTwo;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[4]/div[1]/div[1]/div[1]/section[1]/div[1]/form[1]/div[1]/div[2]/span[1]/div[2]/div[5]/div[1]/span[2]/input[1]")
    public WebElement quantity;

    @FindBy(xpath = " /html[1]/body[1]/div[1]/div[4]/div[1]/div[1]/div[1]/section[1]/div[1]/form[1]/div[1]/div[2]/span[1]/div[2]/div[3]/div[1]/span[2]/input[1]")
    public WebElement auctionName;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[4]/div[1]/div[1]/div[1]/section[1]/div[1]/form[1]/div[1]/div[2]/span[1]/div[2]/div[4]/div[2]/span[1]/div[2]/div[1]/span[2]/div[1]/div[1]/div[1]/input[1]")
    public WebElement MainCategory;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[4]/div[1]/div[1]/div[1]/section[1]/div[1]/form[1]/div[1]/div[2]/span[1]/div[2]/div[4]/div[2]/span[1]/div[3]/div[1]/span[2]/div[1]/div[1]/div[1]/input[1]")
    public WebElement subCategory;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[4]/div[1]/div[1]/div[1]/section[1]/div[1]/form[1]/div[1]/div[2]/span[1]/div[2]/div[4]/div[2]/span[1]/div[2]/div[1]/span[2]/div[1]/ul[1]/li[1]")
    public WebElement SelectedMainCategory;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[4]/div[1]/div[1]/div[1]/section[1]/div[1]/form[1]/div[1]/div[2]/span[1]/div[2]/div[4]/div[2]/span[1]/div[3]/div[1]/span[2]/div[1]/ul[1]/li[1]")
    public WebElement SelectedSubCategory;

    @FindBy(xpath = "/html/body/div/div[4]/div/div/div/section/div/form/div/div[2]/span/div[2]/div[8]/div/span/div/textarea")
    public WebElement auctionDetails;

    @FindBy(xpath = "/html/body/div/div[4]/div/div/div/section/div/form/div/div[2]/span/div[2]/div[8]/div/span/div/textarea")
    public WebElement Policy;

    @FindBy(xpath = "/html/body/div/div[4]/div/div/div/section/div/form/div/div[2]/span/div[2]/div[10]/div/div/div[2]/input[1]")
    public WebElement uploadMainPage;


    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[4]/div[1]/div[1]/div[1]/section[1]/div[1]/form[1]/div[1]/div[2]/span[1]/div[2]/div[13]/div[1]/button[2]")
    public WebElement nextToStepThree;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[4]/div[1]/div[1]/div[1]/section[1]/div[1]/form[1]/div[1]/div[3]/span[1]/div[1]/div[1]/div[3]/span[2]/select[1]")
    public WebElement sellingType;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[4]/div[1]/div[1]/div[1]/section[1]/div[1]/form[1]/div[1]/div[3]/span[1]/div[1]/div[4]/div[1]/span[1]/input[1]")
    public WebElement estimationValue;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[4]/div[1]/div[1]/div[1]/section[1]/div[1]/form[1]/div[1]/div[3]/span[1]/div[1]/div[3]/div[1]/span[2]/input[1]")
    public WebElement startingBidValue;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[4]/div[1]/div[1]/div[1]/section[1]/div[1]/form[1]/div[1]/div[3]/span[1]/div[1]/div[2]/div[2]/span[1]/input[1]")
    public WebElement buyNowValue;

    @FindBy(xpath = "/html/body/div[1]/div[4]/div/div/div/section/div/form/div/div[3]/span/div/div[1]/div[2]/span[2]/select")
    public WebElement auctionDuration;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[4]/div[1]/div[1]/div[1]/section[1]/div[1]/form[1]/div[1]/div[3]/span[1]/div[1]/div[9]/span[1]/div[1]/label[1]/span[2]")
    public WebElement auctionShowType;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[4]/div[1]/div[1]/div[1]/section[1]/div[1]/form[1]/div[1]/div[3]/span[1]/div[1]/div[9]/span[1]/div[1]/label[1]/span[2]")
    public WebElement date;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[4]/div[1]/div[1]/div[1]/section[1]/div[1]/form[1]/div[1]/div[3]/span[1]/div[1]/div[9]/span[1]/div[1]/label[1]/span[2]")
    public WebElement time;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[4]/div[1]/div[1]/div[1]/section[1]/div[1]/form[1]/div[1]/div[3]/span[1]/div[1]/div[11]/div[1]/button[2]")
    public WebElement nextToStepFour;


    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[4]/div[1]/div[1]/div[1]/section[1]/div[1]/form[1]/div[1]/div[4]/span[1]/div[1]/div[2]/div[1]/button[1]")
    public WebElement addToCart;



}
