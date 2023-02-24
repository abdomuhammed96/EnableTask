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

        WebDriverWait wait = new WebDriverWait(driver, 80);
        wait.until(ExpectedConditions.visibilityOf(nextToStepTwo));
        clickOnElement(nextToStepTwo);
        Thread.sleep(10000);
        ScrollDown();
        writeInTextField(auctionName,"Text");
        Thread.sleep(10000);
        writeInTextField(MainCategory,"CARS , MOTORCYCLES & ACCESSORIES");
        Thread.sleep(10000);
        writeInTextField(subCategory,"CARS");
         writeInTextField(quantity,"22");
        Thread.sleep(10000);


    }


}
