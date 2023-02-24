import java.util.ArrayList;
public class HotDrinkVendingMachine  implements VendingMachine{

    private ArrayList<HotDrink>  good;

    public HotDrinkVendingMachine(ArrayList<HotDrink>  goods){
        this.good = goods;
    }

    @Override
    public HotDrink addProduct(HotDrink name) {
        this.good.add(name);}

    @Override
    public HotDrink getProductByName(String name, double volume, double temperature) {
        for (HotDrink el: this.good) {
            if (el instanceof HotDrink){
                HotDrink product;
                HotDrink ht = (HotDrink) product; 
            }
        }
        return null;
    }
    
}
