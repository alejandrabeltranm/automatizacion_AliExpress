package aliExpress.interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import java.awt.*;
import java.awt.event.KeyEvent;

public class DesplazarseAbajo implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_END);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_END);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static Performable inPage(){
        return Instrumented.instanceOf(DesplazarseAbajo.class).withProperties();
    }
}
