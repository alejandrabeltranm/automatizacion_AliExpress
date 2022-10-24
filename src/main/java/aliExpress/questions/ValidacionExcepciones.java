package aliExpress.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.questions.Text;
import static aliExpress.userinterfaces.AliExpress.*;

public class ValidacionExcepciones implements Question<String> {

    public static ValidacionExcepciones es() {
        return new ValidacionExcepciones();
    }

    @Override
    public String answeredBy(Actor actor) {
        Scroll.to(LBL_VALIDACION_EXCEPCIONES);
        return Text.of(LBL_VALIDACION_EXCEPCIONES).viewedBy(actor).asString();
    }
}
