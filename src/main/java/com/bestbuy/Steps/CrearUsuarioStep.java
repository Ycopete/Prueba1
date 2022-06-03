package com.bestbuy.Steps;

import com.bestbuy.PageObject.CrearUsuarioPageObject;
import com.bestbuy.Util.Datos;
import net.thucydides.core.annotations.Step;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class CrearUsuarioStep {

    CrearUsuarioPageObject crearUsuarioPageObject = new CrearUsuarioPageObject();

    Datos datos = new Datos();

    @Step
    public void abrirNavegador() {
        crearUsuarioPageObject.open();

    }

    @Step
    public void Pais() {
        crearUsuarioPageObject.getDriver().findElement(crearUsuarioPageObject.getBtnCanada()).click();
    }

    @Step
    public void ingresarAccount() {
        crearUsuarioPageObject.getDriver().findElement(crearUsuarioPageObject.getBtnAccountInicial()).click();
    }

    @Step
    public void clicCreateAccount() {

        crearUsuarioPageObject.getDriver().findElement(crearUsuarioPageObject.getBtnCreateAccount()).click();

    }

    @Step
    public void ingresarNombre() throws IOException {

        crearUsuarioPageObject.getDriver().findElement(crearUsuarioPageObject.getTxtFirstName())
                .sendKeys(datos.leerDatosExcel("Datosycr.xlsx", "CrearUsuario", 1, 0));
    }


    @Step
    public void ingresarApellido() throws IOException {
        crearUsuarioPageObject.getDriver().findElement(crearUsuarioPageObject.getTxtLastName())
                .sendKeys(datos.leerDatosExcel("Datosycr.xlsx", "CrearUsuario", 1, 1));
    }
    @Step
    public void ingresarCorreo() throws IOException {
        crearUsuarioPageObject.getDriver().findElement(crearUsuarioPageObject.getTxtEmail())
                .sendKeys(datos.leerDatosExcel("Datosycr.xlsx", "CrearUsuario", 1, 2));

    }




    @Step
    public void ingresarPassword() throws IOException {
        crearUsuarioPageObject.getDriver().findElement(crearUsuarioPageObject.getTxtPassword())
                .sendKeys(datos.leerDatosExcel("Datosycr.xlsx", "CrearUsuario", 1, 3));
    }

    @Step
    public void clicCheckbox() {
        crearUsuarioPageObject.getDriver().findElement(crearUsuarioPageObject.getBtnCheckbox()).click();

    }

    public void crearRegistro (){
        crearUsuarioPageObject.getDriver().findElement(crearUsuarioPageObject.getBtnCrearUsuario()).click();

    }

}
