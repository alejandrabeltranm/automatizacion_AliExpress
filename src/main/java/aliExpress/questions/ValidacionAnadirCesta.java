package aliExpress.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import static aliExpress.userinterfaces.AliExpress.*;

public class ValidacionAnadirCesta implements Question<String> {

    public static ValidacionAnadirCesta es() {
        return new ValidacionAnadirCesta();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(LBL_ANADIR_CESTA).viewedBy(actor).asString();
    }
}
