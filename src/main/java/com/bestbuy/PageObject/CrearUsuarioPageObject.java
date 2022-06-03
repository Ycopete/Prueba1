package com.bestbuy.PageObject;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.bestbuy.com")
public class CrearUsuarioPageObject extends PageObject {

    By btnCanada = By.xpath("//div[@class=\"country-selection\"]/following::a[@class=\"canada-link\"][2]");

    By btnAccountInicial =By.xpath("//*[@class='accountLabel_1acbc accountLabel_3GQ5_']");
    By btnCreateAccount = By.xpath  ("//span[normalize-space()='Create an account']");
    By txtFirstName = By.id("firstName");
    By txtLastName = By.id("lastName");
    By txtEmail = By.name("email");
    By txtPassword = By.name("password");
    By btnCheckbox = By.xpath("//input[@id='newsletter']");

    By btnCrearUsuario = By.xpath("//span[@class='GSYpm']");
    public By getBtnCanada() {
        return btnCanada;
    }

    public By getBtnAccountInicial() {
        return btnAccountInicial;
    }

    public By getBtnCreateAccount() {
        return btnCreateAccount;
    }

    public By getTxtFirstName() {
        return txtFirstName;
    }

    public By getTxtLastName() {
        return txtLastName;
    }

    public By getTxtEmail() {
        return txtEmail;
    }

    public By getTxtPassword() {
        return txtPassword;
    }

    public By getBtnCheckbox() {
        return btnCheckbox;
    }

    public By getBtnCrearUsuario() {
        return btnCrearUsuario;
    }
}
