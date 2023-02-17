import java.util.ArrayList;
public class DrinkMachine extends VendingMachine{
    private ArrayList<Drink> drinkList;

    public DrinkMachine(ArrayList<Product> goods){
        super(goods);
        drinkList = new ArrayList<Drink>();
    }

    public void addDrink(Drink dr){
        drinkList.add(dr);
    }
    public Product getProductByName(String name){
        for (Drink el: drinkList) {
            if(el.getName().equals(name)) return el;
        }
        return null;
    }


}
