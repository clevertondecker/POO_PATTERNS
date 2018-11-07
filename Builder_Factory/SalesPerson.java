
package Builder_Factory;


public class SalesPerson extends Person implements IManageEmployees {

    
    public SalesPerson(String name) {
        super(name);
    }
    

    @Override
    public String getEmployee() {
        return this.getName();
    }
        
    
}
