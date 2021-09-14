package exampleJunitCucumber;

import org.junit.Test;

public class Pruebas_Unitarias {

	Repartidor rep = new Repartidor();

	@Test
	public void test_as_cierto() {
		rep.asignar_mano("5,8,A");
		assert rep.tiene_as() == true;		
	}
	
	@Test
	public void test_as_falso() {
		rep.asignar_mano("7,1,K");
		assert rep.tiene_as() == false;		
	}
	
	@Test
	public void test_carta_figura() {
		int valor = rep.valor_carta("K");
		assert valor == 10;
	}
	
	@Test
	public void test_carta_numero() {
		int valor = rep.valor_carta("5");
		assert valor == 5;
	}
	
	@Test
	public void test_ventiuna() {
		rep.asignar_mano("A,J");
		rep.suma_mano = rep.suma_mano();
		assert rep.suma_mano == 21;
	}
}
