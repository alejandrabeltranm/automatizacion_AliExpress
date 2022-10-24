package aliExpress.questions;

import aliExpress.interactions.Espera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.questions.Text;
import org.openqa.selenium.WebDriver;
import java.util.List;
import static jxl.biff.BaseCellFeatures.logger;
import static aliExpress.userinterfaces.AliExpress.*;

public class ValidacionEnvioPais implements Question<Boolean> {

    List<String> pais;
    public WebDriver driver;

    public ValidacionEnvioPais(List<String> pais) {
        this.pais = pais;
    }

    public static ValidacionEnvioPais el(List<String> pais) {
        return new ValidacionEnvioPais(pais);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(Scroll.to(LBL_ENVIO_PAIS));
        String envio = Text.of(LBL_ENVIO_PAIS).viewedBy(actor).asString();

        if (envio.equals(pais.get(1))) {
            Espera.unMomento(2000);
            logger.info("Se puede realizar el envio a Colombia");
        } else {
            logger.error("No se puede realizar el envio a Colombia");
            if (driver != null) {
                driver.quit();
            }
        }
        return true;
    }
}
