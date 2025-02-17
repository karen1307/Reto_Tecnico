package co.com.screenplay.project.hook;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static co.com.screenplay.project.utils.Constantes.WEB_URL_MAP;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirWeb implements Task {

    private final String URL;

    public AbrirWeb(String URL){
        this.URL = URL;
    }

    @Override
    @Step("{0} abrir navegador web")
    public <T extends Actor> void performAs (T actor) {
        actor.attemptsTo(Open.url(WEB_URL_MAP));
    }

    public static Performable navegaURL(String URL){
        return instrumented(AbrirWeb.class, URL);
    }

}
