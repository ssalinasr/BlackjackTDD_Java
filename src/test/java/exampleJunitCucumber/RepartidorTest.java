package exampleJunitCucumber;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class RepartidorTest {
	
	private Repartidor rep = new Repartidor();
	
	public void test_as_cierto() {
		rep.asignar_mano("5,8,A");
		assert rep.tiene_as() == true;		
	}

	public void test_as_falso() {
		rep.asignar_mano("7,1,K");
		assert rep.tiene_as() == false;		
	}
	
	public void test_carta_figura() {
		int valor = rep.valor_carta("K");
		assert valor == 10;
	}
	
	public void test_carta_numero() {
		int valor = rep.valor_carta("5");
		assert valor == 5;
	}
	
	public void test_ventiuna() {
		rep.asignar_mano("A,J");
		rep.suma_mano = rep.suma_mano();
		assert rep.suma_mano == 21;
	}

}
