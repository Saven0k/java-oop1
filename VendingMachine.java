import java.util.ArrayList;
public class VendingMachine {
    private ArrayList<Product>  goods;

    public VendingMachine(ArrayList<Product>  goods){
        this.goods = goods;
    }

    @Override
    public String toString(){   
        String g = "";
        return g;
    }
    public Product getProductByName(String name){
        for (Product el: goods) {
            if(el.getName().equals(name)) return el;
        }
        return null;
    }

    
}
