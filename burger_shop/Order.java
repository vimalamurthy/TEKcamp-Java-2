package burger_shop;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Order {

    String[] toppinglist = null;
    String[] sidelist = null;
    String drinkList = null;

    public Burger getBurger() {
        return burger;
    }

    public void setBurger(Burger burger) {
        this.burger = burger;
    }

    Burger burger;

    double toppingprice = 0.0;
    double sideprice = 0.0;
    double drinkprice = 0.0;
    double burgerprice = 0.0;
    double plainburgerprice = 0.0;
    double totalburgerprice = 0.0;

    public double getPlainburgerprice() {
        return plainburgerprice;
    }

    public void setPlainburgerprice(double plainburgerprice) {
        this.plainburgerprice = plainburgerprice;
    }

    public double getTotalburgerprice() {
        return totalburgerprice;
    }

    public void setTotalburgerprice(double totalburgerprice) {
        this.totalburgerprice = totalburgerprice;
    }

    private static DecimalFormat df = new DecimalFormat("#.##");


    public Order(Burger burger, Bread bread, Meat meat) {
        this.setPlainburgerprice(burger.getPlainBurgerPrice());
        burgerprice =burger.getPlainBurgerPrice();
        switch(burger.getName()) {

            case "Plain Burger":
                burger = new Burger(burger.getName(), bread.getBread(), meat.getMeat());
                break;
            case "Healthy Burger":
                burger = new HealthyBurger(bread.getBread(), meat.getMeat());
                break;
            case "Deluxe Burger":
                burger = new DeluxeBurger(bread.getBread(), meat.getMeat());
                break;
        }
        this.setBurger(burger);
    }

    public Order(Meal ml) {

        this.setPlainburgerprice(ml.getBurger().getPlainBurgerPrice());
        burgerprice = ml.getBurger().getPlainBurgerPrice();
        switch(ml.getBurger().getName()) {

            case "Plain Burger":
                burger = new Burger(ml.getBurger().getName(), ml.getBurger().getBreadType(),ml.getBurger().getMeat());
                break;
            case "Healthy Burger":
                burger = new HealthyBurger(ml.getBurger().getBreadType(), ml.getBurger().getMeat());
                break;
            case "Deluxe Burger":
                burger = new DeluxeBurger(ml.getBurger().getName(), ml.getBurger().getMeat());
                break;
        }
        this.setBurger(burger);
    }

    void addToppings(HashMap<String, Double> topping)
    {

        Iterator hmIterator = topping.entrySet().iterator();
        while (hmIterator.hasNext()) {
            Map.Entry mapElement = (Map.Entry)hmIterator.next();
            double price = ((double)mapElement.getValue());
            toppingprice = toppingprice + price;
        }
    }

    void addSides(HashMap<String, Double> sides)
    {
        Iterator hmIterator = sides.entrySet().iterator();
        while (hmIterator.hasNext()) {
            Map.Entry mapElement = (Map.Entry)hmIterator.next();
            double price = ((double)mapElement.getValue());
            sideprice = sideprice + price;
        }
    }

    void addDrinks(HashMap<String, Double> drinks)

    {
        Iterator hmIterator = drinks.entrySet().iterator();
        while (hmIterator.hasNext()) {
            Map.Entry mapElement = (Map.Entry)hmIterator.next();
            double price = ((double)mapElement.getValue());
            drinkprice = drinkprice + price;
        }
    }

    public void purchaseOrder() {
        double total = 0;
        total = burgerprice + drinkprice + sideprice + toppingprice;
        System.out.println("Burger Price  $" + df.format(burgerprice));
        System.out.println("Drink Price  $" + df.format(drinkprice));
        System.out.println("Side Price  $" + df.format(sideprice));
        System.out.println("Topping Price  $" + df.format(toppingprice));
        System.out.println("Order Placed. you total is $ " + df.format(total));
        this.setTotalburgerprice(total);
        this.setPlainburgerprice(burgerprice);
    }



}
