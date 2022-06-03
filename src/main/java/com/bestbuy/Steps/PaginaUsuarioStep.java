package com.bestbuy.Steps;

import com.bestbuy.PageObject.PaginaUsuarioPageObject;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public class PaginaUsuarioStep {

    PaginaUsuarioPageObject paginaUsuarioPageObject = new PaginaUsuarioPageObject();

    @Step
    public void  validarMensaje (){
        paginaUsuarioPageObject.getDriver().manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
       Assert.assertThat(paginaUsuarioPageObject.getDriver().findElement(paginaUsuarioPageObject.getMsjValidarMensaje())
              .isDisplayed(), Matchers.is(true));
    }
}
