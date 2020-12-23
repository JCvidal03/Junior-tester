package wordpress.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaLogin {
    public static Target USERNAME = Target.the("Ingresa Usuario").located(By.cssSelector("#user_login"));
    public  static Target PASSWORD = Target.the("Ingresa contraseña").located(By.cssSelector("#user_pass"));
    public  static Target BOTON_SIGN_IN = Target.the("Boton de Sidn in").located(By.cssSelector("#wp-submit"));

}
