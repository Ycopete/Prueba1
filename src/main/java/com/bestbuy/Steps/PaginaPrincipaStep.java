package com.bestbuy.Steps;

import com.bestbuy.PageObject.PaginaPrincipalPageObject;
import com.bestbuy.Util.Datos;
import net.thucydides.core.annotations.Step;

import java.io.IOException;

public class PaginaPrincipaStep {
    PaginaPrincipalPageObject paginaPrincipalPageObject = new PaginaPrincipalPageObject();

    Datos datos = new Datos();

    @Step
    public void abrirNavegador() {

        paginaPrincipalPageObject.open();
    }

    @Step
    public void seleccionarPais() {
        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getBtnCanada()).click();
    }
    @Step
    public void clicAccount() {

        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getBtnAccount()).click();
    }

    @Step
    public void ingresarEmail() throws IOException {
        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getTxtEmail())
                .sendKeys(datos.leerDatosExcel("Datosycr.xlsx", "Login", 1, 0));

    }
    @Step
    public void ingresarPassword() throws IOException {
        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getTxtPassword())
                .sendKeys(datos.leerDatosExcel("Datosycr.xlsx", "Login", 1, 1));
    }
    @Step
    public void clicSingIn (){
        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getBtnSingIn()).click();
    }
}
