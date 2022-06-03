package com.bestbuy.PageObject;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaCrearUsuarioPageObject extends PageObject {
    By msjValidarMensaje = By.xpath("//span[contains(text(),'Welcome to your account.')]");

    public By getMsjValidarMensaje() {
        return msjValidarMensaje;
    }
}
