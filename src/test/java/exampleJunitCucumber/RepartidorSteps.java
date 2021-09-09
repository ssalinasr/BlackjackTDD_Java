package exampleJunitCucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RepartidorSteps {
	
	private Repartidor rep = new Repartidor();
	
	@Given("^una mano \"([^\"]*)\"$")
	public void una_mano(String mano) throws Throwable{
		rep.asignar_mano(mano);
	}
	
	@When("^el repartidor sume las cartas$")
	public void el_repartidor_sume_las_cartas() throws Throwable{
		rep.suma_mano = rep.suma_mano();
	}
	
	@Then("^el valor (\\d+) correcto$")
	public void el_valor_es_correcto(int valor) throws Throwable{
		assert rep.suma_mano == valor;
	}
	
	}
