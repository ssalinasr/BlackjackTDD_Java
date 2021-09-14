package exampleJunitCucumber;

import java.util.ArrayList;

public class Repartidor {

	public ArrayList<String> mano;
	public int suma_mano;
	
	public Repartidor() {
		this.mano = new ArrayList<String>();
		this.suma_mano = 0;
	}
	
	public void asignar_mano(String mano) {
		
		String[] splitted = mano.split(",");
		for(String s: splitted) {
			this.mano.add(s);
		}
		
		
	}
	
	public boolean tiene_as() {
		for(String c: this.mano) {
			if(c.equals("A")) {
				return true;
			}
		}
		return false;
	}
	
	public int suma_mano() {
		int valor = 0;
		for(String c: this.mano) {
			valor += this.valor_carta(c);
			if(this.tiene_as() && valor <= 11) {
				valor += 10;
			}
		}
		
		this.suma_mano = valor;
		return valor;
	}
	
	public int valor_carta(String carta) {
		if(carta.equals("J") || carta.equals("Q") || carta.equals("K")) {
			return 10;
		}
		else if(carta.equals("A")) {
			return 1;
		}
		else {
			return Integer.parseInt(carta);
		}
		
		
	}
	
	
	
}
