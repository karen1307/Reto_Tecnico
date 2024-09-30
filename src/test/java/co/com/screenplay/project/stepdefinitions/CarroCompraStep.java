package co.com.screenplay.project.stepdefinitions;

import co.com.screenplay.project.questions.EstaVisible;
import co.com.screenplay.project.tasks.IrAlHome;
import co.com.screenplay.project.tasks.SeleccionarProducto;
import co.com.screenplay.project.tasks.SeleccionarSegundoProducto;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import org.hamcrest.Matchers;

import static co.com.screenplay.project.userinterfaces.FinalizarCompra.*;
import static co.com.screenplay.project.utils.Constantes.ACTOR;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
public class CarroCompraStep {

    @Cuando("seleccione el primer producto con su cantidad")
    public void seleccioneElPrimerProductoConSuCantidad() {
        theActorCalled(ACTOR).attemptsTo(SeleccionarProducto.primerProducto());
        theActorCalled(ACTOR).attemptsTo(IrAlHome.home());
    }
    @Cuando("seleccione el segundo producto con su cantidad")
    public void seleccioneElSegundoProductoConSuCantidad() {
        theActorCalled(ACTOR).attemptsTo(SeleccionarSegundoProducto.segundoProducto());
    }
    @Entonces("Visualizará los productos en el carrito de compras con sus cantidades")
    public void visualizaráLosProductosEnElCarritoDeComprasConSusCantidades() {
        theActorInTheSpotlight().should(
                seeThat(EstaVisible.elObjetivo(FINALIZAR_COMPRA),
                        Matchers.is(true))
        );
        theActorInTheSpotlight().should(
                seeThat(EstaVisible.elObjetivo(FINALIZAR_COMPRA_DESTELLOS),
                        Matchers.is(true))
        );
        theActorInTheSpotlight().should(
                seeThat(EstaVisible.elObjetivo(FINALIZAR_COMPRA_EVORA),
                        Matchers.is(true))
        );
    }

}
