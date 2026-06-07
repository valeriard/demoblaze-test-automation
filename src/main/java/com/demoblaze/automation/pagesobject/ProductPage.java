package com.demoblaze.automation.pagesobject;

import com.demoblaze.automation.pagesobject.basepage.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ProductPage extends BasePage {

    @FindBy(xpath = "//a[@class='btn btn-success btn-lg']")
    public WebElementFacade addToCart;

    @FindBy(xpath = "//div[@id='tbodyid']//a[@class='hrefch']")
    public List <WebElementFacade> listProducts;

    @FindBy(xpath = "//ul[@class='navbar-nav ml-auto']//a[@class='nav-link']")
    public List <WebElementFacade> navBarItems;

    @FindBy(xpath = "//a[contains(text(),'PRODUCT STORE')]")
    public WebElementFacade productStore;

    public void acceptAlert() {
        var alert = new WebDriverWait(getDriver(), Duration.ofSeconds(3))
                .until(ExpectedConditions.alertIsPresent());
        if (alert != null) {
            alert.accept();
        }
    }

}
