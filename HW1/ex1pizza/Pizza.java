package semester2.lab1.HW1.ex1pizza;
// Assignment: 1
// Author: Michael Kupfer, ID: 209493246
/**
 * a class representing pizza.
 */

public class Pizza {
    /**
     size represents the size of the pizza and get value of 0/1/2. 0- small, 1-medium, 2- large.
     */
    private int size;
    /**
     * extra is a boolean variable and represents if the pizza have extra cheese topping on it.
     */
    private boolean extra;
    /**
     * olive is a boolean variable and represents if the pizza have olive topping on it.
     */
    private boolean olive;
    /**
     * onion is a boolean variable and represents if the pizza have onion topping on it.
     */
    private boolean onion;

    /**
     *creates a new pizza with specific size and type of toppings. get all data from user.
     * @param s int variable. is the size of the pizza (0/1/2).
     * @param extra1 boolean variable. tells if the pizza have extra cheese topping on it.
     * @param olive1 boolean variable. tells if the pizza have olive topping on it.
     * @param onion1 boolean variable. tells if the pizza have onion topping on it.
     */
    public Pizza(int s, boolean extra1, boolean olive1, boolean onion1){
        if(s!=0 && s !=1 && s!=2) this.size=0;
        else this.size=s;
        this.extra=extra1;
        this.olive=olive1;
        this.onion=onion1;
    }

    /**
     * create a new pizza with default variables. size 0- small, no toppings.
     */
    public Pizza(){
        this.size=0;
        this.extra=false;
        this.olive=false;
        this.onion=false;
    }

    /**
     * @param piz is the pizza the user want to copy. create new pizza with the same variables as piz has.
     */
    public Pizza(Pizza piz){
        this.size= piz.size;
        this.extra=piz.extra;
        this.olive=piz.olive;
        this.onion=piz.onion;
    }

    /**
     * @param piz is the pizza the user want to know the size of it.
     * @return to the user the size in int 0/1/2.
     */
    public int getsize(Pizza piz){
        return this.size;
    }

    /**
     * @param piz is the pizza the user want to know if it has extra cheese on it.
     * @return to the user boolean varible true/false if it has extra cheese on it.
     */
    public boolean getExtra(Pizza piz){
        return this.extra;
    }

    /**
     * @param piz is the pizza the user want to know about it olive topping.
     * @return boolean if piz (the pizza the user sent) has olive topping on it.
     */
    public boolean getOlive(Pizza piz){
        return this.olive;
    }

    /**
     * @param piz is the pizza user want to know about its onion topping.
     * @return boolean if piz (the pizza the user sent(has onion topping on it.
     */
    public boolean getOnion(Pizza piz){
        return this.onion;
    }

    /**
     * let the user set the pizza size.
     * @param size1 int- the size the user want to set the pizza to.
     */
    public void setSize(int size1){
        this.size=size1;
    }

    /**
     * let the user set the extra cheese topping.
     * @param extra1 boolean - if the pizza has extra cheese topping on it.
     */
    public void setExtra(boolean extra1){
        this.extra=extra1;
    }

    /**
     * let the user set the olive topping.
     * @param olive1 boolean - if the pizza has olive topping on it.
     */
    public void setOlive(boolean olive1){
        this.olive=olive1;
    }

    /**
     * let the user set the onion topping.
     * @param onion1 boolean - if the pizza has onion topping on it.
     */
    public void setOnion(boolean onion1){
        this.onion=onion1;
    }

    /**
     * method that gets pizza and calculate the cost of it. size (35/45/60), and every topping cost:
     * 6 for small pizza
     * 7 for medium pizza
     * 9 for large pizza
     * @return the cost of the pizza
     */
    public int calcCost (){
        int cost=0;
        if (this.size==0){
            cost+=35;
            if (this.extra)cost+=6;
            if (this.olive)cost+=6;
            if (this.onion)cost+=6;
            return cost;
        }
        if (this.size==1){
            cost+=45;
            if (this.extra)cost+=7;
            if (this.olive)cost+=7;
            if (this.onion)cost+=7;
            return cost;
        }
        if (this.size==2){
            cost+=60;
            if (this.extra)cost+=9;
            if (this.olive)cost+=9;
            if (this.onion)cost+=9;
            return cost;
        }
        return cost;
    }

    /**
     * to string about the pizza
     * @return return string varible the represents the size and toppings.
     */
    public String toString() {
        int check=0;
        String str="Pizza size - ";
        if (this.size==0) str+="Small";
        else if (this.size==1)str+="Medium";
        else if (this.size==2)str+="Large";
        if (this.extra){
            str+="+ extra cheese topping";
            check++;
        }
        if (this.olive){
            str+="+ olive topping";
            check++;
        }
        if (this.onion){
            str+="+ onion topping";
            check++;
        }
        if (check==0)str+="(with no toppings)";
        return str;
    }

    /**
     * check if 2 pizzas are equale in the size and toppings.
     * @param p1 the pizza we compare
     * @return true if they are the same and if not return false.
     */
    public boolean equals(Pizza p1){
        if(this.size!=p1.size) return false;
        if (this.olive!= p1.olive) return false;
        if (this.extra!=p1.extra) return false;
        if (this.onion!=p1.onion)return false;
        return true;
    }
}
