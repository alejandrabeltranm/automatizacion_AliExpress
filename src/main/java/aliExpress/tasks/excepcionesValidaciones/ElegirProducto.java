package aliExpress.tasks.excepcionesValidaciones;

import aliExpress.interactions.SaltoDePagina;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static aliExpress.userinterfaces.AliExpress.*;

public class ElegirProducto implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
               Click.on(LBL_PRODUCTO),
                SaltoDePagina.salto());
    }

    public static ElegirProducto el() {
        return Instrumented.instanceOf(ElegirProducto.class).withProperties();
    }
}
