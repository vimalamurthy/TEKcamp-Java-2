package burger_shop;
public class DeluxeBurger extends Burger {
    String deluxeTopping1;
    double deluxeTopping1Price;

    String deluxeTopping2;
    double deluxeTopping2Price;

    String deluxeTopping3;
    double deluxeTopping3Price;

    String deluxeTopping4;
    double deluxeTopping4Price;

    String deluxeTopping5;
    double deluxeTopping5Price;

    String deluxeTopping6;
    double deluxeTopping6Price;

    public DeluxeBurger( String breadType, String meat) {
        super("Deluxe", breadType, meat);
    }

    public void addDeluxeTopping1(String topping, double price){
        this.deluxeTopping1 = topping;
        this.deluxeTopping1Price = price;
    }

    public void addDeluxeTopping2(String topping, double price){
        this.deluxeTopping2 = topping;
        this.deluxeTopping2Price = price;
    }
    public void addDeluxeTopping3(String topping, double price){
        this.deluxeTopping3 = topping;
        this.deluxeTopping3Price = price;
    }

    public void addDeluxeTopping4(String topping, double price){
        this.deluxeTopping4 = topping;
        this.deluxeTopping4Price = price;
    }

    public void addDeluxeTopping5(String topping, double price){
        this.deluxeTopping5 = topping;
        this.deluxeTopping5Price = price;
    }

    public void addDeluxeTopping6(String topping, double price){
        this.deluxeTopping6 = topping;
        this.deluxeTopping6Price = price;
    }

    @Override
    public double totalBurgerPrice() {
        double finalPrice = 4.75;
        System.out.println("Base cost of " +super.name +" is " +finalPrice);
        if (this.deluxeTopping1 != null){
            finalPrice += deluxeTopping1Price;
            System.out.println("Added "+this.deluxeTopping1 +" for an extra " +this.deluxeTopping1Price);
        }
        if (this.deluxeTopping2 != null){
            finalPrice += deluxeTopping2Price;
            System.out.println("Added "+this.deluxeTopping2 +" for an extra " +this.deluxeTopping2Price);
        }
        if (this.deluxeTopping3 != null){
            finalPrice += deluxeTopping3Price;
            System.out.println("Added "+this.deluxeTopping3 +" for an extra " +this.deluxeTopping3Price);
        }
        if (this.deluxeTopping4 != null){
            finalPrice += deluxeTopping4Price;
            System.out.println("Added "+this.deluxeTopping4 +" for an extra " +this.deluxeTopping4Price);
        }
        if (this.deluxeTopping5 != null){
            finalPrice += deluxeTopping5Price;
            System.out.println("Added "+this.deluxeTopping5 +" for an extra " +this.deluxeTopping5Price);
        }
        if (this.deluxeTopping6 != null){
            finalPrice += deluxeTopping6Price;
            System.out.println("Added "+this.deluxeTopping6 +" for an extra " +this.deluxeTopping6Price);
        }
        System.out.println("The total Price " + name + " with toppings is " +finalPrice);
        System.out.println("_____________________________________________");
        return finalPrice;
    }
}