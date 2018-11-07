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
public class Tester {

    public static void main(String[] args) {

        Automovel esportivo = new Automovel("Vermelho", "Punto");
        Automovel sedan = new Automovel("branco", "corsa");

        Espotivos punto = new Espotivos();
        punto.setChassi("238232-3");
        punto.setAutomovel(esportivo);

        Sedan corsa = new Sedan();
        corsa.setChassi("99977-4");
        corsa.setAutomovel(sedan);

        System.out.println(punto.getAutomovel().getMarca());
        System.out.println(punto.getAutomovel().getCor());

        System.out.println(corsa.getAutomovel().getMarca());
        System.out.println(corsa.getAutomovel().getCor());

    }

}
