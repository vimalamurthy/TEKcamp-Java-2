package burger_shop;
public class Meal extends Burger {

    Drink drink = new Drink();
    Side side = new Side();
    String Name;
    String BreadType;
    String Meat;
    Burger burgerorder;


    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public void setSide(Side side) {
        this.side = side;
    }

    public Meal(String name, String breadType, String meat) {
        super(name, breadType, meat);
        this.Name = name;
        this.BreadType = breadType;
        this.Meat = meat;
        this.burgerorder  = new Burger(this.Name, this.BreadType, this.Meat);

    }

    public Meal() {
        super();
    }


    public Burger getBurger()
    {
        return this.burgerorder;
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

}
