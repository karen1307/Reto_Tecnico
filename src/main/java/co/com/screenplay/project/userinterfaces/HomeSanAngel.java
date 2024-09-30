package co.com.screenplay.project.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomeSanAngel {

    private HomeSanAngel() {
    }

    public static final Target PRODUCTO_UNO_FLORES_DESTELLOS =
            Target.the("Flores destellos").
                    locatedBy("(//h2[@class='woocommerce-loop-product__title' and contains(text(), 'Destellos')])[1]");

    public static final Target PRODUCTO_DOS_FLORES_PRESENTE =
            Target.the("Flores evora").
                    locatedBy("//h2[@class='woocommerce-loop-product__title' and contains(text(), 'Évora – 24 rosas')]");

    public static final Target BOTON_HOME =
            Target.the("Ir al Home").
                    locatedBy("(//a[@class='navmenu__logo-link'])[1]");
}
