import java.util.ArrayList;
import java.util.Collection;

public class DrinkMachine  extends Drink implements VendingMachine{
    private ArrayList<Drink> drinkList;

    public DrinkMachine(){
        drinkList = new ArrayList<Drink>();     
    }

    @Override
    public Drink getProductByName(String name) {
        for (Drink el: drinkList) {
            if(el.getName().equals(name)) return el;
        }
        return null;
    }


    @Override
    public Drink addProduct(Drink name){
        this.drinkList.add(name);
    }
}
