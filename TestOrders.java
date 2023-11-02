import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args){

        CoffeeKiosk kiosk1 = new CoffeeKiosk();

        kiosk1.addMenuItem("Latte",4.00);
        kiosk1.addMenuItem("Mocha", 5.00);
        kiosk1.addMenuItem("Ameericano", 1.00);
        kiosk1.displayMenu();

        kiosk1.newOrder();

    }
}