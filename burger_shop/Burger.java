package burger_shop;

public class Burger {
    String name;
    String breadType;
    String meat;
    String topping1;
    double topping1Price;

    String topping2;
    double topping2Price;

    public Burger(String name, String breadType, String meat) {
        this.name = name;
        this.breadType = breadType;
        this.meat = meat;
    }

    public double plainBurgerPrice(){
        System.out.println(this.name +" burger with  " +this.breadType +" bread and meat  "+this.meat+" costs "+ 0.59);
        return 0.59;
    }

    public void addTopping1(String topping, double price){
        this.topping1 = topping;
        this.topping1Price = price;
    }

    public void addTopping2(String topping, double price){
        this.topping2 = topping;
        this.topping2Price = price;
    }

    public double totalBurgerPrice(){
        //double totalPrice = this.baseBurgerPrice;
        double totalPrice = 0.59;
        if (topping1 != null){
            totalPrice += topping1Price;
            System.out.println("Topping added " +this.topping1 + " @ " +this.topping1Price);
        }
        if (topping2 != null){
            totalPrice += topping2Price;
            System.out.println("Topping added " +this.topping2 + " @ " +this.topping2Price);
        }
        System.out.println("The total Price of " +this.name + " with toppings is " +totalPrice);
        System.out.println("_____________________________________________");
        return totalPrice;
    }
}
