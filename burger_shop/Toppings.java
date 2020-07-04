package burger_shop;
import java.util.HashMap;
import java.util.Scanner;

public class Toppings {
    int id;
    String toppingname;
    double price;
    boolean tchoice = true;
    int toppingchoice;
    String mtoppings;
    int allowedToppings;

    public int getToppingsallowed() {
        return toppingsallowed;
    }

    public void setToppingsallowed(int toppingsallowed) {
        this.toppingsallowed = toppingsallowed;
    }

    int toppingsallowed;
    String topyesno;
    HashMap<String, Double> topping = new HashMap<String, Double>();
    HashMap<String, Double> toppings= new HashMap<String, Double>();

    public HashMap<String, Double> getToppings() {
        return toppings;
    }

    public void setToppings(HashMap<String, Double> toppingprice) {
        this.toppings = toppingprice;
    }

    private Scanner scanner = new Scanner(System.in);

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getToppingname() {
        return toppingname;
    }

    public void setToppingname(String toppingname) {
        this.toppingname = toppingname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Toppings()
    {
        topping.put("Tomato", 0.80);
        topping.put("Lettuce", 0.65);
        topping.put("Olives",0.90);
        topping.put("Onion", 0.75);
        topping.put("Carrot", 0.60);
        topping.put("Cucumber", 0.55);
        topping.put("Mustard", 0.90);
        topping.put("Cheese",0.80);
        topping.put("mayonnaise",0.75);
        topping.put("Bacon",1.00);

    }

    public void DisplayToppingsOptions(int choice){
        if (choice != 2)
        {
            System.out.println(" Toppings Options \n" +
                    "1. Tomato, $0.80 \n" +
                    "2. Lettuce, $0.65 \n"+
                    "3. Olives, $0.90 \n"+
                    "4. Onion, $0.75 \n"+
                    "5. Carrot, $0.60 \n"+
                    "6. Cucumber, $0.55\n"+
                    "7. Mustard, $0.90 \n"+
                    "8. mayonnaise,$0.80 \n"+
                    "9. Cheese,$0.75 \n"+
                    "10. Bacon,$1.00 \n"

            );
        } else {
            System.out.println(" Toppings Options \n" +
                    "1. Tomato, $0.80 \n" +
                    "2. Lettuce, $0.65 \n"+
                    "3. Olives, $0.90 \n"+
                    "4. Onion, $0.75 \n"+
                    "5. Carrot, $0.60 \n"+
                    "6. Cucumber, $0.55 \n"+
                    "7. Mustard, $0.90 \n"
            );
        }
        while (tchoice)
        {
            System.out.println("Enter your Toppings ");
            toppingchoice = scanner.nextInt();
            scanner.nextLine();

            if (toppingchoice == 1 || toppingchoice == 2 || toppingchoice == 3 || toppingchoice == 4 ||
                    toppingchoice == 5 || toppingchoice == 6 || toppingchoice == 7 || toppingchoice == 8 || toppingchoice == 9 || toppingchoice == 10)
            {
                allowedToppings = allowedToppings + 1;

                if(mtoppings != null && !mtoppings.isEmpty())
                {
                    mtoppings = mtoppings + "," + getToppings(toppingchoice);
                } else
                {
                    mtoppings =  getToppings(toppingchoice);
                }
                toppings.put(getToppings(toppingchoice),topping.get(getToppings(toppingchoice)));
                if (allowedToppings < this.toppingsallowed)
                {
                    System.out.println("Do you want to add additional toppings (y/n) ");
                    topyesno = scanner.nextLine();
                    if (topyesno.equalsIgnoreCase("y")) {
                        tchoice = true;
                    }else
                    {
                        tchoice = false;
                    }
                } else if (allowedToppings >= toppingsallowed)
                {
                    tchoice = false;
                }

            }
            else
            {
                System.out.println("wrong topping type");
            }
        }

    }


    static String getToppings(int choice)
    {
        String retTopping = null;

        switch(choice)
        {
            case 1:
                retTopping = "Tomato";
                break;
            case 2:
                retTopping = "Lettuce";
                break;
            case 3:
                retTopping = "Olives";
                break;
            case 4:
                retTopping = "Onion";
                break;
            case 5:
                retTopping = "Carrot";
                break;
            case 6:
                retTopping = "Cucumber";
                break;
            case 7:
                retTopping = "Mustard";
                break;
            case 8:
                retTopping = "mayonnaise";
                break;
            case 9:
                retTopping = "Cheese";
                break;
            case 10:
                retTopping = "Bacon";
                break;
            default:
                // code block
        }
        return  retTopping;


    }

}
