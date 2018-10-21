package Builder_Factory;

import java.util.ArrayList;
import java.util.List;

public class Market {

    String eggs;
    String rice;
    String beans;
    String beef;
    String product;
    String salesperson;
    
    public List produtcList = new ArrayList();

   
    public Market(String product) {
        this.addtoCart(product);
    }

    public void addtoCart(String product) {
        this.produtcList.add(product);
    }

    public String getEggs() {
        return eggs;
    }

    public void setEggs(String eggs) {
        this.eggs = eggs;
    }

    public String getRice() {
        return rice;
    }

    public void setRice(String rice) {
        this.rice = rice;
    }

    public String getBeans() {
        return beans;
    }

    public void setBeans(String beans) {
        this.beans = beans;
    }

    public String getBeef() {
        return beef;
    }

    public void setBeef(String beef) {
        this.beef = beef;
    }

    public List getProdutcList() {
        return produtcList;
    }

    public void setProdutcList(List produtcList) {
        this.produtcList = produtcList;
    }

    @Override
    public String toString() {
        return "Market{" + "eggs=" + eggs + ", rice=" + rice + ", beans=" + beans + ", beef=" + beef + '}';
    }

  

    
    
}
