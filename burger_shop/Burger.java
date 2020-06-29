package burger_shop;


public class Burger {
    String name;
    String breadType;
    String meat;
    //  double baseBurgerPrice;

    String topping1;
    double topping1Price;

    String topping2;
    double topping2Price;

    //  public Burger(String name, String breadType, String meat, double baseBurgerPrice) {
    public Burger(String name, String breadType, String meat) {
        this.name = name;
        this.breadType = breadType;
        this.meat = meat;
        //  this.baseBurgerPrice = baseBurgerPrice;
    }

    public Burger() {

    }

    public double plainBurgerPrice(){
        System.out.println(this.name +" burger with  " +this.breadType +" bread and meat  "+this.meat+" costs "+ 0.59);
        //  System.out.println(this.name +" burger with  " +this.breadType +" bread and meat  "+this.meat+" costs "+this.baseBurgerPrice);
        //  return this.baseBurgerPrice;
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
// Healthyburger

//package burger_shop;


class HealthyBurger extends Burger {
    String healthyTopping1=null;
    double healthyTopping1Price;

    String healthyTopping2;
    double healthyTopping2Price;

    String healthyTopping3;
    double healthyTopping3Price;

    String healthyTopping4;
    double healthyTopping4Price;

    public HealthyBurger(String breadType) {
        super("Healthy Burger", breadType, "lean meat");
        // super("Healthy Burger", breadType, "lean meat", 5.59);
    }

    public void addHealthyTopping1(String topping, double price){
        if ((topping == "Bacon") || (topping =="Cheese")){
            System.out.println("Not a healthy choice");
        } else {
            this.healthyTopping1 = topping;
            this.healthyTopping1Price = price;
        }
    }

    public void addHealthyTopping2(String topping, double price){
        if ((topping == "Bacon") || (topping =="Cheese")){
            System.out.println("Please add healthy toppings");
        } else {
            this.healthyTopping2 = topping;
            this.healthyTopping2Price = price;
        }
    }

    public void addHealthyTopping3(String topping, double price){
        if ((topping == "Bacon") || (topping =="Cheese")){
            System.out.println("Please add healthy toppings");
        } else {
            this.healthyTopping3 = topping;
            this.healthyTopping3Price = price;
        }
    }

    public void addHealthyTopping4(String topping, double price){
        if ((topping == "Bacon") || (topping =="Cheese")){
            System.out.println("Please add healthy toppings");
        } else {
            this.healthyTopping4 = topping;
            this.healthyTopping4Price = price;
        }
    }

    @Override
    public double totalBurgerPrice() {
        double finalPrice = 5.59;
        System.out.println("Base Cost of " +super.name +" is " +finalPrice);
        if (this.healthyTopping1 != null){
            finalPrice += healthyTopping1Price;
            System.out.println("Added "+this.healthyTopping1 +" for an extra " +this.healthyTopping1Price);
        }
        if (this.healthyTopping2 != null){
            finalPrice += healthyTopping2Price;
            System.out.println("Added "+this.healthyTopping2 +" for an extra " +this.healthyTopping2Price);
        }
        if (this.healthyTopping3 != null){
            finalPrice += healthyTopping3Price;
            System.out.println("Added "+this.healthyTopping3 +" for an extra " +this.healthyTopping3Price);
        }
        if (this.healthyTopping4 != null){
            finalPrice += healthyTopping4Price;
            System.out.println("Added "+this.healthyTopping4 +" for an extra " +this.healthyTopping4Price);
        }
        System.out.println("The total Price " +name + " with added toppings is " +finalPrice);
        System.out.println("_________________________________________________________");
        return finalPrice;
    }
}