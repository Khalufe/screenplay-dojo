package runner;

public class InicioSesion {

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/inicio_sesion.feature",
glue = {"com.cedaniel200.screenplay.dojo.stepdefinition"}, snippets = SnippetType.CAMELCASE)
	 

}
