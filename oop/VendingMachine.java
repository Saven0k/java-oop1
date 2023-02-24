import java.util.ArrayList;
public interface VendingMachine<T>{

    public T addProduct(T name);
    
    public T getProductByName(String name);

        // for (Product el: goods) {
        //     if(el.getName().equals(name)) return el;
        // }
        // return null;
    

}
