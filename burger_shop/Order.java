package burger_shop;
public class Order {

    public Order(Burger burgername, Bread breadname, Meat meat) {
        burgername.name = "Plain Burger";
        breadname.setBread("White Bread");
        meat.setMeat("Goat");

        System.out.print("Inside Order Burger Name " + burgername.name);
        System.out.print("Inside Order Bread Name " + breadname.getBread());
        System.out.println("Inside Order Meat Name " + meat.getMeat());

    }

    public Order(Meal ml) {
        //  Meal ml = new Meal("Regular", "White", "Sausage", 3.29);
        ml.setDrink("Coke");
        ml.setSide("Fries");
        System.out.println("Inside Order Drink " + ml.getDrink());
        System.out.println("Inside Order Fries " + ml.getSide());
        System.out.println("Inside Order Base Burger Name " + ml.getName());

    }
    void addToppings(String ... toppings)
    {
        {
            System.out.println("Number of arguments is: "+ toppings.length);
            for (String topping : toppings) {
                System.out.println(topping);
            }

            System.out.println();
        }
    }

    void addSides(String ... sides)
    {
        {
            System.out.println("Number of arguments is: "+ sides.length);
            for (String side : sides) {
                System.out.println(side);
            }

            System.out.println();
        }
    }
}
