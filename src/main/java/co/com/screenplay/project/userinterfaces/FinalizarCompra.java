package co.com.screenplay.project.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class FinalizarCompra {

    private FinalizarCompra() {
    }

    public static final Target FINALIZAR_COMPRA=
            Target.the("Finalizar compra").
                    locatedBy("//h1[contains(text(),'Finalizar compra')]");

    public static final Target FINALIZAR_COMPRA_DESTELLOS=
            Target.the("Flores destellos en el carrito").
                    locatedBy("//div[contains(text(),'Destellos - Rojo')]");

    public static final Target FINALIZAR_COMPRA_EVORA=
            Target.the("Flores Evora en el carrito").
                    locatedBy("//div[contains(text(),'Évora - 24 rosas - Rojo')]");
}
