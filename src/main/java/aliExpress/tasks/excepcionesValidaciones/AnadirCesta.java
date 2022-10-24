package aliExpress.tasks.excepcionesValidaciones;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static aliExpress.userinterfaces.AliExpress.*;

public class AnadirCesta implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_ANADIR_CESTA));
    }

    public static AnadirCesta el() {
        return Instrumented.instanceOf(AnadirCesta.class).withProperties();
    }
}
