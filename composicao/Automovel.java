/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicao;

/**
 *
 * @author ton
 */
public class Automovel {
    
    private String cor;
    private String marca;

    
    public Automovel(String cor, String marca) {
        this.cor = cor;
        this.marca = marca;
    }
    
    

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

   
    
    
    
}
