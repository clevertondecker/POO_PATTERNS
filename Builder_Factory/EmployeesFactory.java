package Builder_Factory;

import java.util.ArrayList;
import java.util.List;

public class EmployeesFactory {

     public IManageEmployees getCargo(String tipo) {
        IManageEmployees cargo = null;

        if (tipo.equalsIgnoreCase("Salesperson")) {
            cargo = new SalesPerson("joao Silva");
        } else if (tipo.equalsIgnoreCase("Manager")) {
            cargo = new Manager("Gilberto Fausto");
        }
        
        return cargo;
    }

   
    
}
