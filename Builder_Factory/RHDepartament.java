/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder_Factory;


public class RHDepartament {
    
    
    private EmployeesFactory cargoFactory;
    
    public RHDepartament(EmployeesFactory cf) {
        this.cargoFactory = cf;
    }
    
    public IManageEmployees hire(String type) {
        return cargoFactory.getCargo(type);
    }
    
}
