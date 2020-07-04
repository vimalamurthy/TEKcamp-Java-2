package burger_shop;
import java.util.HashMap;
import java.util.Scanner;

public class Burger {

    String name;
    String breadType;

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    String meat;
    double totalBurgerPrice;


    public double getPlainBurgerPrice() {
        return plainBurgerPrice;
    }

    public void setPlainBurgerPrice(double plainBurgerPrice) {
        this.plainBurgerPrice = plainBurgerPrice;
    }

    double plainBurgerPrice;

    public double getTotalBurgerPrice() {
        return totalBurgerPrice;
    }

    public void setTotalBurgerPrice(double totalBurgerPrice) {
        this.totalBurgerPrice = totalBurgerPrice;
    }



    public int getToppingsallowed() {
        return toppingsallowed;
    }

    public void setToppingsallowed(int toppingsallowed) {
        this.toppingsallowed = toppingsallowed;
    }

    int toppingsallowed;
    boolean brgchoice = true;
    int burgerchoice = 0;

    public int getBurgerchoice() {
        return burgerchoice;
    }

    public void setBurgerchoice(int burgerchoice) {
        this.burgerchoice = burgerchoice;
    }


    HashMap<String, Double> burgeritem = new HashMap<String, Double>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    private Scanner scanner = new Scanner(System.in);


    public int getToppingallowed() {
        return toppingsallowed;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public Burger ()
    {
        burgeritem.put("Plain Burger", 2.00);
        burgeritem.put("Healthy Burger", 3.00);
        burgeritem.put("Deluxe Burger", 4.00);

    }

    public Burger(String name, String breadType, String meat) {
        this.name = name;
        this.breadType = breadType;
        this.meat = meat;
    }


    public double plainBurgerPrice(){
        this.setPlainBurgerPrice(burgeritem.get(getBurgerType(burgerchoice)));
        return burgeritem.get(getBurgerType(burgerchoice));
    }

    public void DisplayBurgerType(){
        System.out.println(" Options \n" +
                "1. Plain Burger, $2.00 \n" +
                "2. Healthy Burger, $3.00 \n"+
                "3. Deluxe Burger, $4.00 \n");

        while (brgchoice)
        {
            System.out.println("Enter your Burger Type ");
            burgerchoice = scanner.nextInt();
            scanner.nextLine();

            if (burgerchoice == 1 || burgerchoice == 2 || burgerchoice == 3)
            {
                brgchoice = false;
                this.setBurgerchoice(burgerchoice);
                this.setName(getBurgerType(burgerchoice));
                this.setPlainBurgerPrice(burgeritem.get(getBurgerType(burgerchoice)));
                switch (burgerchoice)
                {
                    case 1: this.setToppingsallowed(2);
                        break;
                    case 2: this.setToppingsallowed(4);
                        break;
                    case 3: this.setToppingsallowed(6);
                        break;
                }

            }
            else
            {
                System.out.println("Wrong Burger Type");
            }
        }
    }

    static String getBurgerType(int choice)
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
                break;
        }
        return  retBurgerType;
    }
    public double totalBurgerPrice(){

        return  this.getTotalBurgerPrice();
    }
}

