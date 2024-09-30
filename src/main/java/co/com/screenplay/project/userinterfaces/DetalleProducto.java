package co.com.screenplay.project.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class DetalleProducto {

    private DetalleProducto() {
    }

    public static final Target CANTIDAD_PRODUCTO=
            Target.the("Cantidad de productos a añadir").
                    locatedBy("//input[@class='input-text qty text']");

    public static final Target BOTON_AGREGAR_CARRITO =
            Target.the("Añadir al carrito los productos").
                    locatedBy("//button[contains(text(),'Añadir al carrito')]");

}
