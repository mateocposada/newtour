package co.com.prueba.demoaut.newtour.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = { "src/test/resources/features/login_newtour.feature" },
        glue = { "co.com.prueba.demoaut.newtour.stepdefinitions"},
        snippets = SnippetType.CAMELCASE
)
public class LoginNewtour {
}
