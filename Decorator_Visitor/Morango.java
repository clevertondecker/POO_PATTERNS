package Decorator_Visitor;


public class Morango extends SorveteSabor{
	
	public Morango(Sorvete sorvete) {
		super(sorvete);
	}

	@Override
	public int getQuantidadeBolas() {
		return 1+ this.getSorvete().getQuantidadeBolas();
	}

	@Override
	public double getPreco() {
		return 1.70 + this.getSorvete().getPreco();
	}

}
