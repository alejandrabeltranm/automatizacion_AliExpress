package aliExpress.tasks.excepcionesValidaciones;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static aliExpress.userinterfaces.AliExpress.*;

public class UltimasNovedades implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
               Click.on(LBL_ULTIMAS_NOVEDADES));
    }

    public static UltimasNovedades el() {
        return Instrumented.instanceOf(UltimasNovedades.class).withProperties();
    }
}
