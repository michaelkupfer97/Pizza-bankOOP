package semester2.lab1.HW1.ex1pizza;
// Assignment: 1
// Author: Michael Kupfer, ID: 209493246
import java.util.Arrays;
import java.util.Objects;

/**
 * class that represents the prosece of ordering pizza
 */
public class PizzaOrder {
    private String FirstName;
    private String LastName;
    private static final int MAXPIZZAS=3;
    private Pizza [] pizzas;

    /**
     * builder of the order
     * @param Fn the first name of customer
     * @param Ln last name of customer.
     */
    public PizzaOrder (String Fn,String Ln){
        this.FirstName=Fn;
        this.LastName=Ln;
        this.pizzas=new Pizza[MAXPIZZAS];
    }
    public String getFirstName() {
        return FirstName;
    }
    public String getLastName() {
        return LastName;
    }
    public void setFirstName(String firstName) {
        FirstName = firstName;
    }
    public void setLastName(String lastName) {
        LastName = lastName;
    }

    /**
     * to string of the order -customer name and pizzas.
     * @return the oeder
     */
    @Override
    public String toString() {
        return "PizzaOrder{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", pizzas=" + Arrays.toString(pizzas) +
                '}';
    }

    /**
     * check if 2 orders are the smae
     * @param o one of the orders user want to check
     * @return true for same' if not return false.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PizzaOrder that = (PizzaOrder) o;
        return Objects.equals(FirstName, that.FirstName) && Objects.equals(LastName, that.LastName) && Arrays.equals(pizzas, that.pizzas);
    }

    /**
     * add pizza to clients order and if he has 3 pizzas in array already so not adding.
     * @param size the size of the new pizza client want to add
     * @param extra extra cheese topping
     * @param olive olive topping
     * @param onion onion topping
     */
    public void addPizza(int size,boolean extra,boolean olive,boolean onion){
        for (int i=0;i<MAXPIZZAS;i++)
            if (this.pizzas[i]==null){
                this.pizzas[i]=new Pizza(size,extra,olive,onion);
                return;
            }
    }

    /**
     * calculate the total cost of the order. uses for that check every pizza in array and use the calc method from Pizza class.
     * @return the total cost of the order.
     */
    public int calcTotal() {
        int Total = 0;
        for (int i = 0; i < MAXPIZZAS; i++) {
            if (pizzas[i] != null) {
                Total += pizzas[i].calcCost();
            }
        }
        return Total;
    }

    /**
     * print the clients name, the pizzas he ordered and their prices, and the total cost of the order.
     */
    public void tab(){
        System.out.println("client name:"+this.FirstName+" "+this.LastName);
        System.out.println("the pizza in the order: ");
        for (int i=0; i<MAXPIZZAS;i++){
            if(pizzas[i]!=null) System.out.println("pizza "+(i+1)+':'+'\''+
                    pizzas[i].toString()+'\''+
                    "the price is: "+pizzas[i].calcCost());
        }
        System.out.println("==========================");
        System.out.println("Total cost of the order is: "+calcTotal());
        System.out.println("");
    }
}
