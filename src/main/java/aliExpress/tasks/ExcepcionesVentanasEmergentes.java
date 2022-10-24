package aliExpress.tasks;

import aliExpress.tasks.excepcionesVentanasEmergentes.CerrarDescuento;
import aliExpress.tasks.excepcionesVentanasEmergentes.CerrarIniciarSesion;
import aliExpress.tasks.excepcionesVentanasEmergentes.CerrarSuscribete;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class ExcepcionesVentanasEmergentes implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                CerrarSuscribete.el(),
                CerrarDescuento.el(),
                CerrarIniciarSesion.el())
        ;
    }

    public static ExcepcionesVentanasEmergentes el() {
        return Instrumented.instanceOf(ExcepcionesVentanasEmergentes.class).withProperties();
    }
}
