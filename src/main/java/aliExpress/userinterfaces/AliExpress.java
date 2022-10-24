package aliExpress.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AliExpress {
    // VENTANAS EMERGENTES
    public static Target BTN_CERRAR_SUSCRIBETE = Target.the("Cerrar opcion Suscribete").locatedBy("//*[@class='_24EHh']");
    public static Target BTN_CERRAR_DESCUENTO = Target.the("Cerrar opcion Descuento").locatedBy("//*[@src='https://img.alicdn.com/tfs/TB1a.Oge_M11u4jSZPxXXahcXXa-48-48.png']");
    public static Target BTN_CERRAR_INICIAR_SESION = Target.the("Cerrar opcion Iniciar sesion").locatedBy("//*[@src='https://ae01.alicdn.com/kf/S512358c96d044cc1a674e39be055db98O/24x24.png']");

    // PRODUCTO
    public static Target LBL_ULTIMAS_NOVEDADES = Target.the("Selecciona la opción de todos los productos").locatedBy("//*[@class='_1r8bG']");
    public static Target LBL_PRODUCTO = Target.the("Selecciona el producto").locatedBy("//*[@id='root']/div/div/div/div/a[4]/div/img");
    public static Target BTN_ANADIR_CESTA = Target.the("Se añade el producto a la cesta").locatedBy("//*[@class='product-action']/span/button[(text() = 'Añadir a la cesta')]");

    // VALIDACIONES
    public static Target LBL_VALIDACION_EXCEPCIONES = Target.the("Se valida al momento de cerrar todas las excepciones").locatedBy("//*[@class='logo-base']");
    public static Target LBL_ENVIO_PAIS = Target.the("Se valida que exista el pais Colombia").locatedBy("//*[@class='product-delivery']/span[contains(text(),'Colombia')]");
    public static Target LBL_ANADIR_CESTA = Target.the("Se valida mensaje que se añadio a la cesta").locatedBy("//body/div/div/div/div/div/div[contains(text(),'Se ha añadido un nuevo artículo a tu Cesta.')]");
}
