/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder_Factory;


public class CashRegisterBuilder {
    
    public Market market;
    public Person  functionary;
    
    
    
     public CashRegisterBuilder (Market product) {
        this.market = product;
    }
    
     public CashRegisterBuilder addSalesPerson(String name){
        market.setBeans(name);
        return this;
    }
     
    public CashRegisterBuilder addBeans(String product){
        market.setBeans(product);
        return this;
    }
    
    public CashRegisterBuilder addEggs(String product){
        market.setEggs(product);
        return this;
    }
    
    public CashRegisterBuilder addRice(String product){
        market.setRice(product);
        return this;
    }
    
    public CashRegisterBuilder addBeef(String product){
        market.setBeef(product);
        return this;
    }
}
