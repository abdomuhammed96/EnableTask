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


}
