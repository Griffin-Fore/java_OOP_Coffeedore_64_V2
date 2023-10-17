import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args){

    // Items
        Item mocha = new Item("mocha", 4.50);

        Item latte = new Item("latte", 4.00);

        Item dripCoffee = new Item();
        dripCoffee.setName("drip coffee");
        dripCoffee.setPrice(3.00);

        Item cappucino = new Item();
        cappucino.setName("cappuccino");
        cappucino.setPrice(3.50);

    // Orders
        Order order1 = new Order();
        order1.setName("Cindhuri");
        order1.setReadyStatus(true);
        order1.addItem(mocha);
        order1.addItem(latte);
        order1.getOrderTotal();

        Order order2 = new Order();
        order2.setName("Jimmy");
        order2.setReadyStatus(false);
        order2.addItem(dripCoffee);
        order2.addItem(cappucino);
        order2.getOrderTotal();

        Order order3 = new Order("Noah");
        order3.setReadyStatus(false);
        order3.addItem(mocha);
        order3.addItem(dripCoffee);
        order3.getOrderTotal();

        Order order4 = new Order("Sam");
        order4.setReadyStatus(false);
        order4.addItem(latte);
        order4.addItem(cappucino);
        order4.getOrderTotal();

        Order order5 = new Order("Will");
        order5.setReadyStatus(true);
        order5.addItem(latte);
        order5.addItem(latte);
        order5.addItem(latte);
        order5.getOrderTotal();

        System.out.println(order1.getStatusMessage());
        System.out.println(order2.getStatusMessage());
        System.out.println(order1.getOrderTotal());
        System.out.println(order3.getOrderTotal());

        System.out.println(order1.display());
        System.out.println(order2.display());
        System.out.println(order3.display());
        System.out.println(order4.display());
        System.out.println(order5.display());
    }
}