package Decorator_Visitor;


public class SorveteNapolitano extends Sorvete{

	private static SorveteNapolitano napolitano;
	
	private SorveteNapolitano() {}
	
	@Override
	public int getQuantidadeBolas() {
		return 0;
	}

	@Override
	public double getPreco() {
		return 2;
	}

	public static SorveteNapolitano getInstance() {
		if(napolitano == null) {
			napolitano = new SorveteNapolitano();
		}
		return napolitano;
	}
}
