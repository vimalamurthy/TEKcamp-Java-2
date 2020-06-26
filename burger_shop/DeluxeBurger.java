package burger_shop;

import java.util.ArrayList;

public class DeluxeBurger extends Burger{
    ArrayList<String> toppings = new ArrayList<String>();
    String name = "Deluxe Burger";
    public DeluxeBurger( String breadType, String meat) {
        super( breadType, meat);
    }

    ArrayList<String> addToppings(String topping){
        if ((topping != null) && (toppings.size()<4)){
            toppings.add(topping);
        } else {
            System.out.println("Cannot add "+topping + ". Only 4 toppings allowed ");
        }
        return toppings;
    }

    @Override
    public double totalBurgerPrice() {
        double totalPrice = 4.75;
        System.out.println("Base price of " +name +" is $" +totalPrice);
        System.out.println("_________________________________________________________________");
        if (toppings.size() > 0){
            totalPrice += 0.65 * toppings.size();
        }
        System.out.println("Toppings added : ");
        for (String str : toppings){
            System.out.print(str + ", ");
        }
        System.out.println("The total Price of " +name + " with toppings is $" +totalPrice);
        System.out.println("_________________________________________________________________");
        return totalPrice;
    }
}
