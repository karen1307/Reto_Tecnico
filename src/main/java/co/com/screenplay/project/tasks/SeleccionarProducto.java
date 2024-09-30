package co.com.screenplay.project.tasks;

import co.com.screenplay.project.interactions.ClickeaSobre;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.screenplay.project.userinterfaces.DetalleProducto.*;
import static co.com.screenplay.project.userinterfaces.HomeSanAngel.PRODUCTO_UNO_FLORES_DESTELLOS;

public class SeleccionarProducto implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ClickeaSobre.el(PRODUCTO_UNO_FLORES_DESTELLOS));
        actor.attemptsTo(Enter.theValue("2").into(CANTIDAD_PRODUCTO));
        actor.attemptsTo(ClickeaSobre.el(BOTON_AGREGAR_CARRITO));
    }

    public static SeleccionarProducto primerProducto(){
        return Tasks.instrumented(SeleccionarProducto.class);
    }
}
