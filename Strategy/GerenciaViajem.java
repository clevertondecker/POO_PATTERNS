/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;


public class GerenciaViajem {
 

	
	private Locomocao locomocao;
	
	public GerenciaViajem(Locomocao locomocao) {
		this.locomocao = locomocao;
	}

	public void viajem() {
		this.locomocao.locomocao();
	}
}


