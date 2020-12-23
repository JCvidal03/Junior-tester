package wordpress;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import wordpress.acciones.Decidido;
import wordpress.acciones.IngresarCon;
import wordpress.preguntas.LaPaginaLogIn;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

@RunWith(SerenityRunner.class)
public class CuandoUsuarioSeLoguea {

    Actor actor;
    @Managed
    WebDriver navegador;

    @Before
    public void  prepararEscenario(){
        actor = Actor.named("Jhon");

        actor.can(BrowseTheWeb.with(navegador));
    }
    @Test
    public  void  ingresarLogInCorrectamente(){
        actor.has(Decidido.ingresarConUsuarioYContraseña());

        actor.attemptsTo(IngresarCon.usuario("opensourcecms").contraseña("opensourcecms"));

        actor.should(
                seeThat("Subtitulo de pagina Log In", LaPaginaLogIn.subtitulo(),
                        equalTo("Welcome to WordPress!"))
        );
    }

}
