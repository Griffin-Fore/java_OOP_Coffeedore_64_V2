public class Item {
    private String name;
    private double price;

    // constructors
    public Item(){
        
    }
    public Item(String name, double price){
        this.name = name;
        this.price = price;
    }

    // Getters
    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    // and setters
    public void setName(String name){
        this.name = name;
    }

    public void setPrice(double price){
        this.price = price;
    }

}
