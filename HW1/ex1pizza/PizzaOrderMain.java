package semester2.lab1.HW1.ex1pizza;
// Assignment: 1
// Author: Michael Kupfer, ID: 209493246
public class PizzaOrderMain {
    public static void main(String[] args) {

        PizzaOrder order1 = new PizzaOrder("Michael", "Kupfer");
        order1.addPizza(0,true,false,true);
        order1.addPizza(1,true,false,false);
        PizzaOrder order2= new PizzaOrder("oleg","moraviov");
        order2.addPizza(2,true,true,true);
        order2.addPizza(2,true,true,true);
        order2.addPizza(2,true,true,true);
        order1.tab();
        order2.tab();
        PizzaOrder david1 = new PizzaOrder("David" , "kupfer");
        david1.

        if(order1.equals(order2))System.out.println("the orders is the same!");
        else System.out.println("the orders are NOT equal!!!!!");

    }


}
