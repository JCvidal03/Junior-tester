package wordpress.preguntas;


import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import wordpress.ui.PaginaMicuenta;


public class LaPaginaLogIn {
    public static Question <String> subtitulo(){
        return actor -> Text.of(PaginaMicuenta.SUBTITULO)
                .viewedBy(actor).asString();

    }
}
