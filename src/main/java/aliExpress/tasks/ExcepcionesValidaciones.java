package aliExpress.tasks;

import aliExpress.tasks.excepcionesValidaciones.ElegirProducto;
import aliExpress.tasks.excepcionesValidaciones.UltimasNovedades;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class ExcepcionesValidaciones implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                UltimasNovedades.el(),
                ElegirProducto.el())
        ;
    }

    public static ExcepcionesValidaciones el() {
        return Instrumented.instanceOf(ExcepcionesValidaciones.class).withProperties();
    }
}
