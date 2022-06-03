package com.bestbuy.StepDefinitions;


import com.bestbuy.Steps.CrearUsuarioStep;
import com.bestbuy.Steps.PaginaCrearUsuarioStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class CrearUsuarioStepDefinition {
    @Steps
    CrearUsuarioStep crearUsuarioStep;

    @Steps
    PaginaCrearUsuarioStep paginaCrearUsuarioStep;

    @Dado("^que el usuario se encuentre en la pagina web$")
    public void queElUsuarioSeEncuentreEnLaPaginaWeb() {
        crearUsuarioStep.abrirNavegador();
    }


    @Cuando("^el usuario ingrese los datos solicitados$")
    public void elUsuarioIngreseLosDatosSolicitados() throws IOException {
        crearUsuarioStep.Pais();
        crearUsuarioStep.ingresarAccount();
        crearUsuarioStep.clicCreateAccount();
        crearUsuarioStep.ingresarNombre();
        crearUsuarioStep.ingresarApellido();
        crearUsuarioStep.ingresarCorreo();
        crearUsuarioStep.ingresarPassword();
        crearUsuarioStep.clicCheckbox();
        crearUsuarioStep.crearRegistro();



    }

    @Entonces("^el visualizara una creacion de cuenta exitosa$")
    public void elVisualizaraUnaCreacionDeCuentaExitosa() {

        paginaCrearUsuarioStep.validarMensaje();
    }
}
