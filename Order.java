import java.util.ArrayList;
public class Order {
    private String name;
    private boolean ready;
    private ArrayList<Item> items = new ArrayList<Item>();

    public Order() {
        this.name = "Guest";
        this.items = new ArrayList<Item>();
    }

    public Order(String name) {
        this.name = name;
        this.items = new ArrayList<Item>();
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public boolean isReady() {
        return this.ready;
    }

    public ArrayList<Item> listItems() {
        return this.items;
    }

    // Setters
    public void setName(String name){
        this.name = name;
    }

    public void setReadyStatus(boolean readyStatus) {
        ready = readyStatus;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public String getStatusMessage() {
        if(this.ready == true){
            return "Your order is ready";
        }
        else{
            return "Thank you for waiting. Your order will be ready soon";
        }
    }
    // add up all to prices from the items
    public double getOrderTotal(){
        double total = 0.00;
        for(int i = 0; i < this.items.size(); i ++) {
            Item anItem = this.items.get(i);
            double price = anItem.getPrice();
            total += price;
        }
        return total;
    }
    // display all the items and their names and prices
    public String display() {
        System.out.println("Customer name: " + this.name);
        for(int i = 0; i < this.items.size(); i++){
            Item thisItem = this.items.get(i);
            String itemName = thisItem.getName();
            double itemPrice = thisItem.getPrice();
            System.out.println(itemName + " - $" + itemPrice);
        }
        return "Total: $" + this.getOrderTotal();
    }

}
