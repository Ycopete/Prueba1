package com.bestbuy.Runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features= "src/test/resources/features/CrearUsuario.feature",
glue = "com.bestbuy.StepDefinitions",
snippets = SnippetType.CAMELCASE)
public class CrearUsuarioRunner {
}
