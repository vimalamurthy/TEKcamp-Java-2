package burger_shop;
import java.util.HashMap;
import java.util.Scanner;

public class Side {
    String Sidename;
    boolean schoice = true;
    String sideyesno;
    int sidechoice;
    String msides;
    private Scanner scanner = new Scanner(System.in);
    HashMap<String, Double> sideitem = new HashMap<String, Double>();

    public HashMap<String, Double> getSideprice() {
        return sideprice;
    }

    public void setSideprice(HashMap<String, Double> sideprice) {
        this.sideprice = sideprice;
    }

    HashMap<String, Double> sideprice = new HashMap<String, Double>();

    public Side()
    {
        sideitem.put("French Fries", 1.80);
        sideitem.put("Onion Rings", 1.10);
        sideitem.put("Chicken Fingers",2.10);
    }
    public void setSide(String sidename)
    {
        this.Sidename = sidename;
    }
    public String getSide()
    {
        return this.Sidename;
    }


    public void DispalysidesOptions(){
        System.out.println(" Sides \n" +
                "1. French Fries, $1.00 \n" +
                "2. Onion Rings, $1.10 \n"+
                "3. Chicken Fingers, $2.10 \n");

        while (schoice)
        {
            //  sidesOptions();
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

                sideprice.put(getSides(sidechoice),sideitem.get(getSides(sidechoice)));
                System.out.println("Do you want to add additional sides (y/n) ");

                sideyesno = scanner.nextLine();
                if (sideyesno.equalsIgnoreCase("y")) {
                    schoice = true;
                }else
                {
                    schoice = false;
                }
            }
            else
            {
                System.out.println("wrong side type");
            }
        }
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
                retSidesType = "Onion Rings";
                break;
            case 3:
                retSidesType = "Chicken Fingers";
                break;
            default:
                break;
        }
        return  retSidesType;
    }
}
