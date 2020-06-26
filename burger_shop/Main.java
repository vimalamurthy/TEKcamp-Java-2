package burger_shop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int allowedToppings;
        //main execution of the burger shop goes here.  This is the "entry point" of your application

        printOptions();
        System.out.println("Enter your choice \n");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice){
            case 1:
                Burger burger = new Burger("White", "Sausage");
                allowedToppings = 2;
                for (int i=0; i<2; i++){
                    System.out.println("Enter topping of your choice ");
                    String toppingChoice = scanner.nextLine();
                    burger.addToppings(toppingChoice);
                }
                burger.totalBurgerPrice();
                break;
            case 2:
                HealthyBurger healthyBurger = new HealthyBurger( "Rye");
                allowedToppings = 4;
                for (int i=0; i<4; i++){
                    System.out.println("Enter topping of your choice ");
                    String toppingChoice = scanner.nextLine();
                    healthyBurger.addToppings(toppingChoice);
                }
                healthyBurger.totalBurgerPrice();
                break;
            case 3:
                DeluxeBurger deluxeBurger = new DeluxeBurger("Wheat", "Beef");
                allowedToppings = 6;
                for (int i=0; i<6; i++){
                    System.out.println("Enter topping of your choice ");
                    String toppingChoice = scanner.nextLine();
                    deluxeBurger.addToppings(toppingChoice);
                }
                deluxeBurger.totalBurgerPrice();
                break;
        }

    }
    static void printOptions(){
        System.out.println(" Options \n" +
                            "1. Plain Burger \n" +
                            "2. Healthy Burger \n"+
                            "3. Deluxe Burger \n");
    }
}

/*
        Burger burgerorder  = new Burger("Regular", "White", "Sausage", 3.29);
        Bread bread = new Bread();
        bread.setBread("White");

        Meat meat = new Meat();
        meat.setMeat("Goat");

         Order ord = new Order(burgerorder,bread,meat);

         Meal ml = new Meal("Regular", "White", "Sausage", 3.29);
         ml.setSide("fries");
         ml.setDrink("coke");
         Order ord1 = new Order(ml);
         ord1.addToppings("Tomato","onion","chili");
         ord1.addSides("fries","onion rings");


*/