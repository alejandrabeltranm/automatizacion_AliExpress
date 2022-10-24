package aliExpress.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/excepcionesValidaciones.feature",
        glue = {"aliExpress.stepsdefinitions", "aliExpress.utils.hooks"},
        tags = "@excepcionesValidaciones",
        snippets = SnippetType.CAMELCASE)

public class ExcepcionesValidacionesRunner {
}
