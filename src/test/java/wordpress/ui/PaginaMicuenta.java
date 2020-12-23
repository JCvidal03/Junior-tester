package wordpress.ui;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaMicuenta {
    public static final Target SUBTITULO = Target.the("Subtitulo de la pagina Log In")
            .located(By.xpath("//h2[contains(text(),'Welcome to WordPress!"));
}
