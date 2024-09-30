package co.com.screenplay.project.tasks;

import co.com.screenplay.project.interactions.ClickeaSobre;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static co.com.screenplay.project.userinterfaces.HomeSanAngel.BOTON_HOME;

public class IrAlHome implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ClickeaSobre.el(BOTON_HOME));

    }

    public static IrAlHome home(){
        return Tasks.instrumented(IrAlHome.class);
    }
}
