import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Apple", 3),
            new Drink("cocacola", 5),
            new Product("cheese", 7),
            new Drink("shveps", 9),
            new HotDrink("tea", 5, 30),
            new HotDrink("Coffi", 7, 55));

        for (Product pr : products) {
            pr.consume();
        }
        
        
        
    }
}
