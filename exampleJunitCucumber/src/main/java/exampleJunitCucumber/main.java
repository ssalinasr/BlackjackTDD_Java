package exampleJunitCucumber;

public class main {
	
	public static void main(String[] args) {
		Repartidor repartidor = new Repartidor();
		repartidor.asignar_mano("A");
		System.out.println(repartidor.suma_mano());
	}

}
