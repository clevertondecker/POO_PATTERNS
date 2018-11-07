/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder_Factory;

/**
 *
 * @author ton
 */
public class Tester {

    public static void main(String[] args) {

        //Factory -  Manager employee of market
        EmployeesFactory cf = new EmployeesFactory();

        RHDepartament rh = new RHDepartament(cf);

        IManageEmployees newEmployee = rh.hire("salesperson");
        // IManageEmployees newEmployee = rh.hire("manager");

        System.out.println(newEmployee.getEmployee());

        
        
        
        // Builder - Register products in the box
        Market productList = new Market("product");
        CashRegisterBuilder register = new CashRegisterBuilder(productList);

        System.out.println("Atendent: " + newEmployee.getEmployee());
        System.out.println("Products: ");

        register
                .addBeans("Beans Santa Clara")
                .addEggs("Eggs ChickenCrazy")
                .addBeef("Angus")
                .addRice("Colonial Rice");

        System.out.println(productList);

    }

}
