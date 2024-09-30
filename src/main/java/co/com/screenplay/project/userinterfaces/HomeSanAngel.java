package co.com.screenplay.project.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomeSanAngel {

    public static final Target PRODUCTO_UNO_FLORES_DESTELLOS =
            Target.the("Flores destellos").
                    locatedBy("//body/div[@id='primary']/main[@id='main']/article[@id='post-4492']/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[2]/img[1]");

    public static final Target PRODUCTO_DOS_FLORES_PRESENTE =
            Target.the("Flores evora").
                    locatedBy("//body/div[@id='primary']/main[@id='main']/article[@id='post-4492']/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]/img[1]");

    public static final Target BOTON_HOME =
            Target.the("Ir al Home").
                    locatedBy("//body[1]/div[1]/header[1]/div[2]/div[1]/a[1]/img[1]");
}
