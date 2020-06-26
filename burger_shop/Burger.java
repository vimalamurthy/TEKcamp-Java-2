package burger_shop;

import java.util.ArrayList;
import java.util.HashMap;

public class Burger {
    String name;
    String breadType;
    String meat;
    double baseBurgerPrice;

    public Burger(String breadType, String meat) {
        this.name = "Regular burger";
        this.breadType = breadType;
        this.meat = meat;
        this.baseBurgerPrice = 3.29;
    }

    ArrayList<String> toppings = new ArrayList<String>();

    ArrayList<String> addToppings(String topping){
        if ((topping != null) && (toppings.size()<2)){
            toppings.add(topping);
        } else {
            System.out.println("Cannot add "+topping + ". Only 2 toppings allowed ");
        }
        return toppings;
    }

    public double totalBurgerPrice(){
        double totalPrice = this.baseBurgerPrice;
        System.out.println("Base price of burger is " +this.baseBurgerPrice);
        System.out.println("_________________________________________________________________");
        if (toppings.size() > 0){
            totalPrice += 0.65 * toppings.size();
        }
        System.out.println("The total Price of " +this.name + " with toppings " +toppings.get(0) + ", " +toppings.get(1) +" is $" +totalPrice);
        System.out.println("_________________________________________________________________");
        return totalPrice;
    }
}
