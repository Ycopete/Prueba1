package com.bestbuy.PageObject;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.bestbuy.com")
public class PaginaPrincipalPageObject extends PageObject {

    By btnCanada = By.xpath("//div[@class=\"country-selection\"]/following::a[@class=\"canada-link\"][2]");
    By btnAccount = By.xpath("//*[@class='accountLabel_1acbc accountLabel_3GQ5_']");

    By txtEmail = By.id("username");
    By txtPassword = By.id("password");
    By btnSingIn = By.xpath("//span[@class='GSYpm']");

    public By getBtnCanada() {
        return btnCanada;
    }

    public By getBtnAccount() {
        return btnAccount;
    }

    public By getTxtEmail() {
        return txtEmail;
    }

    public By getTxtPassword() {
        return txtPassword;
    }

    public By getBtnSingIn() {
        return btnSingIn;
    }
}
