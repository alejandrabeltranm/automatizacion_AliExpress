package aliExpress.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.junit.runner.RunWith;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/excepcionesVentanasEmergentes.feature",
        glue = {"aliExpress.stepsdefinitions", "aliExpress.utils.hooks"},
        tags = "@cerrarExcepciones",
        snippets = SnippetType.CAMELCASE)

public class ExcepcionesVentanasEmergentesRunner {
}
