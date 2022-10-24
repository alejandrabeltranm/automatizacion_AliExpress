package aliExpress.tasks.excepcionesVentanasEmergentes;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;

import static aliExpress.userinterfaces.AliExpress.*;

public class CerrarDescuento implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Check.whether(BTN_CERRAR_DESCUENTO.resolveFor(actor).isEnabled()).andIfSo(Click.on(BTN_CERRAR_DESCUENTO)));
    }

    public static CerrarDescuento el() {
        return Instrumented.instanceOf(CerrarDescuento.class).withProperties();
    }
}
