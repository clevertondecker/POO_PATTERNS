package Decorator_Visitor;


public class Tester {

	public static void main(String[] args) {
		
		Sorvete sorvete = SorveteNapolitano.getInstance();
		
		sorvete.setNome("Sorvete do gordao");
		sorvete = new Creme(sorvete);
		sorvete = new Morango(sorvete);
		sorvete = new Chocolate(sorvete);
		
		
		
		System.out.println(" Quantidade de Bolas :  " + 
				sorvete.getQuantidadeBolas()+ "\r\n" + " preço : " +
				sorvete.getPreco());

	}

}
