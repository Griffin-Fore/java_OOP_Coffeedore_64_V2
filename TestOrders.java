import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args){

    // Items
        Item item1 = new Item();
        item1.name = "mocha";
        item1.price = 4.50;

        Item item2 = new Item();
        item2.name = "latte";
        item2.price = 4.00;

        Item item3 = new Item();
        item3.name = "drip coffee";
        item3.price = 3.00;

        Item item4 = new Item();
        item4.name = "cappuccino";
        item4.price = 3.50;

    // Orders
        Order order1 = new Order();
        order1.name =  "Cindhuri";
        order1.total = 0.00;
        order1.ready = false;
        order1.items.add(item1);
        order1.items.add(item2);
        for(Item item : order1.items){
            order1.total += item.price;
        }

        Order order2 = new Order();
        order2.name = "Jimmy";
        order2.total = 0.00;
        order2.ready = false;
        order2.items.add(item3);
        order2.items.add(item4);
        for(Item item : order2.items){
            order2.total += item.price;
        }
        System.out.println(order2.total);

        Order order3 = new Order();
        order3.name = "Noah";
        order3.total = 0.00;
        order3.ready = false;
        order3.items.add(item1);
        order3.items.add(item3);
        for(Item item : order3.items){
            order3.total += item.price;
        }

        Order order4 = new Order();
        order4.name = "Sam";
        order4.total = 0.00;
        order4.ready = false;
        order4.items.add(item2);
        order4.items.add(item4);
        for(Item item : order4.items){
            order4.total += item.price;
        }

        order2.items.add(item1);
        order2.total += item1.price;
        
        // System.out.println(order1);
        // System.out.println(order1.total);
        // System.out.println(item1.name);
        // System.out.println(item2.price);
        // System.out.println(order2.total);

        order3.items.add(item4);
        order3.total += item4.price;
        System.out.println("Order 3 total: " + order3.total);
        
        order4.items.add(item2);
        order4.total += item4.price;
        System.out.println("Order 4 total: " + order4.total);

        order1.ready = true;
        System.out.println("Order 1 ready status: " + order1.ready);

        order4.items.add(item2);
        order4.items.add(item2);
        order4.total += (item2.price * 2);
        System.out.println("Order 4 new total: " + order4.total);

        order2.ready = true;
        System.out.println("Order 2 ready status: " + order2.ready);
    }
}