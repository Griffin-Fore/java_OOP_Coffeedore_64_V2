import java.text.NumberFormat;
import java.util.ArrayList;
public class CoffeeKiosk {
    private ArrayList<Item> menu;
    private ArrayList<Order> orders;

    public CoffeeKiosk() {
        this.menu = new ArrayList<Item>();
        this.orders = new ArrayList<Order>();
    }

    public void addMenuItem(String name, double price) {
        Item newItem = new Item(name, price);
        this.menu.add(newItem);
        newItem.setIndex(this.menu.size());
    }

    public void displayMenu() {
        System.out.println("Kiosk Menu");
        for(int i = 0; i < menu.size(); i++){
            NumberFormat formatter = NumberFormat.getCurrencyInstance();
            System.out.println(i + " " + menu.get(i).getName() + " -- " + formatter.format(menu.get(i).getPrice()));
        }
    }
    public void newOrder() {
        // create a new order instance and add it to the array.
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();
        Order newOrder =  new Order(name);
        // this.displayMenu();
        
        System.out.println("Please enter a menu item index or q to quit");
        String itemNumberString = System.console().readLine();
        while(!itemNumberString.equals("q")) {
            int itemNumber = Integer.parseInt(itemNumberString);
            // how to select which menu
            // if menu contains this index,
            // add selected menu item onto current order
            // if(itemNumber.equals(0)) {
                // newOrder.addItem(this.menu.get(itemNumber));
            // }
            // newOrder.addItem(menu.get(itemNumber));
            try {
                Item thisItem = menu.get(itemNumber);
                System.out.println("-----" + thisItem.getName());
                newOrder.addItem(thisItem);
            }
            catch(IndexOutOfBoundsException error) {
                System.out.println("Invalid selection");
            }
            catch(NumberFormatException num) {
                System.out.println("Invalid selection");
            }
            itemNumberString = System.console().readLine();
        }
        newOrder.display();
    }

}
