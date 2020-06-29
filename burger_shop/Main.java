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

        OrderType();

        int orderchoice = 0 ;
        boolean ordchoice = true;
        while (ordchoice)
        {
            System.out.println("Enter your Order Type ");
            orderchoice = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Order Type "+ getOrderType(orderchoice));
            if (orderchoice == 1 || orderchoice == 2)
            {
                ordchoice = false;
            }
            else
            {
                System.out.println("Wrong Order Type");
            }
        }


        printOptions();

        boolean brgchoice = true;
        int burgerchoice = 0;
        while (brgchoice)
        {
            System.out.println("Enter your Burger Type ");
            burgerchoice = scanner.nextInt();
            scanner.nextLine();

            if (burgerchoice == 1 || burgerchoice == 2 || burgerchoice == 3)
            {
                brgchoice = false;
                switch (burgerchoice)
                {
                    case 1: toppingsallowed = 2;
                        break;
                    case 2: toppingsallowed = 4;
                        break;
                    case 3: toppingsallowed = 6;
                        break;
                }

            }
            else
            {
                System.out.println("Wrong Order Type");
            }
        }

        //     System.out.println("Enter your quantity ");
        //     int quantity = scanner.nextInt();

        BreadTypeOptions();


        while (bchoice)
        {
            System.out.println("Enter your Bread Type");
            breadchoice = scanner.nextInt();
            scanner.nextLine();


            if (breadchoice == 1 || breadchoice == 2 || breadchoice == 3 || breadchoice == 4)
            {
                bchoice = false;
                //    System.out.println("You entered " + getBreadType(breadchoice) + " Type" );
            }
            else
            {
                System.out.println("Wrong bread type");
            }
        }

        MeatOptions();
        while (mchoice)
        {
            System.out.println("Enter your Meat Choice ");
            meatchoice = scanner.nextInt();
            scanner.nextLine();
            if (meatchoice == 1 || meatchoice == 2 || meatchoice == 3 || meatchoice == 4)
            {
                mchoice = false;
                //   System.out.println("You entered " + getMeatType(meatchoice) + " Type" );
            }
            else
            {
                System.out.println("wrong meat type");
            }
        }

        ToppingsOptions(burgerchoice);
        while (tchoice)
        {
            System.out.println("Enter your Toppings ");
            toppingchoice = scanner.nextInt();
            scanner.nextLine();

            if (toppingchoice == 1 || toppingchoice == 2 || toppingchoice == 3 || toppingchoice == 4 ||
                    toppingchoice == 5 || toppingchoice == 6 || toppingchoice == 7 || toppingchoice == 8 || toppingchoice == 9 || toppingchoice == 10)
            {
                allowedToppings = allowedToppings + 1;
                // System.out.println ("Toppings Allowed " + allowedToppings);

                if(mtoppings != null && !mtoppings.isEmpty())
                {
                    mtoppings = mtoppings + "," + getToppings(toppingchoice);

                } else
                {
                    mtoppings =  getToppings(toppingchoice);
                }
                if (allowedToppings < toppingsallowed)
                {
                    System.out.println("Do you want to add additional toppings (y/n) ");

                    topyesno = scanner.nextLine();
                    //          System.out.println("yes no value " + topyesno);
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

        while (schoice)
        {
            sidesOptions();
            System.out.println("Enter your Side ");
            sidechoice = scanner.nextInt();
            scanner.nextLine();
            if (sidechoice == 1 || sidechoice == 2 || sidechoice == 3)
            {
                if(msides != null && !msides.isEmpty())
                {
                    msides = msides + "," + getSides(sidechoice);
                } else
                {
                    msides =  getSides(sidechoice);
                }
                System.out.println("Do you want to add additional sides (y/n) ");

                sideyesno = scanner.nextLine();
                //       System.out.println("yes no value " + sideyesno);
                if (sideyesno.equalsIgnoreCase("y")) {
                    schoice = true;
                }else
                {
                    schoice = false;
                    //   System.out.println("You entered " + msides  );
                }
            }
            else
            {
                System.out.println("wrong side type");
            }
        }

        while (dchoice)
        {
            drinkOptions();
            System.out.println("Enter your Drink ");
            drinkchoice = scanner.nextInt();
            scanner.nextLine();
            if (drinkchoice == 1 || drinkchoice == 2 || drinkchoice == 3)
            {
                dchoice = false;
                //      System.out.println("You entered " + getSides(drinkchoice) + " Type" );

            }
            else
            {
                System.out.println("wrong side type");
            }
        }

        if (burgerchoice == 1)
        {
            Bread bread = new Bread();
            bread.setBread(getBreadType(breadchoice));

            Meat meat = new Meat();
            meat.setMeat(getMeatType(meatchoice));

            if (orderchoice == 1 ) {

                Order ord = new Order(geBurgerType(burgerchoice), getBreadType(breadchoice), getMeatType(meatchoice));
                ord.addToppings(mtoppings);
                ord.addDrinks(getDrink(drinkchoice));
                ord.addSides(msides);
                System.out.println("Purchase order (y/n) ");
                purchaseyesno = scanner.nextLine();

                if (purchaseyesno.equalsIgnoreCase("y")) {
                    ord.purchaseOrder();
                }else
                {
                    schoice = false;
                    System.out.println("Order Cancelled "  );
                }


            } else if (orderchoice == 2) {

                Meal ml = new Meal(geBurgerType(burgerchoice), getBreadType(breadchoice), getMeatType(meatchoice));
                ml.setDrink(getDrink(sidechoice));
                ml.setSide(getSides(sidechoice));
                Order ord1 = new Order(ml);
                ord1.addToppings(mtoppings);
                ord1.addDrinks(getDrink(drinkchoice));
                ord1.addSides(msides);


                System.out.println("Purchase order (y/n) ");
                purchaseyesno = scanner.nextLine();

                if (purchaseyesno.equalsIgnoreCase("y")) {
                    ord1.purchaseOrder();
                }else
                {
                    schoice = false;
                    System.out.println("Order Cancelled "  );
                }
            }

        }

        if (burgerchoice == 2)  /* Healthy Burger */
        {
            // int toppingsallowed = 4;
            /* Plain burger */
            //      System.out.println ("Inside Healthy Burger");

            Bread bread = new Bread();
            bread.setBread(getBreadType(breadchoice));

            Meat meat = new Meat();
            meat.setMeat(getMeatType(meatchoice));

            if (orderchoice == 1 ) {
                System.out.print ("Inside Order Choice 1" + burgerchoice + breadchoice + meatchoice );
                Order ord = new Order(geBurgerType(burgerchoice), getBreadType(breadchoice), getMeatType(meatchoice));
                ord.addToppings(mtoppings);
                ord.addDrinks(getDrink(drinkchoice));
                ord.addSides(msides);


                System.out.println("Purchase order (y/n) ");
                purchaseyesno = scanner.nextLine();

                if (purchaseyesno.equalsIgnoreCase("y")) {
                    ord.purchaseOrder();
                }else
                {
                    schoice = false;
                    System.out.println("Order Cancelled "  );
                }
            } else if (orderchoice == 2) {

                Meal ml = new Meal(geBurgerType(burgerchoice), getBreadType(breadchoice), getMeatType(meatchoice));
                ml.setDrink(getDrink(sidechoice));
                ml.setSide(getSides(sidechoice));
                Order ord1 = new Order(ml);
                ord1.addToppings(mtoppings);
                ord1.addDrinks(getDrink(drinkchoice));
                ord1.addSides(msides);


                System.out.println("Purchase order (y/n) ");
                purchaseyesno = scanner.nextLine();

                if (purchaseyesno.equalsIgnoreCase("y")) {
                    ord1.purchaseOrder();
                }else
                {
                    schoice = false;
                    System.out.println("Order Cancelled "  );
                }
            }
        }

        if (burgerchoice == 3)  /* Delux Burger */
        {
            //   int toppingsallowed = 6;


            Bread bread = new Bread();
            bread.setBread(getBreadType(breadchoice));

            Meat meat = new Meat();
            meat.setMeat(getMeatType(meatchoice));

            if (orderchoice == 1 ) {

                Order ord = new Order(geBurgerType(burgerchoice), getBreadType(breadchoice), getMeatType(meatchoice));
                ord.addToppings(mtoppings);
                ord.addDrinks(getDrink(drinkchoice));
                ord.addSides(msides);


                System.out.println("Purchase order (y/n) ");
                purchaseyesno = scanner.nextLine();

                if (purchaseyesno.equalsIgnoreCase("y")) {
                    ord.purchaseOrder();
                }else
                {
                    schoice = false;
                    System.out.println("Order Cancelled "  );
                }


            } else if (orderchoice == 2) {

                Meal ml = new Meal(geBurgerType(burgerchoice), getBreadType(breadchoice), getMeatType(meatchoice));
                ml.setDrink(getDrink(sidechoice));
                ml.setSide(getSides(sidechoice));
                Order ord1 = new Order(ml);
                ord1.addToppings(mtoppings);
                ord1.addDrinks(getDrink(drinkchoice));
                ord1.addSides(msides);


                System.out.println("Purchase order (y/n) ");
                purchaseyesno = scanner.nextLine();

                if (purchaseyesno.equalsIgnoreCase("y")) {
                    ord1.purchaseOrder();
                }else
                {
                    schoice = false;
                    System.out.println("Order Cancelled "  );
                }


            }



        }


    }
    static void printOptions(){
        System.out.println(" Options \n" +
                "1. Plain Burger \n" +
                "2. Healthy Burger \n"+
                "3. Deluxe Burger \n");
    }

    static void sidesOptions(){
        System.out.println(" Sides \n" +
                "1. French Fries, $1.00 \n" +
                "2. Onion Rings, $1.10 \n"+
                "3. Chicken Fingers, $2.10 \n");
    }


    static void drinkOptions(){
        System.out.println(" Drinks \n" +
                "1. Coke, $1.00 \n" +
                "2. Pepsi, $1.00 \n"+
                "3. Lemonade, $0.80 \n");
    }


    static void ToppingsOptions(int choice){
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

    }

    static void MeatOptions(){
        System.out.println(" Meat Options \n" +
                "1. Chicken \n" +
                "2. Beef  \n"+
                "3. Steak \n"
        );

    }
    static void BreadTypeOptions(){
        System.out.println(" Bread  Options \n" +
                "1. White \n" +
                "2. Brown  \n"+
                "3. Wheat \n"+
                "4. Multi Grain \n"
        );
    }

    static void OrderType(){
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

    static String getBreadType(int choice)
    {
        String retBreadType = null;

        switch(choice)
        {
            case 1:
                retBreadType = "White";
                break;
            case 2:
                retBreadType = "Brown";
                break;
            case 3:
                retBreadType = "Wheat";
                break;
            case 4:
                retBreadType = "Multi Grain";
                break;
            default:
                // code block
        }
        return  retBreadType;
    }

    static String getMeatType(int choice)
    {
        String retMeatType = null;

        switch(choice)
        {
            case 1:
                retMeatType = "Chicken";
                break;
            case 2:
                retMeatType = "Beef";
                break;
            case 3:
                retMeatType = "Steak";
                break;
            default:
                // code block
        }
        return  retMeatType;
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

    static String getSides(int choice)
    {
        String retSidesType = null;

        switch(choice)
        {
            case 1:
                retSidesType = "French Fries";
                break;
            case 2:
                retSidesType = "Onion Ring";
                break;
            case 3:
                retSidesType = "Chicken Fingers";
                break;
            default:
                // code block
        }
        return  retSidesType;
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
                // code block
        }
        return  retDrinkType;
    }
}