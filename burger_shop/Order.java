package burger_shop;

import burger_shop.Bread;
import burger_shop.Burger;
import burger_shop.Meal;
import burger_shop.Meat;

import java.text.DecimalFormat;

public class Order {

    String[] toppinglist = null;
    String[] sidelist = null;
    String drinkList = null;

    double toppingprice = 0.0;
    double sideprice = 0.0;
    double drinkprice = 0.0;
    double burgerprice = 0.0;
    private static DecimalFormat df = new DecimalFormat("#.##");


    public Order(String burgername, String breadname, String meatname) {

        Bread bread = new Bread();
        bread.setBread(breadname);

        Meat meat = new Meat();
        meat.setMeat(meatname);

        Burger burger = new Burger(burgername,bread.getBread(),meat.getMeat());
        this.addBurger(burger);
    }

    public Order(Meal ml) {

        this.addBurger(ml.getBurger());
    }
    void addToppings(String ... toppings)
    {

        {

            for (String topping : toppings) {

                toppinglist = topping.split(",");
            }
            for (int i = 0; i < toppinglist.length; i++) {

                switch(toppinglist[i])
                {
                    case "Tomato":
                    case "mayonnaise":
                        toppingprice = toppingprice + 0.80;
                        break;
                    case "Lettuce":
                        toppingprice = toppingprice + 0.65;
                        break;
                    case "Olives":
                    case "Mustard":
                        toppingprice = toppingprice + 0.90;
                        break;
                    case "Onion":
                    case "Cheese":
                        toppingprice = toppingprice + 0.75;
                        break;
                    case "Carrot":
                        toppingprice = toppingprice + 0.60;
                        break;
                    case "Cucumber":
                        toppingprice = toppingprice + 0.55;
                        break;
                    case "Bacon":
                        toppingprice = toppingprice + 1.00;
                        break;
                    default:
                        // code block
                }
            }

            //  System.out.println("Total Price for Toppings " + toppingprice);
        }
    }

    void addSides(String ... sides)
    {

        {
            //  System.out.println("Number of arguments is: "+ sides.length);
            for (String side : sides) {
                sidelist = side.split(",");
            }
            for (int i = 0; i < sidelist.length; i++) {

                switch(sidelist[i])
                {
                    case "French Fries":
                        sideprice = sideprice + 1.00;
                        break;
                    case "Onion Ring":
                        sideprice = sideprice + 1.10;
                        break;
                    case "Chicken Fingers":
                        sideprice = sideprice + 2.10;
                        break;
                    default:
                        // code block
                }
            }

        }
        //  System.out.println("Total Price for sides " + sideprice);

    }


    void addDrinks(String ... drinks)
    {
        {
            for (String drink : drinks) {
                drinkList = drink;
            }
            switch(drinkList)
            {
                case "Coke":
                case "Pepsi":
                    drinkprice= drinkprice + 1.00;
                    break;
                case "Lemonade":
                    drinkprice = drinkprice + 2.10;
                    break;
                default:
                    // code block
            }
            //   System.out.println("Total Price for drink " + drinkprice);
        }
    }

    void addBurger(Burger burgername)
    {
        {
            burgerprice = burgerprice + 4.00;
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
    }
}
