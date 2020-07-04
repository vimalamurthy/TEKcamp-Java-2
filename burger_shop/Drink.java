package burger_shop;
import java.util.HashMap;
import java.util.Scanner;

public class Drink {
    String DrinkName;
    double DrinkPrice;
    Boolean dchoice = true;
    int drinkchoice;
    private Scanner scanner = new Scanner(System.in);


    HashMap<String, Double> drinkitem = new HashMap<String, Double>();
    HashMap<String, Double> drinkSelitem = new HashMap<String, Double>();

    public HashMap<String, Double> getDrinkSelitem() {
        return drinkSelitem;
    }

    public void setDrinkSelitem(HashMap<String, Double> drinkSelitem) {
        this.drinkSelitem = drinkSelitem;
    }



    public String getDrinkName() {
        return DrinkName;
    }

    public void setDrinkName(String drinkName) {
        DrinkName = drinkName;
    }

    public double getDrinkPrice() {
        return DrinkPrice;
    }

    public void setDrinkPrice(double drinkPrice) {
        DrinkPrice = drinkPrice;
    }

    public Drink()
    {
        drinkitem.put("Coke", 1.00);
        drinkitem.put("Pepsi", 1.00);
        drinkitem.put("Lemonade", 0.80);

    }
    public void DisplayDrinkOptions(){
        System.out.println(" Drinks \n" +
                "1. Coke, $1.00 \n" +
                "2. Pepsi, $1.00 \n"+
                "3. Lemonade, $0.80 \n");

        while (dchoice)
        {

            System.out.println("Enter your Drink ");
            drinkchoice = scanner.nextInt();
            scanner.nextLine();
            if (drinkchoice == 1 || drinkchoice == 2 || drinkchoice == 3)
            {
                dchoice = false;
                this.setDrinkName(getDrink(drinkchoice));
            }
            else
            {
                System.out.println("wrong side type");
            }
        }
        drinkSelitem.put(getDrink(drinkchoice),drinkitem.get(getDrink(drinkchoice)));
    }
    static String getDrink(int choice)
    {
        String retDrinkType = null;

        switch(choice)
        {
            case 1:
                retDrinkType = "Coke";
                break;
            case 2:
                retDrinkType = "Pepsi";
                break;
            case 3:
                retDrinkType = "Lemonade";
                break;
            default:
                break;
        }
        return  retDrinkType;
    }

}
