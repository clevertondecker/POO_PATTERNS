package Strategy;


public class Testador {

	public static void main(String[] args) {
		GerenciaViajem gerencia = new GerenciaViajem(new DePe());
		gerencia.viajem();
		
		GerenciaViajem gerencia2 = new GerenciaViajem(new DeCarro());
		gerencia2.viajem();
		
		GerenciaViajem gerencia3 = new GerenciaViajem(new DeBicicleta());
		gerencia3.viajem();
		

	}

}
