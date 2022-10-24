package aliExpress.stepsdefinitions;

import aliExpress.questions.ValidacionExcepciones;
import aliExpress.tasks.Abrir;
import aliExpress.tasks.ExcepcionesVentanasEmergentes;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ExcepcionesVentanasEmergentesStepDefinitions {

    @Dado("^que usuario quiere cerrar las excepciones de Ali Express$")
    public void queUsuarioQuiereCerrarLasExcepcionesDeAliExpress() {
        theActorInTheSpotlight().wasAbleTo(Abrir.app());
    }

    @Cuando("^realiza el cierre de ventanas emergentes$")
    public void realizaElCierreDeVentanasEmergentes() {
        theActorInTheSpotlight().attemptsTo(ExcepcionesVentanasEmergentes.el());
    }

    @Entonces("^se valida que se cierren correctamente$")
    public void seValidaQueSeCierrenCorrectamente() {
        theActorInTheSpotlight().should(seeThat(ValidacionExcepciones.es()));
    }
}
