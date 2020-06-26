package burger_shop;

public class Meal extends Burger {

    String Drink;
    String Side;
    String Name;
    String BreadType;
    String Meat;
    double BaseBurgerPrice;

    public Meal(String name, String breadType, String meat, double baseBurgerPrice) {
        super(breadType, meat);
        //this.Name = name;
        this.BreadType = breadType;
        this.Meat = meat;
        //this.BaseBurgerPrice = baseBurgerPrice;

    }

   /* public Meal() {
        super();
    }*/

    public void setDrink(String drink)
    {
        this.Drink = drink;
    }
    public void setSide(String side)
    {
        this.Side = side;
    }

    public String getDrink()
    {
        return this.Drink;
    }

    public String getSide()
    {
        return this.Side;
    }
    public String getName()
    {
        return this.Name;
    }
    public String getBreadType()
    {
        return this.BreadType;
    }
    public String getMeat()
    {
        return this.Meat;
    }
    public double getBaseBurgerPrice()
    {
        return this.BaseBurgerPrice;
    }
}
