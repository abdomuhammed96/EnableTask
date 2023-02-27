package pages.AddProduct;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddProductPageLogic extends AddProductPageAbstract {

    public AddProductPageLogic() {
        super();
    }


    @Override
    public void addProduct() throws InterruptedException {

        waitForVisibility(nextToStepTwo);
        clickOnElement(nextToStepTwo);


        Thread.sleep(10000);
        ScrollDown();
        waitForVisibility(auctionName);
        writeInTextField(auctionName,"Text");


        waitForVisibility(MainCategory);
        writeInTextField(MainCategory,"CARS , MOTORCYCLES & ACCESSORIES");
        waitForVisibility(SelectedMainCategory);
        clickOnElement(SelectedMainCategory);
        clickOnElement(subCategory);
        waitForVisibility(SelectedSubCategory);
        clickOnElement(SelectedSubCategory);


        ScrollDown();
        driver.switchTo().frame("tinymce_description_ifr");
        Thread.sleep(10000);
        writeInTextField(auctionDetails,"Test");

        ScrollDown();
        driver.switchTo().frame("tinymce_policy_ifr");
        writeInTextField(Policy,"Test Policy");

        ScrollDown();
        System.out.println(System.getProperty("user.dir"));
        writeInTextField(uploadMainPage,System.getProperty("user.dir")+"/Data/mainPage.png");

        ScrollDown();
        driver.switchTo().defaultContent();
        waitForVisibility(nextToStepThree);
        clickOnElement(nextToStepThree);

        waitForVisibility(sellingType);
        selectElmentFromDropdownList(sellingType,"ESTIMATION VALUE");

        selectElmentFromDropdownList(auctionDuration,"5 Min");

        writeInTextField(buyNowValue,"20");
        writeInTextField(startingBidValue,"5");
        writeInTextField(estimationValue,"25");

        clickOnElement(auctionShowType);

        writeInTextField(date,"28/02/2023");

        writeInTextField(time,"12:43 AM");

        ScrollDown();
        waitForVisibility(nextToStepFour);
        clickOnElement(nextToStepFour);

        waitForVisibility(addToCart);
        clickOnElement(addToCart);


    }


}
