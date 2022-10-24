package aliExpress.tasks.excepcionesVentanasEmergentes;

import aliExpress.interactions.DesplazarseAbajo;
import aliExpress.interactions.Espera;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import static aliExpress.userinterfaces.AliExpress.*;

public class CerrarIniciarSesion implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                DesplazarseAbajo.inPage(),
                Espera.unMomento(2000),
                Check.whether(BTN_CERRAR_INICIAR_SESION.resolveFor(actor).isEnabled()).andIfSo(Click.on(BTN_CERRAR_INICIAR_SESION)));
    }

    public static CerrarIniciarSesion el() {
        return Instrumented.instanceOf(CerrarIniciarSesion.class).withProperties();
    }
}
