/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder_Factory;


public class Manager  extends Person implements IManageEmployees{

    public Manager(){
    }
    
    public Manager(String name) {
        super(name);
    }

    
    @Override
    public String getEmployee() {
           return this.getName();
    }
    
}
