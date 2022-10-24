package aliExpress.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

public class SaltoDePagina implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        driver.switchTo().defaultContent();
        driver.switchTo().window(driver.getWindowHandle());
        Object[] parentHandle = driver.getWindowHandles().toArray();
        driver.switchTo().window((String) parentHandle[1]);
        driver.manage().window().maximize();
    }

    public static SaltoDePagina salto(){
        return Tasks.instrumented(SaltoDePagina.class);
    }
}
