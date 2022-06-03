package com.bestbuy.StepDefinitions;

import com.bestbuy.Steps.PaginaPrincipaStep;
import com.bestbuy.Steps.PaginaUsuarioStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import java.io.IOException;

public class LoginStepDefinition {
    @Steps
    PaginaPrincipaStep paginaPrincipaStep;
    @Steps
    PaginaUsuarioStep paginaUsuarioStep;

    @Cuando("^el usuario ingrese la credenciales de acceso$")
    public void elUsuarioIngreseLaCredencialesDeAcceso() throws IOException {

        paginaPrincipaStep.abrirNavegador();
       paginaPrincipaStep.seleccionarPais();
       paginaPrincipaStep.clicAccount();
       paginaPrincipaStep.ingresarEmail();
       paginaPrincipaStep.ingresarPassword();
       paginaPrincipaStep.clicSingIn();
    }

    @Entonces("^el visualizara un login exitoso$")
    public void elVisualizaraUnLoginExitoso() {
      // paginaUsuarioStep.validarMensaje();

    }

}
