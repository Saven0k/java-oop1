public class HotDrink extends Drink{
    private double temperature;


    HotDrink(String name, float price, double temperature){
       super(name,price);
       this.temperature = temperature;
    }
    public double getTemperature(){
        return temperature;
    } 
    public void consume(){
        System.out.println("Напиток выпит");
    };
}
