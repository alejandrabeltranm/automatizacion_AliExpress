package aliExpress.stepsdefinitions;

import aliExpress.questions.ValidacionAnadirCesta;
import aliExpress.questions.ValidacionEnvioPais;
import aliExpress.tasks.ExcepcionesValidaciones;
import aliExpress.tasks.excepcionesValidaciones.AnadirCesta;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ExcepcionesValidacionesStepDefinitions {

    @Cuando("^elige un producto$")
    public void eligeUnProducto() {
        theActorInTheSpotlight().attemptsTo(ExcepcionesValidaciones.el());
    }

    @Entonces("^se valida que se pueda enviar a Colombia$")
    public void seValidaQueSePuedaEnviarAColombia(List<String> pais) {
        theActorInTheSpotlight().should(seeThat(ValidacionEnvioPais.el(pais)));
    }

    @Y("^se anade a la cesta$")
    public void seAnadeALaCesta() {
        theActorInTheSpotlight().attemptsTo(AnadirCesta.el());
        theActorInTheSpotlight().should(seeThat(ValidacionAnadirCesta.es()));
    }
}
