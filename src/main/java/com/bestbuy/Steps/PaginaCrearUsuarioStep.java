package com.bestbuy.Steps;

import com.bestbuy.PageObject.PaginaCrearUsuarioPageObject;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public class PaginaCrearUsuarioStep {

    PaginaCrearUsuarioPageObject paginaCrearUsuarioPageObject = new PaginaCrearUsuarioPageObject();

    @Step
    public void validarMensaje() {

       paginaCrearUsuarioPageObject.getDriver().manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        Assert.assertThat(paginaCrearUsuarioPageObject.getDriver().findElement(paginaCrearUsuarioPageObject.getMsjValidarMensaje())
                .isDisplayed(), Matchers.is(true));

    }

}
