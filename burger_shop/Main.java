package burger_shop;
import java.util.Scanner;

public class Main {
    private Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //main execution of the burger shop goes here.  This is the "entry point" of your application
        Scanner scanner = new Scanner(System.in);
        String mtoppings = "";
        String msides = null;
        String sideyesno = "";
        String purchaseyesno = "";
        String topyesno = null;
        boolean schoice  = true;
        boolean dchoice = true;
        boolean bchoice = true;
        boolean mchoice = true;
        boolean tchoice = true;
        int sidechoice = 0;
        int drinkchoice = 0;
        int breadchoice = 0;
        int meatchoice = 0;
        int toppingchoice = 0;
        int toppingsallowed = 0;
        int allowedToppings = 0;

        System.out.print("\033[H\033[2J");
        System.out.flush();

        DisplayOrderType();

        int orderchoice = 0 ;
        boolean ordchoice = true;
        while (ordchoice)
        {
            System.out.println("Enter your Order Type ");
            orderchoice = scanner.nextInt();
            scanner.nextLine();
            if (orderchoice == 1 || orderchoice == 2)
            {
                ordchoice = false;
            }
            else
            {
                System.out.println("Wrong Order Type");
            }
        }


        Burger burger = new Burger();
        burger.DisplayBurgerType();

        Bread bread = new Bread();
        bread.DisplayBreadTypeOptions();

        Meat meat = new Meat();
        meat.DisplayMeatOptions();

        Toppings toppings = new Toppings();
        toppings.setToppingsallowed(burger.getToppingsallowed());
        toppings.DisplayToppingsOptions(burger.getBurgerchoice());

        Side side = new Side();
        side.DispalysidesOptions();

        Drink drink= new Drink();
        drink.DisplayDrinkOptions();

        if (orderchoice == 1 ) {
            System.out.println("Purchase order (y/n) ");
            purchaseyesno = scanner.nextLine();
            Order order = new Order(burger, bread, meat);
            order.addToppings(toppings.getToppings());
            order.addDrinks(drink.getDrinkSelitem());
            order.addSides(side.getSideprice());

            if (purchaseyesno.equalsIgnoreCase("y")) {
                order.purchaseOrder();
                burger.setTotalBurgerPrice(order.getTotalburgerprice());
                System.out.println ("Final Statement");
                System.out.println(burger.getTotalBurgerPrice());
                System.out.println(burger.getPlainBurgerPrice());

            }else
            {
                schoice = false;
                System.out.println("Order Cancelled "  );
            }
        } else if (orderchoice == 2) {
            System.out.println("Purchase order (y/n) ");
            purchaseyesno = scanner.nextLine();

            Meal ml = new Meal(burger.getName(), bread.getBread(), meat.getMeat());
            Order mealorder = new Order(ml);
            mealorder.addToppings(toppings.getToppings());
            mealorder.addDrinks(drink.getDrinkSelitem());
            mealorder.addSides(side.getSideprice());


            if (purchaseyesno.equalsIgnoreCase("y")) {
                mealorder.purchaseOrder();
                burger.setPlainBurgerPrice(mealorder.getPlainburgerprice());
                burger.setTotalBurgerPrice(mealorder.getTotalburgerprice());
                System.out.println ("Final Statement");
                System.out.println(burger.getTotalBurgerPrice());
                System.out.println(burger.getPlainBurgerPrice());
            }else
            {
                schoice = false;
                System.out.println("Order Cancelled "  );
            }
        }

    }
    static void DisplayOrderType(){
        System.out.println(" Order Type \n" +
                "1. Burger \n" +
                "2. Meal  \n"
        );
    }
    static String getOrderType(int choice)
    {
        String retOrderType = null;

        switch(choice)
        {
            case 1:
                retOrderType = "Burger";
                break;
            case 2:
                retOrderType = "Meal";
                break;
            default:
                // code block
        }
        return  retOrderType;
    }
    static String geBurgerType(int choice)
    {
        String retBurgerType = null;

        switch(choice)
        {
            case 1:
                retBurgerType = "Plain Burger";
                break;
            case 2:
                retBurgerType = "Healthy Burger";
                break;
            case 3:
                retBurgerType = "Deluxe Burger";
                break;
            default:
                // code block
        }
        return  retBurgerType;
    }
}