package co.com.screenplay.project.tasks;

import co.com.screenplay.project.interactions.ClickeaSobre;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.screenplay.project.userinterfaces.DetalleProducto.BOTON_AGREGAR_CARRITO;
import static co.com.screenplay.project.userinterfaces.DetalleProducto.CANTIDAD_PRODUCTO;
import static co.com.screenplay.project.userinterfaces.HomeSanAngel.PRODUCTO_DOS_FLORES_PRESENTE;

public class SeleccionarSegundoProducto implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ClickeaSobre.el(PRODUCTO_DOS_FLORES_PRESENTE));
        actor.attemptsTo(Enter.theValue("5").into(CANTIDAD_PRODUCTO));
        actor.attemptsTo(ClickeaSobre.el(BOTON_AGREGAR_CARRITO));
    }

    public static SeleccionarSegundoProducto segundoProducto(){
        return Tasks.instrumented(SeleccionarSegundoProducto.class);
    }
}
