package burger_shop;
public class HealthyBurger extends Burger{


    String healthyTopping1=null;
    double healthyTopping1Price;

    String healthyTopping2;
    double healthyTopping2Price;

    String healthyTopping3;
    double healthyTopping3Price;

    String healthyTopping4;
    double healthyTopping4Price;

    public HealthyBurger(String breadType,String meat) {
        super("Healthy Burger", breadType, meat);
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

