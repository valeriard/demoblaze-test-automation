package com.demoblaze.automation.pagesobject.basepage;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public abstract class BasePage extends PageObject {

    public void clickItemByText(List<WebElementFacade> listItems, String name) {
        listItems.stream()
                .filter(item -> item.getText().equals(name))
                .findFirst()
                .ifPresentOrElse(
                        WebElementFacade::click,
                        () -> { throw new IllegalArgumentException("Item not found: " + name); }
                );
    }

    public boolean iterateElementsNavBar(List<WebElementFacade> listItems){
        return listItems.stream()
                .allMatch(items -> items.isVisible() && !items.getText().isEmpty());
    }

}
