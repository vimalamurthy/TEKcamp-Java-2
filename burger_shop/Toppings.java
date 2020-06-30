package burger_shop;

public  class Toppings {
    String name;
    double price;
    boolean isHealthy;

    public static final Toppings Tomato = new Toppings("Tomato", 0.45, true);
    public static final Toppings Cucumber = new Toppings("Cucumber", 0.40, true);
    public static final Toppings Onion = new Toppings("Onion", 0.35, true);
    public static final Toppings Bacon = new Toppings("Bacon", 0.45, false);
    public static final Toppings Hummus = new Toppings("Hummus", 0.35, true);
    public static final Toppings Cheese = new Toppings("Cheese", 0.65, false);
    public static final Toppings Lettuce = new Toppings("Lettuce", 0.35, true);
    public static final Toppings Avacado = new Toppings("Avacado", 0.45, true);
    public static final Toppings Mushrooms = new Toppings("Mushrooms", 0.45, true);
    public static final Toppings Salsa = new Toppings("Salsa", 0.45, true);

    public Toppings(String name, double price, boolean isHealthy) {
        this.name = name;
        this.price = price;
        this.isHealthy = isHealthy;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isHealthy() {
        return isHealthy;
    }
}


/*public static HashMap<String,Double> toppings = new HashMap<String, Double>();
    static{
        toppings.put("Tomato",0.65);
        toppings.put("Cucumber", 0.60);
        toppings.put("Onion", 0.70);
        toppings.put("Pickles", 0.35);
        toppings.put("Cheese", 0.70);
        toppings.put("Mayo",0.30);
        System.out.println(toppings);
    }*/